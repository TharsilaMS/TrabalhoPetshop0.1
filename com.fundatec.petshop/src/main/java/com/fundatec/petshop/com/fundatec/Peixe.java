package com.fundatec.petshop.com.fundatec;

import jakarta.persistence.*;

@Entity
@Table(name = "peixe")
public class Peixe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoAgua;
}
