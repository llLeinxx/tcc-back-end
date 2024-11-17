package com.fatour.tcc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SeatResponseDTO {
    private String seatNumber;

    public SeatResponseDTO() {
    }

    public SeatResponseDTO(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}

