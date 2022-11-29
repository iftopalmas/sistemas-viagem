package br.edu.ifto.sistemacompanhiaaerea.entidades;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private MarcaAviao marca;

    @NotBlank
    private String modelo;
    @NotBlank
    @Column(unique = true)
    private String prefixo;
    @NotNull
    private int anoFabricacao;
    @NotNull
    @Min(1)
    private int totalAssentos;
}
