package it.dstech.gamestop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.gamestop.models.Gioco;
import it.dstech.gamestop.services.GiocoService;

@Controller
public class GiocoController {
	@Autowired
	private GiocoService service;

	@RequestMapping("/")
	public ModelAndView home() {
		List<Gioco> listGiochi = service.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listGiochi", listGiochi);
		return mav;
	}

	@RequestMapping("/new")
	public String newGiocoForm(Model model) {
		Gioco gioco = new Gioco();
		model.addAttribute("gioco", gioco);
		return "nuovoGioco";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGioco(@ModelAttribute("gioco") Gioco gioco) {
		service.save(gioco);
		return "redirect:/";
	}

	@RequestMapping("/edit")
	public ModelAndView editGiocoForm(@RequestParam long idGioco) {
		ModelAndView model = new ModelAndView("modificaGioco");
		Gioco gioco = service.get(idGioco);
		model.addObject("gioco", gioco);

		return model;
	}

	@RequestMapping("/delete")
	public String deleteGiocoForm(@RequestParam long idGioco) {
		service.delete(idGioco);
		return "redirect:/";
	}

	@RequestMapping(value = "/indietro")
	public String indietro() {
		return "redirect:/";
	}

	@RequestMapping("/risultato")
	public ModelAndView findBy(@RequestParam int scelta, @RequestParam String string) {
		ModelAndView model = new ModelAndView("risultato");
		List<Gioco> listaRicerca = null;

		switch (scelta) {
		case 0:
			listaRicerca = service.findByTitolo(string);
			break;
		case 1:
			listaRicerca = service.findByPrezzo(Double.parseDouble(string));
			break;
		case 2:
			listaRicerca = service.findByCategoria(string);
			break;
		case 3:
			listaRicerca = service.findByPegi(Integer.parseInt(string));
			break;

		}

		model.addObject("listaRicerca", listaRicerca);
		return model;
	}
}
