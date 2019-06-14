package com.cine.web.pelicula.core.dto.request;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PeliculaRequest {

	private Integer idPelicula;
	private String tituloDist;
	private String tituloOrig;
	private Date fechEstreno;
	private String genero;
	private String paisOrigen;
	private String sinopsis;
	private Integer duracion;
	private Integer recaudacion;
	private Integer tipoCensura;
	private Integer estProyec;
}
