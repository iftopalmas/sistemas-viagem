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

import br.edu.ifto.sistemaagenciaviagem.Repository.EstadoRepository;
import br.edu.ifto.sistemaagenciaviagem.entidades.Endereco;
import br.edu.ifto.sistemaagenciaviagem.entidades.Estado;


@RestController
@RequestMapping("estado")
public class EstadoController {
  @Autowired
  private EstadoRepository estadoRepository;

  @GetMapping("/estado")
  public List<Estado> listarEstado() {
      return estadoRepository.findAll();
  }

  @PostMapping()
  public Long criar(@RequestBody Estado estado) {
      estadoRepository.save(estado);
      return estado.getId();
    
  }

  @PutMapping()
  public void update( @RequestBody Estado estado) {
  estadoRepository.save(estado);
  }

@DeleteMapping("/{id}")
public void deletar (@PathVariable Long id){
   estadoRepository.findById(id);
    estadoRepository.deleteById(id);
}
  
}
