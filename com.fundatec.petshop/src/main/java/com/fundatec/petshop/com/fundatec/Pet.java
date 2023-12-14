package com.fundatec.petshop.com.fundatec;

import jakarta.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome ;
    @Column
    private Integer idade;

}
