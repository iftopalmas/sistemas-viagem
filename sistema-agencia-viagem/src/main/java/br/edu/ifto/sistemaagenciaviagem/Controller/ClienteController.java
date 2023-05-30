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

import br.edu.ifto.sistemaagenciaviagem.Repository.ClienteRepository;
import br.edu.ifto.sistemaagenciaviagem.entidades.Cidade;
import br.edu.ifto.sistemaagenciaviagem.entidades.Cliente;


@RestController
@RequestMapping("cliente")
public class ClienteController {
  @Autowired
  private ClienteRepository  clienteRepository;

  @GetMapping("/clientes")
  public List<Cliente> listarClientes() {
      return clienteRepository.findAll();
  }

  @PostMapping()
  public Long criar(@RequestBody Cliente cliente) {
      clienteRepository.save(cliente);
      return cliente.getId();
    
  }

  @PutMapping()
  public void update( @RequestBody Cliente cliente) {
    clienteRepository.save(cliente);
  }

@DeleteMapping("/{id}")
public void deletar (@PathVariable Long id){
    clienteRepository.findById(id);
    clienteRepository.deleteById(id);
}
  
}
