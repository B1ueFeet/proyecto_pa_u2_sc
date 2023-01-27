package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
	@Id
	@GeneratedValue(generator = "alum_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "alum_seq", allocationSize = 1, sequenceName = "alum_seq")
	@Column(name = "alum_id")
	private Integer id;
	@Column(name = "alum_nombre")
	private String nombre;
	@Column(name = "alum_apellido")
	private String apellido;
	@Column(name = "alum_edad")
	private String edad;
	@OneToOne(mappedBy = "alumno", cascade = CascadeType.ALL)
	private Contacto contacto;

	// TO STRING
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	// GETTER & SETTER
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

}
