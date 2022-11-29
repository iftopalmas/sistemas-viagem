package br.edu.ifto.sistemacompanhiaaerea;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.edu.ifto.sistemacompanhiaaerea.entidades.Aviao;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Voo {
    
    @NotBlank
    @Column(unique = true)
    private String numero;
    
    @NotNull
    private LocalDateTime dataHoraPartidaEsperada;
    
    @NotNull
    private LocalDateTime dataHoraChegadaEsperada;

    @NotNull

    private Aviao aviao;
    
    // @NotNull
    // private Piloto piloto;
    // TODO: Depende de #51

    // @NotNull
    // private Aeroporto aeroportoOrigem;

    // @NotNull
    // private Aeroporto aeroportoDestino;
    // TODO: Depende de #52
    

}
