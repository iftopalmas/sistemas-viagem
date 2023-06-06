package br.edu.ifto.sistemacompanhiaaerea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Voo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String numero;

    @NotNull
    private LocalDateTime dataHoraPartidaEsperada;

    @NotNull
    private LocalDateTime dataHoraChegadaEsperada;

    @NotNull
    @OneToOne
    private Aviao aviao;

    @NotNull
    @ManyToOne
    private Piloto piloto;

    @ManyToOne @NotNull
    private CompanhiaAerea companhiaAerea;

    @NotNull
    @OneToOne
    private Aeroporto aeroportoOrigem;

    @NotNull
    @OneToOne
    private Aeroporto aeroportoDestino;

    public void setAeroportoOrigem(Aeroporto aeroportoOrigemArg) throws Exception {
        if (this.getAeroportoDestino() != null) {
            if (aeroportoOrigemArg.getCodigoIata().equals(this.getAeroportoDestino().getCodigoIata()))
                throw new IllegalArgumentException("Não foi possivel alterar o aeroporto de origem, pois ele já é o aeroporto de destino");
        }
        this.aeroportoOrigem = aeroportoOrigemArg;
    }

    public void setAeroportoDestino(Aeroporto aeroportoDestinoArg) throws Exception {
        if (this.getAeroportoOrigem() != null) {
            if (aeroportoDestinoArg.getCodigoIata().equals(this.getAeroportoOrigem().getCodigoIata()))
                throw new IllegalArgumentException("Não foi possivel alterar o aeroporto de destino, pois ele já é o aeroporto de origem");
        }
        this.aeroportoDestino = aeroportoDestinoArg;
    }
}
