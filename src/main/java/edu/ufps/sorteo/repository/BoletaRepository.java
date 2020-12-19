package edu.ufps.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ufps.sorteo.entities.Boleta;

public interface BoletaRepository extends JpaRepository<Boleta, Integer> {

}
