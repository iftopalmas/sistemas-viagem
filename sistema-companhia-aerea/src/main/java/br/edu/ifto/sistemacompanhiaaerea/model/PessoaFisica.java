package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class PessoaFisica extends Pessoa {
    @CPF
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String cpf;

    @NotNull
    @NotBlank
    private LocalDate dataNascimento;
}
