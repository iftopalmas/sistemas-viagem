package br.edu.ifto.sistemacompanhiaaerea;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.edu.ifto.sistemacompanhiaaerea.entidades.Aviao;
import br.edu.ifto.sistemacompanhiaaerea.model.entity.Aeroporto;
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

    @NotNull
    private Aeroporto aeroportoOrigem;
    
    @NotNull
    private Aeroporto aeroportoDestino;
    
    public void setAeroportoOrigem(Aeroporto aeroportoOrigemArg) throws Exception{
        if(this.getAeroportoDestino()!=null)
        {
            if(aeroportoOrigemArg.getCodigoIata().equals(this.getAeroportoDestino().getCodigoIata()))
                throw new Exception("[ERRO] : Não foi possivel alterar o aeroporto de origem, pois ele já é o aeroporto de destino");
        }
        this.aeroportoOrigem = aeroportoOrigemArg;
    }
    
    public void setAeroportoDestino(Aeroporto aeroportoDestinoArg) throws Exception{
        if(this.getAeroportoOrigem()!=null)
        {
            if(aeroportoDestinoArg.getCodigoIata().equals(this.getAeroportoOrigem().getCodigoIata()))
                throw new Exception("[ERRO] : Não foi possivel alterar o aeroporto de destino, pois ele já é o aeroporto de origem");
        }
        this.aeroportoDestino = aeroportoDestinoArg;
    }
}
