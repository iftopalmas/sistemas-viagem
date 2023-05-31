package br.edu.ifto.sistemacompanhiaaerea.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Aviao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    private MarcaAviao marca;

    @NotBlank
    private String modelo;
    @NotBlank
    @Column(unique = true)
    private String prefixo;
    @NotNull
    private int anoFabricacao;
    @NotNull
    @Min(1)
    private int totalAssentos;
}
