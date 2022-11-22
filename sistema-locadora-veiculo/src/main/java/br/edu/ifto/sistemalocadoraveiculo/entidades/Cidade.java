package br.edu.ifto.sistemalocadoraveiculo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}