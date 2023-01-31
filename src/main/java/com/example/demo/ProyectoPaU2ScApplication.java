package com.example.demo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IVehiculoService;
import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Vehiculo;

@SpringBootApplication
public class ProyectoPaU2ScApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2ScApplication.class, args);
	}
	
	@Autowired
	private IVehiculoService vehiculoService;

	@Override
	public void run(String... args) throws Exception {
		
		//INSERTAR DATOS
		
		Vehiculo vehiculo = new Vehiculo();
		Vehiculo vehiculo2 = new Vehiculo();
		Vehiculo vehiculo3 = new Vehiculo();
		Vehiculo vehiculo4 = new Vehiculo();
		Vehiculo vehiculo5= new Vehiculo();
		
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();
		Cliente cliente5 = new Cliente();
		Cliente cliente6 = new Cliente();
		Cliente cliente7 = new Cliente();
		Cliente cliente8= new Cliente();
		
		vehiculo.setMarca("Toyota");
		vehiculo.setModelo("Jaris");
		vehiculo.setPlaca("PDC2266");
		vehiculo.setPrecio(new BigDecimal(60));
		
		vehiculo2.setMarca("Aveo");
		vehiculo2.setModelo("Family");
		vehiculo2.setPlaca("Pdf2346");
		vehiculo2.setPrecio(new BigDecimal(30));
		
		vehiculo3.setMarca("Toyota");
		vehiculo3.setModelo("Fortuner");
		vehiculo3.setPlaca("ABC1234");
		vehiculo3.setPrecio(new BigDecimal(90));
		
		vehiculo4.setMarca("Nissan");
		vehiculo4.setModelo("Centra");
		vehiculo4.setPlaca("JDK1997");
		vehiculo4.setPrecio(new BigDecimal(50));
		
		vehiculo5.setMarca("Kia");
		vehiculo5.setModelo("Sportage");
		vehiculo5.setPlaca("PFG2609");
		vehiculo5.setPrecio(new BigDecimal(60));
		
		cliente.setNombre("Marcelo");
		cliente.setApellido("Guaman");
		cliente.setCedula("1717560930");
		cliente.setTarjeta("2209876556");
		
		cliente2.setNombre("Mirella");
		cliente2.setApellido("Chesa");
		cliente2.setCedula("1712345678");
		cliente2.setTarjeta("2209436785");
		
		cliente3.setNombre("Alejandro");
		cliente3.setApellido("Magno");
		cliente3.setCedula("1728346582");
		cliente3.setTarjeta("2209873527");
		
		cliente4.setNombre("Abdala");
		cliente4.setApellido("Bucaram");
		cliente4.setCedula("1735629889");
		cliente4.setTarjeta("2209653728");
		
		cliente5.setNombre("Felipe");
		cliente5.setApellido("Borja");
		cliente5.setCedula("1754938267");
		cliente5.setTarjeta("2209437283");
		
		cliente6.setNombre("Bratt");
		cliente6.setApellido("Pit");
		cliente6.setCedula("1717653528");
		cliente6.setTarjeta("2298546366");
		
		cliente7.setNombre("Shakira");
		cliente7.setApellido("Guevara");
		cliente7.setCedula("1756342589");
		cliente7.setTarjeta("2298563567");
		
		cliente8.setNombre("Mashi");
		cliente8.setApellido("Correa");
		cliente8.setCedula("1756243555");
		cliente8.setTarjeta("2298887766");
		
		vehiculo.setClientes(new HashSet<>(Set.of(cliente6,cliente7)));
		vehiculo2.setClientes(new HashSet<>(Set.of(cliente,cliente2)));
		vehiculo3.setClientes(new HashSet<>(Set.of(cliente8,cliente7)));
		vehiculo4.setClientes(new HashSet<>(Set.of(cliente,cliente2,cliente3)));
		vehiculo5.setClientes(new HashSet<>(Set.of(cliente4,cliente5)));
		
		cliente.setVehiculos(new HashSet<>(Set.of(vehiculo4, vehiculo2)));
		cliente2.setVehiculos(new HashSet<>(Set.of(vehiculo4, vehiculo2)));
		cliente3.setVehiculos(new HashSet<>(Set.of(vehiculo4)));
		cliente4.setVehiculos(new HashSet<>(Set.of(vehiculo5)));
		cliente5.setVehiculos(new HashSet<>(Set.of(vehiculo5)));
		cliente6.setVehiculos(new HashSet<>(Set.of(vehiculo)));
		cliente7.setVehiculos(new HashSet<>(Set.of(vehiculo, vehiculo3)));
		cliente8.setVehiculos(new HashSet<>(Set.of(vehiculo3)));
		
		this.vehiculoService.guardar(vehiculo);
		this.vehiculoService.guardar(vehiculo5);
		this.vehiculoService.guardar(vehiculo2);



		
		
		
		
		
		
		
	}

}
