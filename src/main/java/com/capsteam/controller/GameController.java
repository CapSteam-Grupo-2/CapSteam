package com.capsteam.controller;

import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping("/edit")
    public String editGame(@RequestParam("id") int id, Model model) {
        model.addAttribute("game", service.findById(id));
        return "form.html";
    }
    
    @PostMapping("/save")
    public String saveGame(GameModel game) {
    	service.saveGame(game);
    	return("redirect:/");
    }
    
    @GetMapping("/new")
    public String addGame(GameModel game, Model model) {
		model.addAttribute("game", game);
    	return "form.html";
    	
    }
}
