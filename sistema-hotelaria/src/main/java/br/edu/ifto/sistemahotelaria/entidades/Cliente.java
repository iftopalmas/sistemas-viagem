package br.edu.ifto.sistemahotelaria.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Cliente {
    private String nome;
    private long id, cpf, fone;
}
