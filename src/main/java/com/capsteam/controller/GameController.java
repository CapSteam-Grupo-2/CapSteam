package com.capsteam.controller;

import com.capsteam.model.GameModel;
import com.capsteam.service.GameService;
import com.capsteam.service.ReadService;
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

    @Autowired
    private ReadService readService;

    /**
     * Carga el fichero CSV en la base de datos
     * @return a la pagina html del listado
     */
    @GetMapping("/load")
    public String initializer() {
        for (String game : readService.readFileCsv()) {
            saveGame(readService.parseModelfromString(game));
        }
        return ("redirect:/");
    }

    /**
     * Busca el juego por id y devuelve los datos para mostrarlos en el formulario
     * @param id : id del juego
     * @param model : modelo para guardar los datos del juego y devolverlos
     * @return a la pagina html del formulario
     */
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

    /**
     * Añade un juego por los datos que se mandan
     * @param game : objeto vacio para rellenarlo en el formulario
     * @param model : modelo donde se guarda el juego
     * @return a la pagina html del formulario
     */
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

    /**
     * Borra un juego según el id
     * @param id : id del juego que se va a eliminar
     * @return a la pagina html del listado
     */
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

    /**
     * Muestra un listado filtrando según el Publisher
     * @param publisher : nombre del publisher por el que se va a filtrar
     * @param m : modelo donde se guarda la lista filtrada que se muestra en el html
     * @return a la pagina html del listado
     */
    @GetMapping("/publisher")
    public String findByPublisher(@RequestParam("publisher") String publisher, Model model) {
        model.addAttribute("gameList", service.findByPublisher(publisher));
        return "list.html";
    }
}
