package com.fundatec.petshop.com.fundatec;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.DateTimeException;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "atendimento")
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column(name = "nome_atendente")
    private String nomeAtendente;

    @Column(name = "pagamento_efetuado")
    private Boolean pagamentoEfetuado;

    @Column(name = "valor_consulta")
    private Integer valorConsulta;

    @Column
    private String estado;



}
