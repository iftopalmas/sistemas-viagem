package br.edu.ifto.sistemalocadoraveiculo.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

@Getter
@Setter
@Entity
public class PessoaJuridica extends Pessoa{
    @NotBlank
    private String razaoSocial;

    @CNPJ
    @NotBlank
    @Column(unique = true)
    private String cnpj;

}
