package com.kk2.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Productos {
	
	@Id
	@Column(name="PRODUCTO_ID")
	private int id;
	
	@Column(name="PRODUCTO_NOMBRE")
	private String nombre;
	
	@Column(name="PRODUCTO_DESCRIPCION")
	private String descripcion;
	
	@Column(name="PRODUCTO_CATEGORIA")
	private String categoria;
	
	@Column(name="PRODUCTO_PRECIO")
	private Double precio;
	
	@Column(name="PRODUCTO_STOCK")
	private int stock;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	

}
