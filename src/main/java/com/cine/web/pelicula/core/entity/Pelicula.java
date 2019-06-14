package com.cine.web.pelicula.core.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pelicula")
@Getter
@Setter
public class Pelicula {

	@Id
	private Integer idPelicula;
	private String tituloDist;
	private String tituloOrig;
	@Temporal(TemporalType.DATE)
	private Date fechEstreno;
	private String genero;
	private String paisOrigen;
	private String sinopsis;
	private Integer duracion;
	private Integer recaudacion;
	
	@ManyToOne
	@JoinColumn(name="tipoCensura")
	private TipoCensura tipo;
	
	@ManyToOne
	@JoinColumn(name="estProy")
	private EstadoProyeccion estado;
	
	
	
}
