package com.fundatec.petshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20,nullable = false)
    private Integer valor;

    @Column(length = 20,nullable = false)
    private String descricao;


}
