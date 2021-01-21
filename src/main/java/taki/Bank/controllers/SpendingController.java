package taki.Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class SpendingController {

    @GetMapping("/spending")
    public String spending(Model model) {
        return "spending";
    }
}
