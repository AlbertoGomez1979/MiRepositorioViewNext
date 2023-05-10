package com.app.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String welcome(Model model) {
    model.addAttribute("greeting", "Bienvenido a la tienda en linea, mi arma!");
    model.addAttribute("tagline", "Un perfecto espacio para ti.");
    return "welcome";
  }
  
}
