package taki.Bank.controllers;

import taki.Bank.repository.userBDRepository;
import taki.Bank.models.userBD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.Map;


public class signUpController {

    @Autowired
    private userBDRepository userBDRepository;

    @GetMapping("/signUp")
    public String signUp(Model model) {
        Iterable<userBD> UserBD = userBDRepository.findAll();
        model.addAttribute("User", UserBD);
        return "signUp";
    }
    @PostMapping
    public String add(@RequestParam Long id,
                      @RequestParam String name,
                      @RequestParam String surname,
                      @RequestParam String patronymic,
                      @RequestParam String email,
                      @RequestParam Date birthDay,
                      @RequestParam long mobileNumber,
                      Map<String, Object> model){

        userBD user_BD = new userBD(id, name, surname, patronymic, email, birthDay, mobileNumber);

        userBDRepository.save(user_BD);
        Iterable<userBD> UserBD = userBDRepository.findAll();
        model.put("User", UserBD);

        return "signUp";
    }
}
