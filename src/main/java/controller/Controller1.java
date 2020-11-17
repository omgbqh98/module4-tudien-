package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.TuDienService;

@Controller

public class Controller1 {
    TuDienService tuDienService = new TuDienService();

    @GetMapping("/gettudien")
    public String tuDien() {
        return "tudien";
    }

    @PostMapping("/posttudien")
    public String tuDienPost(@RequestParam String input, Model model) {
        String trans= tuDienService.tuDien(input);
        model.addAttribute("trans", trans);
        model.addAttribute("input", input);
        return "tudien";
    }
}
