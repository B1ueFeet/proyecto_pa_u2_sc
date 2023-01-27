package com.example.demo.service;

import com.example.demo.uce.modelo.Factura;

public interface IFacturaService {
	
	public void generar(Factura factura);

	public void editar(Factura factura);

	public Factura buscar(Integer id);

	public void remover(Integer id);

}
