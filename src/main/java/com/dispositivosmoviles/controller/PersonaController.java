package com.dispositivosmoviles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dispositivosmoviles.entity.PersonaEntity;
import com.dispositivosmoviles.service.PersonaService;

@RestController
@RequestMapping("/api")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/persona")
	public List<PersonaEntity> listar(){
		return personaService.listar();
	}
	
	@PostMapping("/persona")
	public void registrar(@RequestBody PersonaEntity personaEntity){
		if(personaEntity != null) {
			personaService.craer(personaEntity);
		}
	}
	
	@PutMapping("/persona/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody PersonaEntity personaEntity){
		return personaService.editarPersona(id, personaEntity);
	}
	
	@DeleteMapping("/persona/{id}")
	public void eliminar(@PathVariable Long id) {
		personaService.elimiar(id);
	}

}
