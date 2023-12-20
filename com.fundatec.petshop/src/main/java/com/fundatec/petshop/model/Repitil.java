package com.fundatec.petshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "repitil")

public class Repitil  extends TipoAnimal{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,nullable = false)
    private String peconhento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeconhento() {
        return peconhento;
    }

    public void setPeconhento(String peconhento) {
        this.peconhento = peconhento;
    }
}
