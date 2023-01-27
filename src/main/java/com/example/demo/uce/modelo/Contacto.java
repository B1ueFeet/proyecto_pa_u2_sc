package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "contacto")
public class Contacto {
	@Id
	@GeneratedValue(generator ="cont_seq" ,strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "cont_seq", allocationSize = 1,sequenceName = "cont_seq")
	@Column(name = "cont_id")
	private Integer id;
	@Column(name = "cont_telefono")
	private String telefono;
	@Column(name = "cont_email")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cont_id_alumno")
	private Alumno alumno;
	
	//TO STRING
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	//GETTER & SETTER
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	

}
