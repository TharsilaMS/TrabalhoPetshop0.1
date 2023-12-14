package com.fundatec.petshop.com.fundatec;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_animal")
public class TipoAnimal {

    private String especies;
}
