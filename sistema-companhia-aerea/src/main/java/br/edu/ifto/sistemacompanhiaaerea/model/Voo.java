package br.edu.ifto.sistemacompanhiaaerea.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

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

    @NotNull
    private LocalDateTime dataHoraPartida;

    @NotNull
    private LocalDateTime dataHoraChegada;

    public void setAeroportoOrigem(Aeroporto aeroportoOrigemArg) throws Exception {
        if (this.getAeroportoDestino() != null) {
            if (aeroportoOrigemArg.getCodigoIata().equals(this.getAeroportoDestino().getCodigoIata()))
                throw new Exception("[ERRO] : Não foi possivel alterar o aeroporto de origem, pois ele já é o aeroporto de destino");
        }
        this.aeroportoOrigem = aeroportoOrigemArg;
    }

    public void setAeroportoDestino(Aeroporto aeroportoDestinoArg) throws Exception {
        if (this.getAeroportoOrigem() != null) {
            if (aeroportoDestinoArg.getCodigoIata().equals(this.getAeroportoOrigem().getCodigoIata()))
                throw new Exception("[ERRO] : Não foi possivel alterar o aeroporto de destino, pois ele já é o aeroporto de origem");
        }
        this.aeroportoDestino = aeroportoDestinoArg;
    }
}
