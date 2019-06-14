package com.cine.web.pelicula.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "est_proyeccion")
@Setter
@Getter
public class EstadoProyeccion {

	@Id
	private Integer estProy;
	private String nomProy;
	
}
