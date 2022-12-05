package br.edu.ifto.sistemacompanhiaaerea.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
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
