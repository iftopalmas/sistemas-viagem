package br.edu.ifto.sistemacompanhiaaerea.repository;

import br.edu.ifto.sistemacompanhiaaerea.model.Voo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "voos", path = "voos")
public interface VooRepository extends PagingAndSortingRepository<Voo, Long> {
        @GetMapping("/numero/{numero}")
        Optional<Voo> findByNumero(@PathVariable String numero);

        @GetMapping("/origem/{aeroportoId}")
        List<Voo> findByAeroportoOrigemId(@PathVariable Long aeroportoId);

        @GetMapping("/destino/{aeroportoId}")
        List<Voo> findByAeroportoDestinoId(@PathVariable Long aeroportoId);

        @GetMapping("/companhia/{companhiaId}")
        List<Voo> findByCompanhiaAereaId(@PathVariable Long companhiaId);

        /** Listar voos para uma determinada data em um determinado aeroporto */
        @GetMapping("/data/{data}/aeroporto/{aeroportoId}")
        List<Voo> findByDataHoraPartidaEsperadaAndAeroportoOrigemId(@PathVariable LocalDateTime dataHoraPartidaEsperada,
                        @PathVariable Long aeroportoId);

        /**
         * Listar voos para uma determinada data em um determinado aeroporto e companhia
         * aérea
         */
        @GetMapping("/data/{data}/aeroporto/{aeroportoId}/companhia/{companhiaId}")
        List<Voo> findByDataHoraPartidaEsperadaAndAeroportoOrigemIdAndCompanhiaAereaId(
                        @PathVariable LocalDateTime dataHoraPartidaEsperada, @Param("aeroportoId") Long aeroportoId,
                        @PathVariable Long companhiaId);

        // Mostrar média de voos que partiram e chegaram no horário para uma companhia
        // aérea
        @Query("""
                            SELECT (SUM(CASE WHEN v.dataHoraPartida <= v.dataHoraPartidaEsperada
                                AND v.dataHoraChegada <= v.dataHoraChegadaEsperada THEN 1 ELSE 0 END) * 100.0) / COUNT(v)
                            FROM Voo v WHERE v.companhiaAerea.id = :companhiaId
                        """)
        Double calcularPercentualVoosPontuaisByCompanhiaAereaId(@PathVariable long companhiaId);

        @Query("""
                        SELECT (SUM(CASE WHEN v.dataHoraPartida <= v.dataHoraPartidaEsperada
                            AND v.dataHoraChegada <= v.dataHoraChegadaEsperada THEN 1 ELSE 0 END) * 100.0) / COUNT(v)
                        FROM Voo v WHERE v.companhiaAerea.id = :companhiaId
                        AND YEAR(v.dataHoraPartidaEsperada) = :ano
                        """)
        Double calcularPercentualVoosPontuaisByCompanhiaAereaIdAndAno(@PathVariable long companhiaId,
                        @PathVariable int ano);

}
