package com.fatour.tcc.entity;


import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "excursions")
@EntityListeners(AuditingEntityListener.class)
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "going", nullable = false)
    private LocalDateTime going;

    @Column(name = "back", nullable = false)
    private LocalDateTime back;

    @Column(name = "image", nullable = false)
    private byte[] image;

    @Column(name = "numberOfSeats", nullable = false)
    private int numberOfSeats;

    @Column(name = "quantitySold", nullable = false)
    private int quantitySold;

    public Excursion() {
    }

    public Excursion(Long id, String description, String location, LocalDateTime going, LocalDateTime back, byte[] image, int numberOfSeats, int quantitySold) {
        this.id = id;
        this.description = description;
        this.location = location;
        this.going = going;
        this.back = back;
        this.image = image;
        this.numberOfSeats = numberOfSeats;
        this.quantitySold = quantitySold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Excursion excursion = (Excursion) o;
        return Objects.equals(id, excursion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "id=" + id +
                '}';
    }
}
