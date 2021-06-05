package com.dispositivosmoviles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dispositivosmoviles.entity.VehiculoEntity;

@Repository("VehiculoRepository")
public interface VehiculoRepository extends JpaRepository<VehiculoEntity, String>{

}
