package com.dispositivosmoviles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dispositivosmoviles.entity.VehiculoEntity;
import com.dispositivosmoviles.service.VehiculoService;

@RestController
@RequestMapping("/api")
public class VehiculoController {
	
	@Autowired
	private VehiculoService vehiculoService;

	@PostMapping("/vehiculo")
	public void crear(@RequestBody VehiculoEntity vehiculoEntity) {
		vehiculoService.crear(vehiculoEntity);
	}
}
