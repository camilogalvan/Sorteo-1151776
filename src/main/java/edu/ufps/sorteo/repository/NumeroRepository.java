package edu.ufps.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ufps.sorteo.entities.Numero;

public interface NumeroRepository extends JpaRepository<Numero, Integer> {

}
