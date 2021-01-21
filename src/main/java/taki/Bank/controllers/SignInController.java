package taki.Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class SignInController {

    @GetMapping("/signIn")
    public String signIn(Model model) {
        return "signIn";
    }
}