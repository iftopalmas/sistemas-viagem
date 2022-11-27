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
    private Long  id;

    @Column(unique = true)
    @CPF
    @NotNull
    @NotBlank
    private String cpf;

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @NotBlank
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    @NotNull
    @NotBlank
    private Endereco endereco;

    @NotNull
    @NotBlank
    private String telefone;

    @Column(unique = true)
    @Email
    @NotNull
    @NotBlank
    private String email;

    @ManyToOne
    @JoinColumn(name = "contato_seguranca_id")
    private ContatoSeguranca contatoSeguranca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
