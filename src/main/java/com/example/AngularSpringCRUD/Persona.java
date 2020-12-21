package com.example.AngularSpringCRUD;

import javax.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String apellidos;
	@Column
	private Float sueldo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Float getSueldo() {
		return sueldo;
	}
	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}
	
}
