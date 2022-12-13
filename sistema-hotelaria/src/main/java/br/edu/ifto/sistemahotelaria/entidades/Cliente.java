package br.edu.ifto.sistemahotelaria.entidades;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cliente {
    private String nome;
    private long id, cpf, fone;
}