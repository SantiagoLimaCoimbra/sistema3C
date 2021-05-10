package br.com.sistema.controller;

import br.com.sistema.repository.CargoRepository;
import br.com.sistema.service.CargoServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CargoController {

    @Autowired
    CargoServiceImple cargoService;

    @GetMapping("/cargo/list")
    public String list(Model model){
        model.addAttribute("cargos", cargoService.findAll());
        return "cargo/list";
    }
}
