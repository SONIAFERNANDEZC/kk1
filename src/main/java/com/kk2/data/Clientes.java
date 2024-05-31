package com.kk2.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {
	
	@Id
	@Column(name="CLIENTE_ID")
	private int id;
	
	@Column(name="CLIENTE_NOMBRE")
	private String nombre;
	
	@Column(name="CLIENTE_APELLIDOS")
	private String apellidos;
	
	@Column(name="CLIENTE_EMAIL")
	private String email;
	
	@Column(name="CLIENTE_DIRECCION")
	private String direccion;
	
	@Column(name="CLIENTE_INFO_PAGO")
	private String info_pago;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getInfo_pago() {
		return info_pago;
	}

	public void setInfo_pago(String info_pago) {
		this.info_pago = info_pago;
	}

	
}
