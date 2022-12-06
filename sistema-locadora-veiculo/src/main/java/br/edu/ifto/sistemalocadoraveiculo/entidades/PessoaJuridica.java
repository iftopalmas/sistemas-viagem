package br.edu.ifto.sistemalocadoraveiculo.entidades;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

@Getter
@Setter
@Entity
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String razaoSocial;

    @CNPJ
    @NotBlank
    @Column(unique = true)
    private String cnpj;

}
