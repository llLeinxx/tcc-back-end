package com.fatour.tcc.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDetailsDTO {
    //Payment
    private Long PaymentId;
    private LocalDate date;
    //Excursion
    private String location;
    private LocalDateTime going;
    private LocalDateTime back;


    public UserDetailsDTO(Long paymentId, LocalDate date, String location, LocalDateTime going, LocalDateTime back) {
        PaymentId = paymentId;
        this.date = date;
        this.location = location;
        this.going = going;
        this.back = back;
    }


    public Long getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(Long paymentId) {
        PaymentId = paymentId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getGoing() {
        return going;
    }

    public void setGoing(LocalDateTime going) {
        this.going = going;
    }

    public LocalDateTime getBack() {
        return back;
    }

    public void setBack(LocalDateTime back) {
        this.back = back;
    }
}
