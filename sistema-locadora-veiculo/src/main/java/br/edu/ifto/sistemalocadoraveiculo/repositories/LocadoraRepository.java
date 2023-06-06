package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Locadora;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;
@RepositoryRestResource(collectionResourceRel = "locadoras", path = "locadoras")
public interface LocadoraRepository extends PagingAndSortingRepository<Locadora, Long> {
    List<Locadora> findLocadorasByEndereco_Cidade_Id(Long idCidade);
    List<Locadora> findLocadorasByCodigoIataAeroporto(String codIataAeroporto);
    @Modifying
    @Query("delete from Locadora l where l.id = 2")
    public void deleteLocadora(Locadora locadora, Long id);
    @Modifying
    @Query("update Locadora l set l.matriz = ?1, l.codigoIataAeroporto = ?2 where l.id = ?2")
    public void updateLocadora(Boolean matriz,String codigoIataAeroporto, Long id);
    Locadora  save(Locadora locadora);

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
