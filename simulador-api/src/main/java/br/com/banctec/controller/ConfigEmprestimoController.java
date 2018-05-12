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

import br.com.banctec.domain.ConfigEmprestimo;
import br.com.banctec.domain.Juros;
import br.com.banctec.repository.ConfigEmprestimoRepository;
import br.com.banctec.repository.JurosRepository;

@RestController
@RequestMapping(value = "/config")
public class ConfigEmprestimoController {
	
	@Autowired
	ConfigEmprestimoRepository configEmprestimoRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<ConfigEmprestimo> Listar() {
		return configEmprestimoRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/{id}")
	public ResponseEntity<?> buscarPeloCodigo(@PathVariable Integer id) {

		Optional<ConfigEmprestimo> configEmprestimo = configEmprestimoRepository.findById(id);	
	   return configEmprestimo  == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(configEmprestimo);
	}
	
	@RequestMapping(method=RequestMethod.POST) 
	public ResponseEntity<ConfigEmprestimo> incluirConfiguracao (@RequestBody ConfigEmprestimo configEmprestimo, HttpServletResponse response) {
		ConfigEmprestimo configSalvo = configEmprestimoRepository.save(configEmprestimo);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(configSalvo);	
	}

}
