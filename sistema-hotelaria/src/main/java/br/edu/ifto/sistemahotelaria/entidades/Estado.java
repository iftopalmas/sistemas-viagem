package br.edu.ifto.sistemahotelaria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estado {

    @Id
    private Long id;
    private String nome;
    private String uf;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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
