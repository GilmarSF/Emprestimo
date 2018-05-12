package br.com.banctec.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.banctec.domain.Cliente;
import br.com.banctec.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Cliente> Listar() {
		return clienteRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/{id}")
	public ResponseEntity<?> buscarPeloCodigo(@PathVariable Integer id) {

		Optional<Cliente> cliente = clienteRepository.findById(id);	
	   return cliente  == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(cliente);
	}
	
	@RequestMapping(method=RequestMethod.POST) 
	public ResponseEntity<Cliente> incluirCliente (@RequestBody Cliente cliente, HttpServletResponse response) {
		Cliente clienteSalvo = clienteRepository.save(cliente);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);	
	}

}
