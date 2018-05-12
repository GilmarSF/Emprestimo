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

import br.com.banctec.domain.Juros;
import br.com.banctec.repository.JurosRepository;

@RestController
@RequestMapping(value = "/juros")
public class JurosController {
	
	@Autowired
	JurosRepository jurosRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Juros> Listar() {
		return jurosRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/{id}")
	public ResponseEntity<?> buscarPeloCodigo(@PathVariable Integer id) {

		Optional<Juros> juros = jurosRepository.findById(id);	
	   return juros  == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(juros);
	}
	
	@RequestMapping(method=RequestMethod.POST) 
	public ResponseEntity<Juros> incluirJuros (@RequestBody Juros juros, HttpServletResponse response) {
		Juros jurosSalvo = jurosRepository.save(juros);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(jurosSalvo);	
	}

}
