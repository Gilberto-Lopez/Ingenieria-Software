/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author gilis
 */
@Entity
@Table(name="user")
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iduser")
	private int iduser;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="password")
	private String password;
	
	@OneToOne
	@JoinColumn(name="persona_id")
	private Persona persona;
	
	public int getIdUser () {
		return iduser;
	}
	
	public String getCorreo () {
		return correo;
	}
	
	public String getPassword () {
		return password;
	}
	
	public Persona getPersona () {
		return persona;
	}
	
	public void setIdUser (int id) {
		iduser = id;
	}
	
	public void setCorreo (String correo) {
		this.correo = correo;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	
	public void setPersona (Persona persona) {
		this.persona = persona;
	}
}
