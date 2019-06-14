package com.cine.web.pelicula.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.web.pelicula.core.dto.request.PeliculaRequest;
import com.cine.web.pelicula.core.dto.response.PeliculaResponse;
import com.cine.web.pelicula.core.service.PeliculaService;

@RestController
@RequestMapping("/api/v1/peliculas")
public class PeliculaController {

	@Autowired
	PeliculaService peliculaService;
	
	
	@GetMapping
	public List<PeliculaResponse> getAllPeliculas(){
		return peliculaService.allPeliculas();
	}
	
	@GetMapping("/{idpelicula}")
	public PeliculaResponse getPelicula(@PathVariable("idpelicula")Integer idpelicula){
		return peliculaService.findPelicula(idpelicula);
	}
	
	@PostMapping("/add")
	public void getAddPelicula(@RequestBody PeliculaRequest peliculaRequest){
		peliculaService.addPelicula(peliculaRequest);
	}
	
	@PutMapping("/update")
	public void getUpdatePelicula(@RequestBody PeliculaRequest peliculaRequest){
		peliculaService.addPelicula(peliculaRequest);
	}
	
	@DeleteMapping("/delete/{idpelicula}")
	public void deletePelicula(@PathVariable("idpelicula")Integer idpelicula) {
		peliculaService.deletePelicula(idpelicula);
	}	
	
	
}
