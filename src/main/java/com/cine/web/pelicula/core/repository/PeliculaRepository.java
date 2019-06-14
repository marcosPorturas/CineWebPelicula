package com.cine.web.pelicula.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cine.web.pelicula.core.entity.Pelicula;


@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Integer>{

	@Query("Select MAX(a.idPelicula) from Pelicula a")
	Integer getLastIdPelicula();
	
}
