package com.cine.web.pelicula.core.dto.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PeliculaResponse {
	
	private Integer idPelicula;
	private String tituloDist;
	private String tituloOrig;
	private Date fechEstreno;
	private String genero;
	private String paisOrigen;
	private String sinopsis;
	private Integer duracion;
	private Integer recaudacion;
	private String tipoCensura;
	private String estProyec;

}
