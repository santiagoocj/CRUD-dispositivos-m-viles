package com.dispositivosmoviles.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dispositivosmoviles.entity.PersonaEntity;
import com.dispositivosmoviles.repository.PersonaRepository;

@Service("PersonaServiceImpl")
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository personaRepository;
	

	@Override
	public void craer(PersonaEntity personaEntity) {
		personaRepository.save(personaEntity);
	}

	@Override
	public ResponseEntity<?> editarPersona(Long idPersona, PersonaEntity personaEntity) {
		Map<String, Object> response = new HashMap<String, Object>();
		PersonaEntity persona = personaRepository.findById(idPersona).orElse(null);
		if(persona == null) {
			response.put("error", "la persona con id " + idPersona + " No existe en la base de datos");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		} else {
			persona = personaEntity;
			response.put("mensaje", "se a actualizado correctamente la persona con id: " + idPersona);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
		}
		
		
	}

	@Override
	public void elimiar(Long idPersona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonaEntity> listar() {
		return personaRepository.findAll();
	}

}
