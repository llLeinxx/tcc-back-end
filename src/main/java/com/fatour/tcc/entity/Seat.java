package com.fatour.tcc.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "seatNumber")
    private int seatNumber;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "telephone")
    private String telephone;

    @ManyToOne
    @JoinColumn(name = "excursion_id", nullable = false)
    private Excursion excursion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Seat() {
    }

    public Seat(Long id, int seatNumber, String cpf, String email, String name, String telephone, Excursion excursion, Usuario usuario) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.telephone = telephone;
        this.excursion = excursion;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(id, seat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                '}';
    }
}
