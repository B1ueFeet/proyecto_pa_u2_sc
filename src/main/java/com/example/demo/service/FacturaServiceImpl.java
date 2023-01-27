package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepo;
import com.example.demo.uce.modelo.Factura;

@Service
public class FacturaServiceImpl  implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Override
	public void generar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.insertar(factura);
	}

	@Override
	public void editar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.actualizar(factura);
	}

	@Override
	public Factura buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepo.buscar(id);
	}

	@Override
	public void remover(Integer id) {
		// TODO Auto-generated method stub
		this.facturaRepo.eliminar(id);
	}

}
