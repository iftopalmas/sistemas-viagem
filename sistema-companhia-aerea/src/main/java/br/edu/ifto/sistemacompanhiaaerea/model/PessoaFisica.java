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
public class PessoaFisica extends Pessoa {
    @CPF
    @NotNull
    @NotBlank
    @Getter
    @Setter
    @Column(unique = true)
    private String cpf;

    @NotNull
    @NotBlank
    @Getter
    @Setter
    private LocalDate dataNascimento;
}
