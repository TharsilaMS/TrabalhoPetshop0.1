package com.fundatec.petshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mamifero")
public class Mamifero  extends TipoAnimal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,nullable = false)
    private String raca;

    @Column(nullable = false)
    private Boolean possuePelos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Boolean getPossuePelos() {
        return possuePelos;
    }

    public void setPossuePelos(Boolean possuePelos) {
        this.possuePelos = possuePelos;
    }
}
