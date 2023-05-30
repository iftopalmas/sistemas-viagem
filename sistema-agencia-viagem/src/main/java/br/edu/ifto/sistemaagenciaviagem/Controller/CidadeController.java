package br.edu.ifto.sistemaagenciaviagem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import br.edu.ifto.sistemaagenciaviagem.Repository.CidadeRepository;
import br.edu.ifto.sistemaagenciaviagem.entidades.Cidade;




@RestController
@RequestMapping("cidade")
public class CidadeController {
  @Autowired
  private CidadeRepository cidadeRepository;

  @GetMapping("/cidades")
  public List<Cidade> listarCidade() {
      return cidadeRepository.findAll();
  }

  @PostMapping()
  public Long criar(@RequestBody Cidade cidade) {
      cidadeRepository.save(cidade);
      return cidade.getId();
    
  }

  @PutMapping()
  public void update( @RequestBody Cidade cidade) {
      cidadeRepository.save(cidade);
  }

@DeleteMapping("/{id}")
public void deletar (@PathVariable Long id){
    cidadeRepository.findById(id);
    cidadeRepository.deleteById(id);
}
  
  

  
}
