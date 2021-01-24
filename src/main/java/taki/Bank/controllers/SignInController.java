package taki.Bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import taki.Bank.models.UserBD;
import taki.Bank.repository.UserBDRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.util.Map;

public class SignInController {

    @Autowired
    private UserBDRepository userBDRepository;

    @GetMapping("/signIn")
    public String signIn(Model model) {
        Iterable<UserBD> UserBD = userBDRepository.findAll();
        model.addAttribute("User", UserBD);
        return "signIn";
    }

    @PostMapping("/signUp")
    public String add(@RequestParam Long id,
                      @RequestParam String name,
                      @RequestParam String surname,
                      @RequestParam String patronymic,
                      @RequestParam String email,
                      @RequestParam Date birthDay,
                      @RequestParam long mobileNumber,
                      Map<String, Object> model){

        UserBD userBD = new UserBD(id, name, surname, patronymic, email, birthDay, mobileNumber);

        userBDRepository.save(userBD);
        Iterable<UserBD> UserBD = userBDRepository.findAll();
        model.put("User", UserBD);

        return "redirect:/signIn";
    }
}