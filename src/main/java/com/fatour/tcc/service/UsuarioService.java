package com.fatour.tcc.service;

import com.fatour.tcc.dto.*;
import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.entity.Payment;
import com.fatour.tcc.entity.Seat;
import com.fatour.tcc.entity.Usuario;
import com.fatour.tcc.reporitory.ExcursionRepository;
import com.fatour.tcc.reporitory.PaymentRepository;
import com.fatour.tcc.reporitory.SeatRepository;
import com.fatour.tcc.reporitory.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private  UsuarioRepository usuarioRepository;
    @Autowired
    private ExcursionRepository excursionRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public Usuario insert(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setUseremail(usuarioDTO.getUseremail());
        usuario.setPassword(bCryptPasswordEncoder.encode(usuarioDTO.getPassword()));
        usuario.setRole(usuarioDTO.getRole());

        return usuarioRepository.save(usuario);
    }

    public UsuarioLoginResponseDTO login(UsuarioLoginRequestDTO usuarioLoginRequestDTO) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByUseremail(usuarioLoginRequestDTO.getUseremail());
        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            if (bCryptPasswordEncoder.matches(usuarioLoginRequestDTO.getPassword(), usuario.getPassword())){
                return new UsuarioLoginResponseDTO(usuario.getId(),"Login successfull");
            }
        }
        return new UsuarioLoginResponseDTO(null,"Login failed");
    }

    public List<Seat> findSeatByUsuarioId(Long usuarioId) {
        return seatRepository.findByUsuario(usuarioId);
    }


    public List<UserDetailsDTO> getPaymentDetailsByUser (Long usuarioId) {

        return usuarioRepository.findById(usuarioId)
                .map(usuario -> usuario.getPayments().stream()
                        .map(payment -> {
                            Excursion excursion = payment.getExcursion();

                            if (excursion == null) {
                                return null;
                            }

                            return new UserDetailsDTO(
                                    payment.getId(),
                                    payment.getDate().toLocalDate(),
                                    excursion.getLocation(),
                                    excursion.getGoing(),
                                    excursion.getBack()
                            );
                        })
                        .filter(dto -> dto != null)
                        .collect(Collectors.toList()))
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

}
