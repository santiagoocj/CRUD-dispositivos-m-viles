package com.dispositivosmoviles.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.dispositivosmoviles.entity.PersonaEntity;

public interface PersonaService {
	
	public List<PersonaEntity> listar();
	
	public void craer(PersonaEntity personaEntity);
	
	public ResponseEntity<?> editarPersona(Long idPersona, PersonaEntity personaEntity);
	
	public void elimiar(Long idPersona);

}
