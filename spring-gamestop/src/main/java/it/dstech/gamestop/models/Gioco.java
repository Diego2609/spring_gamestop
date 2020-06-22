package it.dstech.gamestop.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gioco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGioco;
	private String titolo;
	private int pegi;
	private double prezzo;
	private String categoria;

	public Gioco() {
	}

	public Long getIdGioco() {
		return idGioco;
	}

	public void setIdGioco(Long idGioco) {
		this.idGioco = idGioco;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getPegi() {
		return pegi;
	}

	public void setPegi(int pegi) {
		this.pegi = pegi;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
