package com.fatour.tcc.reporitory;

import com.fatour.tcc.dto.SeatDTO;
import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    boolean existsByExcursionAndSeatNumber(Excursion excursion, String numberSeat);

    @Query("SELECT new com.fatour.tcc.dto.SeatDTO(s.id, s.seatNumber, s.cpf, s.email, s.name, s.telephone, s.excursion.id, s.usuario.id) " + "FROM Seat s WHERE s.excursion.id = :excursionId")
    List<SeatDTO> findByExcursion(@Param("excursionId") Long excursionId);

    @Query("SELECT new com.fatour.tcc.dto.SeatDTO(s.id, s.seatNumber, s.cpf, s.email, s.name, s.telephone, s.excursion.id, s.usuario.id) " + "FROM Seat s WHERE s.usuario.id = :usuarioId")
    List<SeatDTO> findByUsuario(@Param("usuarioId") Long usuarioId);
}
