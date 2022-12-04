package br.edu.ifto.sistemaagenciaviagem.entidades;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String uf;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;
}