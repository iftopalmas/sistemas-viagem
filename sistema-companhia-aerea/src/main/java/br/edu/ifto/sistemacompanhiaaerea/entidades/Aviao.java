package br.edu.ifto.sistemacompanhiaaerea.entidades;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private MarcaAviao marca;

    @NotBlank
    private String modelo;
    @Column(unique = true)
    private String prefixo;
    private int anoFabricacao;
    private int totalAssentos;
}
