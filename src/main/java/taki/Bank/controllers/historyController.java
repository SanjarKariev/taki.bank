package taki.Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class historyController {

    @GetMapping("/history")
    public String history(Model model) {
        return "history";
    }
}
