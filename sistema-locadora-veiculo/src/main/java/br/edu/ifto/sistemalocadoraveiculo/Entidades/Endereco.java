package br.edu.ifto.sistemalocadoraveiculo.Entidades;

import javax.persistence.Id;

public class Endereco {
    @Id
    private Long id;

    private String logradouro;
}