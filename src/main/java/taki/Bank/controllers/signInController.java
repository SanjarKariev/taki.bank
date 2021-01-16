package taki.Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class signInController {

    @GetMapping("/signIn")
    public String signIn(Model model) {
        return "signIn";
    }
}