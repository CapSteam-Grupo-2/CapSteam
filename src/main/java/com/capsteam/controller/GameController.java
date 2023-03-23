package com.capsteam.controller;

import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;
import com.capsteam.util.CsvParse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

	@Autowired
	private GameService service;


	@Autowired
	private CsvParse read;
	
	@GetMapping("/load")
	public void cargar() {
		read.cargar();
	}

	@GetMapping("/edit")
	public String editGame(@RequestParam("id") int id, Model model) {
		model.addAttribute("game", service.findById(id));
		return "form.html";
	}

	@PostMapping("/save")
	public String saveGame(GameModel game) {
		service.save(game);
		return ("redirect:/");
	}

	@GetMapping("/new")
	public String addGame(GameModel game, Model model) {
		model.addAttribute("game", game);
		return "form.html";

	}

	@GetMapping("/details")
	public String getDetails(@RequestParam("id") int id, Model model) {
		model.addAttribute("game", service.findById(id));
		return "details.html";
	}

	@DeleteMapping("/delete")
	public String removeGame(@RequestParam("id") int id) {
		service.deleteById(id);
		return ("redirect:/");

	}

}
