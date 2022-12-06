package br.edu.ifto.sistemaagenciaviagem.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Data
@Getter
@Setter
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;

    @ManyToOne(cascade = CascadeType.ALL)
    private Estado estado;

}
