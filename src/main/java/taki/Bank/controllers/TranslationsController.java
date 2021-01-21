package taki.Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class TranslationsController {

    @GetMapping("/translations")
    public String translations(Model model) {
        return "translations";
    }
}
