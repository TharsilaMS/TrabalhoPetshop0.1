package com.fundatec.petshop.com.fundatec;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mamifero")
public class Mamifero {
    private String raca;
    private Boolean possuePelos;

}
