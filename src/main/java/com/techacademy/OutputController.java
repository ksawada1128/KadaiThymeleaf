package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
    @PostMapping("/output")
    public String postOutput(@RequestParam String val, Model model) {
        //フォームからの値を登録
        model.addAttribute("val", val);
        //linkパラメーターとして利用
        model.addAttribute("previousParam", val);
        return "output";
    }
}
