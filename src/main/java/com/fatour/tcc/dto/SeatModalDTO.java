package com.fatour.tcc.dto;

public class SeatModalDTO {
    private String seatNumber;
    private String cpf;
    private String email;
    private String name;
    private String telephone;

    public SeatModalDTO(String seatNumber, String cpf, String email, String name, String telephone) {
        this.seatNumber = seatNumber;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.telephone = telephone;
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
}
