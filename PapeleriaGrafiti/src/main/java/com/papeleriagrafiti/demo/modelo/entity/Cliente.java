package com.papeleriagrafiti.demo.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="nombre_cliente")
	private String nombreCliente;
	
	@Column(name="telefono_cliente")
	private String telefonoCliente;
	
	@Column(name="direccion_cliente")
	private String direccionCliente;
	
	
	@Column(name="documento_cliente	")
	private String documentoCliente;
	
	@Column(name="email_cliente")
	private String emailCliente;

	public Cliente() {
		
	}

	public Cliente(Integer idCliente, String nombreCliente, String telefonoCliente, String direccionCliente,
			String documentoCliente, String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.telefonoCliente = telefonoCliente;
		this.direccionCliente = direccionCliente;
		this.documentoCliente = documentoCliente;
		this.emailCliente = emailCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getDocumentoCliente() {
		return documentoCliente;
	}

	public void setDocumentoCliente(String documentoCliente) {
		this.documentoCliente = documentoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", telefonoCliente="
				+ telefonoCliente + ", direccionCliente=" + direccionCliente + ", documentoCliente=" + documentoCliente
				+ ", emailCliente=" + emailCliente + "]";
	}


	
	
	

}
