package com.cine.web.pelicula.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "censura")
@Getter
@Setter
public class TipoCensura {

	@Id
	private Integer tipoCensura;
	private String nomCensura;
	
}
