package com.viewnext.curso.domain;

import java.util.List;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String nombreUsuario;
	private String password;
	private String email;
	private String dni;
	
	//ATRIBUTOS PARA LAS RELACIONES
	private List<Wallet> wallet;//Relacion con la tabla wallet, Un usuario puede tener muchas wallet

	
	
	public List<Wallet> getWallet() {
		return wallet;
	}

	public void setWallet(List<Wallet> wallet) {
		this.wallet = wallet;
	}

	public Usuario() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", email="
				+ email + ", dni=" + dni + "]";
	}

}
