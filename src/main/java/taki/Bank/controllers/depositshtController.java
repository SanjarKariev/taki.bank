package taki.Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class depositshtController {

    @GetMapping("/depositsht")
    public String depositsht(Model model) {
        return "depositsht";
    }
}