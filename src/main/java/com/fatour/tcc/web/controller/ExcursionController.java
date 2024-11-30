package com.fatour.tcc.web.controller;


import com.fatour.tcc.dto.ExcursionDTO;
import com.fatour.tcc.dto.PaymentDTO;
import com.fatour.tcc.dto.SeatDTO;
import com.fatour.tcc.dto.SeatResponseDTO;
import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.entity.Payment;
import com.fatour.tcc.service.ExcursionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/excursions")
//@CrossOrigin(origins = "https://fatour.netlify.app")
@CrossOrigin(origins = {"http://127.0.0.1:8080", "https://fatour.netlify.app"})
public class ExcursionController {

    private final ExcursionService excursionService;


    public ExcursionController(ExcursionService excursionService) {
        this.excursionService = excursionService;
    }

    @PostMapping
    public ResponseEntity<Excursion> insert(@RequestBody ExcursionDTO excursionDTO) {
        Excursion excursion = excursionService.insert(excursionDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(excursion);
    }

    @GetMapping
    public ResponseEntity<List<Excursion>> findAll() {
        List<Excursion> excursions = excursionService.findAll();
        return ResponseEntity.ok(excursions);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Excursion> delete(@PathVariable Long id) {
        excursionService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Excursion> findById(@PathVariable Long id) {
        Excursion excursion = excursionService.findById(id);
        return ResponseEntity.ok(excursion);
    }

    @PostMapping("/payment")
    public ResponseEntity<Void> savePayment(@RequestBody PaymentDTO paymentDTO) {
        excursionService.savePayment(paymentDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/payment/{id}")
    public ResponseEntity<Payment> findByIdPayment(@PathVariable Long id) {
        Payment payment = excursionService.findByIdPayment(id);
        return ResponseEntity.ok(payment);
    }

    @GetMapping("/{usuarioId}/payment")
    public ResponseEntity<List<Payment>> findPaymentByUsuarioId(@PathVariable Long usuarioId) {
        List<Payment> payments = excursionService.findPaymentByUsuarioId(usuarioId);
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/{excursionId}/seat")
    public ResponseEntity<List<SeatDTO>> findSeatByExcursionId(@PathVariable Long excursionId) {
        List<SeatDTO> seats = excursionService.findSeatByExcursionId(excursionId);
        return ResponseEntity.ok(seats);
    }

    @GetMapping("/{excursionId}/seatNumber")
    public List<SeatResponseDTO> findSeatNumberByExcursionId(@PathVariable Long excursionId) {
        return excursionService.findSeatNumberByExcursionId(excursionId);
    }

}
