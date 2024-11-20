package com.fatour.tcc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class UserModalDTO {
    //Usuario
    private Long usuarioId;
    //Seat
    private String seatNumber;
    private String cpf;
    private String email;
    private String name;
    private String telephone;
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
    private String image;
    private String numberOfSeats;
    private int quantitySold;
    private BigDecimal price;

    public UserModalDTO(Long usuarioId, String seatNumber, String cpf, String email, String name, String telephone, Long paymentId, String cvv, String number, String validity, String paymentName, String description, String location, LocalDateTime going, LocalDateTime back, String image, String numberOfSeats, int quantitySold, BigDecimal price) {
        this.usuarioId = usuarioId;
        this.seatNumber = seatNumber;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.telephone = telephone;
        PaymentId = paymentId;
        this.cvv = cvv;
        this.number = number;
        this.validity = validity;
        PaymentName = paymentName;
        this.description = description;
        this.location = location;
        this.going = going;
        this.back = back;
        this.image = image;
        this.numberOfSeats = numberOfSeats;
        this.quantitySold = quantitySold;
        this.price = price;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
