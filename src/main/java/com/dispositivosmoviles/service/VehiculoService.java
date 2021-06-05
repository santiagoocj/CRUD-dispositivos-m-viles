package com.dispositivosmoviles.service;

import java.util.List;

import com.dispositivosmoviles.entity.VehiculoEntity;

public interface VehiculoService {
	
	public void crear(VehiculoEntity vehiculoEntity);
	
	public void Elimiar(String placa);
	
	public List<VehiculoEntity> listar();

}
