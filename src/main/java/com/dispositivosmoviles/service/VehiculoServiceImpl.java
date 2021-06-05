package com.dispositivosmoviles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dispositivosmoviles.entity.VehiculoEntity;
import com.dispositivosmoviles.repository.VehiculoRepository;

@Service("VehiculoServiceImpl")
public class VehiculoServiceImpl implements VehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public void crear(VehiculoEntity vehiculoEntity) {
		vehiculoRepository.save(vehiculoEntity);
	}

	@Override
	public void Elimiar(String placa) {
		vehiculoRepository.deleteById(placa);
		
	}

	@Override
	public List<VehiculoEntity> listar() {
		return vehiculoRepository.findAll();
	}

}
