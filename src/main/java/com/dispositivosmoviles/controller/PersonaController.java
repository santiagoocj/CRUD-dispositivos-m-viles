package com.dispositivosmoviles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
