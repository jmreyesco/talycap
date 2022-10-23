package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regiones")
public class Region implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	
	@Column(name="tipo_logistica")
	private String tipoLogistica;
	
	@Column(name="tipo_producto")
	private String tipoProducto;
	
	@Column(name="cantidad_producto")
	private String cantidadProducto;
	
	@Column(name="fecha_registro")
	private String fechaRegistro;
	
	@Column(name="fecha_entrega")
	private String fechaEntrega;
	
	@Column(name="bodega_entrega")
	private String bodegaEntrega;
	
	@Column(name="precio_envio")
	private String precioEnvio;
	
	@Column(name="numero_placa_flota")
	private String numeroPlacaFlota;
	
	@Column(name="numero_guia")
	private String numeroGuia;
	
	public String getTipoLogistica() {
		return tipoLogistica;
	}

	public void setTipoLogistica(String tipoLogistica) {
		this.tipoLogistica = tipoLogistica;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(String cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getBodegaEntrega() {
		return bodegaEntrega;
	}

	public void setBodegaEntrega(String bodegaEntrega) {
		this.bodegaEntrega = bodegaEntrega;
	}

	public String getPrecioEnvio() {
		return precioEnvio;
	}

	public void setPrecioEnvio(String precioEnvio) {
		this.precioEnvio = precioEnvio;
	}

	public String getNumeroPlacaFlota() {
		return numeroPlacaFlota;
	}

	public void setNumeroPlacaFlota(String numeroPlacaFlota) {
		this.numeroPlacaFlota = numeroPlacaFlota;
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}

//	private Long region_id;
//
//	public Long getRegion_id() {
//		return region_id;
//	}
//
//	public void setRegion_id(Long region_id) {
//		this.region_id = region_id;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private static final long serialVersionUID = 1L;

}
