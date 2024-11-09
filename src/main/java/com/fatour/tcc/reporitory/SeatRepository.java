package com.fatour.tcc.reporitory;

import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    boolean existsByExcursionAndSeatNumber(Excursion excursion, String numberSeat);

    List<Seat> findByExcursion(Excursion excursion);
}
