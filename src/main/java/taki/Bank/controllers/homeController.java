package taki.Bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import taki.Bank.repository.userBDRepository;
import taki.Bank.models.userBD;


public class homeController {

    @Autowired
    private userBDRepository userBDRepository;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<userBD> UserBD = userBDRepository.findAll();
        model.addAttribute("User", UserBD);
        return "home";
    }
}
