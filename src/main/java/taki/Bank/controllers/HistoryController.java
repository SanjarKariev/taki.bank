package taki.Bank.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class HistoryController {

    @GetMapping("/history")
    public String history(Model model) {
        return "history";
    }
}
