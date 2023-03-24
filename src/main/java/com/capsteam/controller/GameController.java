package com.capsteam.controller;

import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;
import com.capsteam.service.ReadService;
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
    private ReadService readService;

    @GetMapping("/load")
    public String initializer() {
        for (String game : readService.readFileCsv()) {
            saveGame(readService.parseModelfromString(game));
        }
        return "list.html";
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
    /**
     * Obtiene los datos del juego seleccionado y lo redirecciona a la pagina details.html
     * @param id : del valor seleccionado
     * @param model : variable del modelo
     * @return los datos del juego seleccioando
     */
    @GetMapping("/details")
    public String getDetails(@RequestParam("id") int id, Model model) {
        model.addAttribute("game", service.findById(id));
        return "details.html";
    }

    @GetMapping("/delete")
    public String removeGame(@RequestParam("id") int id) {
        service.deleteById(id);
        return ("redirect:/");
    }
    /**
     * Metodo que lista todos los juegos
     * @param model : variable del modelo
     * @return lista de juegos
     */
    @GetMapping("/")
    public String listGames(Model model) {
        model.addAttribute("gameList", service.getGames());
        return "list.html";
    }
    @GetMapping("/publisher")
    public String findByPublisher(@RequestParam("publisher") String publisher, Model model) {
        model.addAttribute("gameList", service.findByPublisher(publisher));
        return "list.html";
    }
}
