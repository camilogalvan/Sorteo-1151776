package edu.ufps.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ufps.sorteo.entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
