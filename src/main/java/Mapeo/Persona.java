/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gilis
 */
public class Persona {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idpersona")
	private int idpersona;
	
	@Column(name="nombre")
    private String nombre;
	
	@Column(name="fechanac")
    private String fechanac;
	
	@Column(name="carrera")
    private String carrera;
    
	public int getIdPersona () {
		return idpersona;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public String getFechaNac () {
		return fechanac;
	}
	
	public String getCarrera () {
		return carrera;
	}
	
	public void setIdPersona (int id) {
		idpersona = id;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setFechaNac (String fechanac) {
		this.fechanac = fechanac;
	}
	
	public void setCarrera (String carrera) {
		this.carrera = carrera;
	}
}
