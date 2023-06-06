package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.FormaPagamento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (collectionResourceRel ="formas-pagamento", path ="formas-pagamento")
public interface FormaPagamentoRepository extends PagingAndSortingRepository <FormaPagamento, Long> {

}
