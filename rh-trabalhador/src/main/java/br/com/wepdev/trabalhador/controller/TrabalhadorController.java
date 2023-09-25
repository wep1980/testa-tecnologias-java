package br.com.wepdev.trabalhador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wepdev.trabalhador.model.Trabalhador;
import br.com.wepdev.trabalhador.repository.TrabalhadorRepository;

@RestController
@RequestMapping(value = "/trabalhadores")
public class TrabalhadorController {
	
	@Autowired
	private TrabalhadorRepository repository;

	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> findAll(){
		List<Trabalhador> lista = repository.findAll();
		
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long id){
		Trabalhador obj = repository.findById(id).get();
		
		return ResponseEntity.ok(obj);
	}
}
