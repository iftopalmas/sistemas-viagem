package br.edu.ifto.sistemacompanhiaaerea.entidades;

import javax.persistence.*;

@Entity
public class MarcaAviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String descricao
}
