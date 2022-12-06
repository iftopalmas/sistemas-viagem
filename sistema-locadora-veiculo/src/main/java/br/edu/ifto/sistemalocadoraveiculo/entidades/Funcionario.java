package br.edu.ifto.sistemalocadoraveiculo.entidades;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {
  @OneToOne
  private PessoaFisica pessoaFisica;

  private String numeroCarteiraTrabalho;

  public PessoaFisica getPessoaFisica() {
    return pessoaFisica;
  }

  public void setPessoaFisica(PessoaFisica pessoaFisica) {
    this.pessoaFisica = pessoaFisica;
  }

  public String getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }

  public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
    this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
  }
}
