package com.fatour.tcc.reporitory;

import com.fatour.tcc.dto.UserDetailsDTO;
import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.entity.Payment;
import com.fatour.tcc.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByUsuario(Usuario usuario);

}
