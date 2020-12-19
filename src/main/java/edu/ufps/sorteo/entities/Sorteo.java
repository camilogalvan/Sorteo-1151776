package edu.ufps.sorteo.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistent class for the sorteo database table.
 * 
 */
@Entity
@NamedQuery(name = "Sorteo.findAll", query = "SELECT s FROM Sorteo s")
public class Sorteo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int boletas;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;

	private int maximo;

	private String nombre;

	private int numeros;

	// bi-directional many-to-one association to Boleta
	@OneToMany(mappedBy = "sorteoBean")
	private List<Boleta> boletasSet;

	// bi-directional many-to-one association to Persona
	@OneToMany(mappedBy = "sorteoBean")
	private List<Persona> personas;

	public Sorteo() {
	}
/*
	public void generarBoletas() {
		Boleta boletta = new Boleta();
		for (int i = 0; i < boletas; i++) {
			boletta.setBoleta(i);
			this.addBoletasSet(boletta);
			for (int j = 0; j < numeros; j++) {
				List<Numero> numbers;
				Numero
				numbers.add(n);
				boletta.setBoleta(i);
				this.addBoletasSet(boletta)
		}
		
		}
	}
	*/

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBoletas() {
		return this.boletas;
	}

	public void setBoletas(int boletas) {
		this.boletas = boletas;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getMaximo() {
		return this.maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeros() {
		return this.numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public List<Boleta> getBoletasSet() {
		return this.boletasSet;
	}

	public void setBoletasSet(List<Boleta> boletasSet) {
		this.boletasSet = boletasSet;
	}

	public Boleta addBoletasSet(Boleta boletasSet) {
		getBoletasSet().add(boletasSet);
		boletasSet.setSorteoBean(this);

		return boletasSet;
	}

	public Boleta removeBoletasSet(Boleta boletasSet) {
		getBoletasSet().remove(boletasSet);
		boletasSet.setSorteoBean(null);

		return boletasSet;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setSorteoBean(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setSorteoBean(null);

		return persona;
	}

}
