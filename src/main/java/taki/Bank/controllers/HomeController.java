package taki.Bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import taki.Bank.repository.UserBDRepository;
import taki.Bank.models.UserBD;


public class HomeController {

    @Autowired
    private UserBDRepository userBDRepository;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<UserBD> UserBD = userBDRepository.findAll();
        model.addAttribute("clients", UserBD);
        return "home";
    }
}
