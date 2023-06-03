package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Locadora;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface LocadoraRepository extends JpaRepository<Locadora, Long> {
    List<Locadora> findLocadorasByEndereco_Cidade_Id(Long idCidade);
    List<Locadora> findLocadorasByCodigoIataAeroporto(String codIataAeroporto);

}
/**
 *
 * A biblioteca Spring Data REST permite implementar automaticamente:
 * o acesso ao BD (a partir de uma interface Repository criada por você) e
 * a classe Rest Resource que conterá os métodos para gerenciar Cliente a
 * partir de uma API Web.
 *
 * No entanto, como nosso repositório de pilotos precisa de métodos personalizados,
 * não sei se é possível indicar com Spring Data REST que desejamos usar um Repository
 * que nós criamos (criar no pacote repositories). Veja a melhor opção.
 *
 * A API deve fornecer métodos para a classe Locadora que permita:
 *
 * - Encontrar as locadoras pelo ID da cidade - OK
 * - Encontrar locadora pelo código IATA do aeroporto (somente agências em aeroportos tem este código) - OK
 * - Cadastrar, Alterar e Excluir locadora - JÁ É IMPLEMENTADO PELA INTERFACE JpaRepository.
 *
 */
