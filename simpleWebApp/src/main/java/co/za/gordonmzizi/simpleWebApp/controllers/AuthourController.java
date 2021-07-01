package co.za.gordonmzizi.simpleWebApp.controllers;

import co.za.gordonmzizi.simpleWebApp.repositories.AuthourRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthourController {
    private final AuthourRepository authourRepository;

    public AuthourController(AuthourRepository authourRepository) {
        this.authourRepository = authourRepository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model){

        model.addAttribute("authors",authourRepository.findAll());

        return "authours/List.html";
    }
}
