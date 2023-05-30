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

import br.edu.ifto.sistemaagenciaviagem.Repository.EnderecoRepository;
import br.edu.ifto.sistemaagenciaviagem.entidades.Endereco;


@RestController
@RequestMapping("endereco")
public class EnderecoController {
  @Autowired
  private EnderecoRepository enderecoRepository;

  @GetMapping("/enderecos")
  public List<Endereco> listarEndereco() {
      return enderecoRepository.findAll();
  }

  @PostMapping()
  public Long criar(@RequestBody Endereco endereco) {
      enderecoRepository.save(endereco);
      return endereco.getId();
    
  }

  @PutMapping()
  public void update( @RequestBody Endereco endereco) {
   enderecoRepository.save(endereco);
  }

@DeleteMapping("/{id}")
public void deletar (@PathVariable Long id){
   enderecoRepository.findById(id);
    enderecoRepository.deleteById(id);
}
  
}
