package it.dstech.gamestop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.dstech.gamestop.models.Gioco;

public interface GiocoRepository extends CrudRepository<Gioco, Long> {

	public List<Gioco> findByTitolo(String titolo);

	public List<Gioco> findByPegi(int pegi);

	public List<Gioco> findByCategoria(String categoria);

	public List<Gioco> findByPrezzo(Double prezzo);
}
