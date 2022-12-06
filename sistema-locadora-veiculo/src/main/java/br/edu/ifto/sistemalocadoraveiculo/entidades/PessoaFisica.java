package br.edu.ifto.sistemalocadoraveiculo.entidades;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}
