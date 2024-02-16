package com.example.starspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("/lotti")
@RequiredArgsConstructor
@Controller
public class LottiController {

    @GetMapping("/home")
    public String viewer() {
        return "lotti_form";
    }
}
