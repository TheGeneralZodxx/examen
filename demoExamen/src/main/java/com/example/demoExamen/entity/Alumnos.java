package com.example.demoExamen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_alumnos")
public class Alumnos {
	
	@Id
	@Column(name = "id_t_usuarios")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_t_usuarios;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ap_paterno")
	private String ap_paterno;
	
	@Column(name = "ap_materno")
	private String ap_materno;

	@Column(name = "activo")
	private boolean activo;
	
	
	public Alumnos() {
		super();
	}

	public Alumnos(String nombre,String ap_paterno,String ap_materno,boolean activo) {
		super();
		this.nombre = nombre;
		this.ap_paterno = ap_paterno;
		this.ap_materno = ap_materno;
		this.activo = activo;
	}

	public Long getId_t_usuarios() {
		return id_t_usuarios;
	}

	public void setId_t_usuarios(Long id_t_usuarios) {
		this.id_t_usuarios = id_t_usuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_paterno() {
		return ap_paterno;
	}

	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}

	public String getAp_materno() {
		return ap_materno;
	}

	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}


}
