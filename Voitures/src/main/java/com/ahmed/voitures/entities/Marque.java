package com.ahmed.voitures.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Marque {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idMar;
	private String nomMar;
	
	@OneToMany (mappedBy = "marque")
	@JsonIgnore
	private List<Voiture> voitures;

    
	public Marque() {
		super();
		
	}
	public Marque(Long idMar, String nomMar, List<Voiture> voitures) {
		super();
		this.idMar = idMar;
		this.nomMar = nomMar;
		this.voitures = voitures;
	}
	

    
	public Long getIdMar() {
		return idMar;
	}
	public void setIdMar(Long idMar) {
		this.idMar = idMar;
	}
	public String getNomMar() {
		return nomMar;
	}


	public void setNomMar(String nomMar) {
		this.nomMar = nomMar;
	}


	public List<Voiture> getVoitures() {
		return voitures;
	}


	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}


	@Override
	public String toString() {
		return "Marque [nomMar=" + nomMar + ", voitures=" + voitures + "]";
	}


	
	
	
}
