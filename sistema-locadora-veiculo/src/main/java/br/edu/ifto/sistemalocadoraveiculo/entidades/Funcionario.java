package br.edu.ifto.sistemalocadoraveiculo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {
  @OneToOne
  @JoinColumn(name = "id_pessoa_fisica")
  private PessoaFisica pessoaFisica;

  @Column
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
