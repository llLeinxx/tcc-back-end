package com.fatour.tcc.service;

import com.fatour.tcc.dto.ExcursionDTO;
import com.fatour.tcc.dto.PaymentDTO;
import com.fatour.tcc.dto.SeatDTO;
import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.entity.Payment;
import com.fatour.tcc.entity.Seat;
import com.fatour.tcc.entity.Usuario;
import com.fatour.tcc.reporitory.ExcursionRepository;
import com.fatour.tcc.reporitory.PaymentRepository;
import com.fatour.tcc.reporitory.SeatRepository;
import com.fatour.tcc.reporitory.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;

@Service
public class ExcursionService {

    @Autowired
    private ExcursionRepository excursionRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Excursion insert(ExcursionDTO excursionDTO) {
        Excursion excursion = new Excursion();
        excursion.setDescription(excursionDTO.getDescription());
        excursion.setLocation(excursionDTO.getLocation());
        excursion.setGoing(excursionDTO.getGoing());
        excursion.setBack(excursionDTO.getBack());

        String base64Image = excursionDTO.getImage();
        int paddingCount = 4 - (base64Image.length() % 4);
        if (paddingCount < 4) {
            for (int i = 0; i < paddingCount; i++) {
                base64Image += "=";
            }
        }
        excursion.setImage(Base64.getDecoder().decode(excursionDTO.getImage()));
        excursion.setNumberOfSeats(excursionDTO.getNumberOfSeats());
        excursion.setQuantitySold(0);
        excursion.setPrice(excursionDTO.getPrice());

        return excursionRepository.save(excursion);
    }

    public List<Excursion> findAll() {
        return excursionRepository.findAll();
    }

    public void delete(Long id) {
        excursionRepository.deleteById(id);
    }

    public Excursion findById(Long id) {
        return excursionRepository.findById(id).get();
    }

    public Payment findByIdPayment(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Transactional
    public void savePayment(PaymentDTO paymentDTO) {
        Excursion excursion = excursionRepository.findById(paymentDTO.getExcursionId()).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
        Usuario usuario = usuarioRepository.findById(paymentDTO.getUsuarioId()).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        LocalDateTime dataHoraAtual = LocalDateTime.now();

        Payment payment = new Payment();

        payment.setCvv(paymentDTO.getCvv());
        payment.setExcursion(excursion);
        payment.setNumber(paymentDTO.getNumber());
        payment.setValidity(paymentDTO.getValidity());
        payment.setName(paymentDTO.getName());
        payment.setUsuario(usuario);
        payment.setDate(dataHoraAtual);
        paymentRepository.save(payment);

        for (SeatDTO assentoDTO : paymentDTO.getSeats()) {
            if (seatRepository.existsByExcursionAndSeatNumber(excursion, assentoDTO.getSeatNumber())) {
                throw new RuntimeException("Cadeira " + assentoDTO.getSeatNumber() + " já está ocupada para este evento");
            }
        }
        List<SeatDTO> seatsDTO = paymentDTO.getSeats();
        for (SeatDTO seatDTO : seatsDTO) {
            Seat seat = new Seat();
            seat.setSeatNumber(seatDTO.getSeatNumber());
            seat.setCpf(seatDTO.getCpf());
            seat.setEmail(seatDTO.getEmail());
            seat.setName(seatDTO.getName());
            seat.setTelephone(seatDTO.getTelephone());
            seat.setExcursion(excursion);
            seat.setUsuario(usuario);
            seatRepository.save(seat);
        }
    }
}
