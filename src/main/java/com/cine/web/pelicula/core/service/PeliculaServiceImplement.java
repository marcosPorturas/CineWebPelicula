package com.cine.web.pelicula.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.web.pelicula.core.dto.request.PeliculaRequest;
import com.cine.web.pelicula.core.dto.response.PeliculaResponse;
import com.cine.web.pelicula.core.entity.EstadoProyeccion;
import com.cine.web.pelicula.core.entity.Pelicula;
import com.cine.web.pelicula.core.entity.TipoCensura;
import com.cine.web.pelicula.core.repository.PeliculaRepository;

@Service
public class PeliculaServiceImplement implements PeliculaService{

	@Autowired
	PeliculaRepository peliculaRepository;
	
	
	@Override
	public List<PeliculaResponse> allPeliculas() {
		// TODO Auto-generated method stub
		List<PeliculaResponse> lstPeliculaResp = new ArrayList<PeliculaResponse>();
		for(Pelicula pelicula : peliculaRepository.findAll()) {
			PeliculaResponse peliculaResp = new PeliculaResponse();
			peliculaResp.setIdPelicula(pelicula.getIdPelicula());
			peliculaResp.setTituloDist(pelicula.getTituloDist());
			peliculaResp.setTituloOrig(pelicula.getTituloOrig());
			peliculaResp.setFechEstreno(pelicula.getFechEstreno());
			peliculaResp.setGenero(pelicula.getGenero());
			peliculaResp.setPaisOrigen(pelicula.getPaisOrigen());
			peliculaResp.setSinopsis(pelicula.getSinopsis());
			peliculaResp.setDuracion(pelicula.getDuracion());
			peliculaResp.setRecaudacion(pelicula.getRecaudacion());
			peliculaResp.setTipoCensura(pelicula.getTipo().getNomCensura());
			peliculaResp.setEstProyec(pelicula.getEstado().getNomProy());
			lstPeliculaResp.add(peliculaResp);
		}
		return lstPeliculaResp;
	}

	@Override
	public Pelicula addPelicula(PeliculaRequest peliculaReq) {
		// TODO Auto-generated method stub
		Pelicula pelicula = new Pelicula();
		if(peliculaReq.getIdPelicula() == null) {
			pelicula.setIdPelicula(generarCodigoCine());
		}else {
			pelicula.setIdPelicula(peliculaReq.getIdPelicula());
		}
		pelicula.setTituloOrig(peliculaReq.getTituloOrig());
		pelicula.setTituloDist(peliculaReq.getTituloDist());
		pelicula.setFechEstreno(peliculaReq.getFechEstreno());
		pelicula.setGenero(peliculaReq.getGenero());
		pelicula.setPaisOrigen(peliculaReq.getPaisOrigen());
		pelicula.setSinopsis(peliculaReq.getSinopsis());
		pelicula.setDuracion(peliculaReq.getDuracion());
		pelicula.setRecaudacion(peliculaReq.getRecaudacion());
		
		TipoCensura censura = new TipoCensura();
		censura.setTipoCensura(peliculaReq.getTipoCensura());
		
		EstadoProyeccion estProy = new EstadoProyeccion();
		estProy.setEstProy(peliculaReq.getEstProyec());
		
		pelicula.setTipo(censura);
		pelicula.setEstado(estProy);
		
		return peliculaRepository.save(pelicula);
	}

	@Override
	public void deletePelicula(Integer idPelicula) {
		// TODO Auto-generated method stub
		peliculaRepository.deleteById(idPelicula);
		
	}

	@Override
	public PeliculaResponse findPelicula(Integer idPelicula) {
		// TODO Auto-generated method stub
		
		Pelicula pelicula = peliculaRepository.findById(idPelicula).get();
		PeliculaResponse peliculaResp = new PeliculaResponse();
		peliculaResp.setIdPelicula(pelicula.getIdPelicula());
		peliculaResp.setTituloDist(pelicula.getTituloDist());
		peliculaResp.setTituloOrig(pelicula.getTituloOrig());
		peliculaResp.setFechEstreno(pelicula.getFechEstreno());
		peliculaResp.setGenero(pelicula.getGenero());
		peliculaResp.setPaisOrigen(pelicula.getPaisOrigen());
		peliculaResp.setSinopsis(pelicula.getSinopsis());
		peliculaResp.setDuracion(pelicula.getDuracion());
		peliculaResp.setRecaudacion(pelicula.getRecaudacion());
		peliculaResp.setTipoCensura(pelicula.getTipo().getNomCensura());
		peliculaResp.setEstProyec(pelicula.getEstado().getNomProy());
		return peliculaResp;
	}
	
	
	public Integer generarCodigoCine() {
		  Integer idpelicula;
		  idpelicula=peliculaRepository.getLastIdPelicula();
	      if(idpelicula==null)idpelicula=10000;
	      return idpelicula+1;
	}
	

}
