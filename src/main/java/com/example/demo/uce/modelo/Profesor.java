package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prof_seq")
	@SequenceGenerator(name = "prof_seq", sequenceName = "prof_seq", allocationSize = 1)
	@Column(name = "prof_id")
	private Integer id;

	@Column(name = "prof_nombre")
	private String nombre;

	@Column(name = "prof_apellido")
	private String apellido;

	@Column(name = "prof_cedula")
	private String cedula;

	@Column(name = "prof_materia")
	private String materia;

	@Column(name = "prof_ciudad")
	private String ciudad;

	@Column(name = "prof_genero")
	private String genero;

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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", materia=" + materia + ", ciudad=" + ciudad + ", genero=" + genero + "]";
	}

}
