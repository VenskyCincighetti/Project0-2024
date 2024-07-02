package com.store.entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="vent")
public class Vent{
	
	
				////////////////////
				//-----Columns----//
				////////////////////
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="vent_id", updatable = false)
	private Integer vent_id;
	
	@Column (name="name", nullable = false)
	private String name;
	
	@Column (name="fins")
	private Integer fins;
	
	@Column (name="length", columnDefinition = "numeric CHECK (length>0")
	private Double length;
	
	@Column (name="width", columnDefinition =  "numeric CHECK (width>0)")
	private Double width;
	
	@Column (name="type", nullable = false)
	private String type;

				////////////////////
				//--Constructors--//
				////////////////////

	public Vent() {
		super();
	}

	public Vent(String name, Integer fins, Double length, Double width, String type) {
		super();
		this.name = name;
		this.fins = fins;
		this.length = length;
		this.width = width;
		this.type = type;
	}


	public Vent(Integer vent_id, String name, Integer fins, Double length, Double width, String type) {
		super();
		this.vent_id = vent_id;
		this.name = name;
		this.fins = fins;
		this.length = length;
		this.width = width;
		this.type = type;
	}

				///////////////////////
				//--Getters/Setters--//
				///////////////////////

	public Integer getVent_id() {
		return vent_id;
	}



	public void setVent_id(Integer vent_id) {
		this.vent_id = vent_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getFins() {
		return fins;
	}



	public void setFins(Integer fins) {
		this.fins = fins;
	}



	public Double getLength() {
		return length;
	}



	public void setLength(Double length) {
		this.length = length;
	}



	public Double getWidth() {
		return width;
	}



	public void setWidth(Double width) {
		this.width = width;
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

}
