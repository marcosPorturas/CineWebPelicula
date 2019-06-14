package com.cine.web.pelicula.core.service;

import java.util.List;

import com.cine.web.pelicula.core.dto.request.PeliculaRequest;
import com.cine.web.pelicula.core.dto.response.PeliculaResponse;
import com.cine.web.pelicula.core.entity.Pelicula;

public interface PeliculaService {

	List<PeliculaResponse> allPeliculas();
	Pelicula addPelicula(PeliculaRequest peliculaReq);
	void deletePelicula(Integer idPelicula);
	PeliculaResponse findPelicula(Integer idPelicula);
	
	
	
}
