package com.dispositivosmoviles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dispositivosmoviles.entity.PersonaEntity;

@Repository("PersonaRepository")
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

}
