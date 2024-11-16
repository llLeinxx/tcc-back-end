package com.fatour.tcc.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SeatResponseDTO {
    private Long id;
    private String seatNumber;
    private String cpf;
    private String email;
    private String name;
    private String telephone;
    private Long excursionId;
    private Long usuarioId;

    private String excursionDescription;

    private String excursionLocation;

    private LocalDateTime excursionGoing;

    private LocalDateTime excursionBack;

    private String excursionImage;

    private String excursionNumberOfSeats;

    private int excursionQuantitySold;

    private BigDecimal excursionPrice;

    public SeatResponseDTO() {
    }

    public SeatResponseDTO(Long id, String seatNumber, String cpf, String email, String name, String telephone, Long excursionId, Long usuarioId, String excursionDescription, String excursionLocation, LocalDateTime excursionGoing, LocalDateTime excursionBack, String excursionImage, String excursionNumberOfSeats, int excursionQuantitySold, BigDecimal excursionPrice) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.telephone = telephone;
        this.excursionId = excursionId;
        this.usuarioId = usuarioId;
        this.excursionDescription = excursionDescription;
        this.excursionLocation = excursionLocation;
        this.excursionGoing = excursionGoing;
        this.excursionBack = excursionBack;
        this.excursionImage = excursionImage;
        this.excursionNumberOfSeats = excursionNumberOfSeats;
        this.excursionQuantitySold = excursionQuantitySold;
        this.excursionPrice = excursionPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getExcursionId() {
        return excursionId;
    }

    public void setExcursionId(Long excursionId) {
        this.excursionId = excursionId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getExcursionDescription() {
        return excursionDescription;
    }

    public void setExcursionDescription(String excursionDescription) {
        this.excursionDescription = excursionDescription;
    }

    public String getExcursionLocation() {
        return excursionLocation;
    }

    public void setExcursionLocation(String excursionLocation) {
        this.excursionLocation = excursionLocation;
    }

    public LocalDateTime getExcursionGoing() {
        return excursionGoing;
    }

    public void setExcursionGoing(LocalDateTime excursionGoing) {
        this.excursionGoing = excursionGoing;
    }

    public LocalDateTime getExcursionBack() {
        return excursionBack;
    }

    public void setExcursionBack(LocalDateTime excursionBack) {
        this.excursionBack = excursionBack;
    }

    public String getExcursionImage() {
        return excursionImage;
    }

    public void setExcursionImage(String excursionImage) {
        this.excursionImage = excursionImage;
    }

    public String getExcursionNumberOfSeats() {
        return excursionNumberOfSeats;
    }

    public void setExcursionNumberOfSeats(String excursionNumberOfSeats) {
        this.excursionNumberOfSeats = excursionNumberOfSeats;
    }

    public int getExcursionQuantitySold() {
        return excursionQuantitySold;
    }

    public void setExcursionQuantitySold(int excursionQuantitySold) {
        this.excursionQuantitySold = excursionQuantitySold;
    }

    public BigDecimal getExcursionPrice() {
        return excursionPrice;
    }

    public void setExcursionPrice(BigDecimal excursionPrice) {
        this.excursionPrice = excursionPrice;
    }
}
