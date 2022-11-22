package br.edu.ifto.sistemalocadoraveiculo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cidade {
    @Id
    private Long id;
    private String nome;
    private String uf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
