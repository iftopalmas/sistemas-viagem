package br.edu.ifto.sistemalocadoraveiculo.entidades;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class PessoaJuridica  extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String razaoSocial;

    @CNPJ
    @NotBlank
    @Column(unique = true)
    private String cnpj;

}
