package br.edu.ifto.sistemalocadoraveiculo.repositories;

import br.edu.ifto.sistemalocadoraveiculo.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (collectionResourceRel ="reservas", path ="reservas")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long>, JpaRepository<Funcionario, Long> {

}
