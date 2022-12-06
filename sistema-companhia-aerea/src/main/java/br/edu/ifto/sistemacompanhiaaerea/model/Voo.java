package br.edu.ifto.sistemacompanhiaaerea.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @NotNull
    @OneToOne
    private Aeroporto aeroportoOrigem;

    @NotNull
    @OneToOne
    private Aeroporto aeroportoDestino;

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
