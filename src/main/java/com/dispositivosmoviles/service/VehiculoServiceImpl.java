package com.dispositivosmoviles.service;

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
		// TODO Auto-generated method stub
		
	}

}
