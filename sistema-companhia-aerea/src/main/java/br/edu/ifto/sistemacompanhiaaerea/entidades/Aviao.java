package br.edu.ifto.sistemacompanhiaaerea.entidades;


import javax.persistence.*;

@Entity
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private MarcaAviao marca;

    private String modelo;
    @Column(unique = true)
    private String prefixo;
    private int anoFabricacao;




}
