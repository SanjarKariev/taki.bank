package taki.Bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/history")
    public String history(Model model) {
        model.addAttribute("title", "История переводов");
        return "history";
    }

    @GetMapping("/translations")
    public String translations(Model model) {
        model.addAttribute("title", "Переводы");
        return "translations";
    }

    @GetMapping("/depositsht")
    public String depositsht(Model model) {
        model.addAttribute("title", "Вклады");
        return "depositsht";
    }

    @GetMapping("/spending")
    public String spending(Model model) {
        model.addAttribute("title", "Траты");
        return "spending";
    }

    @GetMapping("/signIn")
    public String signIn(Model model) {
        model.addAttribute("title", "Вход");
        return "signIn";
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {
        model.addAttribute("title", "Регистрация");
        return "signUp";
    }
}
