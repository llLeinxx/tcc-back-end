package com.fatour.tcc.dto;

public class SeatDTO {

    private Long id;
    private String seatNumber;
    private String cpf;
    private String email;
    private String name;
    private String telephone;
    private Long excursionId;
    private Long usuarioId;


    public SeatDTO() {
    }

    public SeatDTO(Long id, String seatNumber, String cpf, String email, String name, String telephone, Long excursionId, Long usuarioId) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.telephone = telephone;
        this.excursionId = excursionId;
        this.usuarioId = usuarioId;
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
}
