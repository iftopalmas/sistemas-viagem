package br.edu.ifto.sistemacompanhiaaerea.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Aeroporto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(unique = true)
    private String nome;
    @ManyToOne
    @NotNull
    private Cidade cidade;
    @NotBlank
    @Column(unique = true)
    @NotBlank
    private String codigoIata;

    public String getCodigoIata() {
        return codigoIata;
    }
}
