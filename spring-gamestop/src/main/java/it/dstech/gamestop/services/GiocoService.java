package it.dstech.gamestop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.gamestop.models.Gioco;
import it.dstech.gamestop.repository.GiocoRepository;

@Service
@Transactional
public class GiocoService {
	@Autowired
	GiocoRepository repo;

	public void save(Gioco gioco) {
		repo.save(gioco);
	}

	public void delete(Long idGioco) {
		repo.deleteById(idGioco);
	}

	public List<Gioco> listAll() {
		return (List<Gioco>) repo.findAll();
	}

	public Gioco get(Long idGioco) {
		return repo.findById(idGioco).get();
	}

	public List<Gioco> findByTitolo(String titolo) {
		return repo.findByTitolo(titolo);
	}

	public List<Gioco> findByCategoria(String cat) {
		return repo.findByCategoria(cat);
	}

	public List<Gioco> findByPegi(int pegi) {
		return repo.findByPegi(pegi);
	}

	public List<Gioco> findByPrezzo(Double prezzo) {
		return repo.findByPrezzo(prezzo);
	}
}
