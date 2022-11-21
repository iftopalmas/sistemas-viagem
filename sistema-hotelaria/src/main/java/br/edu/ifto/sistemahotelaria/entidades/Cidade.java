package br.edu.ifto.sistemahotelaria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cidade {
    @Id
    private Long id;
    private String nome;
    private Long estado_id;

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

    public Long getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Long estado_id) {
        this.estado_id = estado_id;
    }
}
