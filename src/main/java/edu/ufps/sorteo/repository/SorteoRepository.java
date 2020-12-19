package edu.ufps.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ufps.sorteo.entities.Sorteo;

public interface SorteoRepository extends JpaRepository<Sorteo, Integer> {

}
