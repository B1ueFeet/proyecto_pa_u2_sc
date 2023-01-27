package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IFacturaService;
import com.example.demo.uce.modelo.Detalle;
import com.example.demo.uce.modelo.Factura;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}

	@Autowired
	private IFacturaService facturaService;

	@Override
	public void run(String... args) throws Exception {

		Factura factura = new Factura();
		factura.setCliente("Alejandro Magno");
		factura.setNumero("1234");

		List<Detalle> detalles = new ArrayList<>();

		Detalle detalle = new Detalle();
		detalle.setCantidad(30);
		detalle.setNombre("Calabaza");
		detalle.setPrecio(new BigDecimal(30));
		detalle.setFactura(factura);

		Detalle detalle2 = new Detalle();
		detalle2.setCantidad(2);
		detalle2.setNombre("Antorcha");
		detalle2.setPrecio(new BigDecimal(10));
		detalle2.setFactura(factura);

		Detalle detalle3 = new Detalle();
		detalle3.setCantidad(1);
		detalle3.setNombre("Mazo");
		detalle3.setPrecio(new BigDecimal(4));
		detalle3.setFactura(factura);

		factura.setDetalle(detalles);

		this.facturaService.generar(factura);

	}

}
