package com.fatour.tcc.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cvv")
    private String cvv;

    @ManyToOne
    private Excursion excursion;

    @Column(name = "number")
    private String number;

    @Column (name = "validity")
    private String validity;

    @Column(name = "name")
    private String paymentName;

    @ManyToOne
    private Usuario usuario;

    @JoinColumn(name = "date")
    private LocalDateTime date;

    public Payment() {
    }

    public Payment(Long id, String cvv, Excursion excursion, String number, String validity, String paymentName, Usuario usuario, LocalDateTime date) {
        this.id = id;
        this.cvv = cvv;
        this.excursion = excursion;
        this.number = number;
        this.validity = validity;
        this.paymentName = paymentName;
        this.usuario = usuario;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
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
        return paymentName;
    }

    public void setPaymentName(String name) {
        this.paymentName = name;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime data) {
        this.date = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                '}';
    }
}
