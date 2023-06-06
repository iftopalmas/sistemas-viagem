package br.edu.ifto.sistemalocadoraveiculo.entidades;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

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
  private LocalDate dataNascimento;
}
