package com.fatour.tcc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class UserModalDTO {
    //Payment
    private Long PaymentId;
    private String cvv;
    private String number;
    private String validity;
    private String PaymentName;
    //Excursion
    private String description;
    private String location;
    private LocalDateTime going;
    private LocalDateTime back;
    private BigDecimal price;

    private List<SeatModalDTO> seats;

    public UserModalDTO(Long paymentId, String cvv, String number, String validity, String paymentName, String description, String location, LocalDateTime going, LocalDateTime back, BigDecimal price, List<SeatModalDTO> seats) {
        PaymentId = paymentId;
        this.cvv = cvv;
        this.number = number;
        this.validity = validity;
        PaymentName = paymentName;
        this.description = description;
        this.location = location;
        this.going = going;
        this.back = back;
        this.price = price;
        this.seats = seats;
    }

    public List<SeatModalDTO> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatModalDTO> seats) {
        this.seats = seats;
    }

    public Long getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(Long paymentId) {
        PaymentId = paymentId;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getPaymentName() {
        return PaymentName;
    }

    public void setPaymentName(String paymentName) {
        PaymentName = paymentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
