package fr.humanbooster.fx.katchaka.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.humanbooster.fx.katchaka.business.Personne;

public interface PersonneDao extends JpaRepository<Personne, Long>{

	Personne save(String email);



}
