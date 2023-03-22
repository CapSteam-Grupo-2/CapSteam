package com.capsteam.controller;

import com.capsteam.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/details")
    public String getDetails(@RequestParam("id") int id, Model model) {
        model.addAttribute("game", service.findById(id));
        return "details.html";
    }
}
