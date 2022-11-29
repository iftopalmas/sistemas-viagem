package br.edu.ifto.sistemalocadoraveiculo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getters;
import lombok.Setters;

@Getters
@Setters
@Entity
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nome;
    
    private int cnpj;

}
