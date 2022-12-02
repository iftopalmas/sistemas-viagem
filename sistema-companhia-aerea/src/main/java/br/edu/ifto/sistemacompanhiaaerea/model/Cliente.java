package br.edu.ifto.sistemacompanhiaaerea.model;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String telefone;

    @Column(unique = true)
    @Email
    @NotNull
    @NotBlank
    private String email;

    @ManyToOne
    private ContatoSeguranca contatoSeguranca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContatoSeguranca getContatoSeguranca() {
        return contatoSeguranca;
    }

    public void setContatoSeguranca(ContatoSeguranca contatoSeguranca) {
        this.contatoSeguranca = contatoSeguranca;
    }
}
