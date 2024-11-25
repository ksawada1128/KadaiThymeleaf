package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {
    @GetMapping("/input")
    public String getInput(@RequestParam(required = false, defaultValue = "") String previous, Model model) {
        if(!previous.isEmpty()) {
            model.addAttribute("previousMessage", "前回入力された値は「" + previous + "」でした。");
        }
        return "input";
    }

}
