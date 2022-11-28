package br.edu.ifto.sistemacompanhiaaerea.entidades;


import javax.persistence.*;

@Entity
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private MarcaAviao marca;




}
