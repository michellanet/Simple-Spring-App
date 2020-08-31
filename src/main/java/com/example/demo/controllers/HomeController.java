/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author michellanet
 */
@Controller
public class HomeController {

    @GetMapping("/{name}")
    //@RequestParam("name")
    public ModelAndView Index(@PathVariable("name") Optional<String> name) {

        ModelAndView modelView = new ModelAndView();

        if (name.isPresent()) {
            modelView.addObject("name", name.get());
        }

        modelView.setViewName("index");

        return modelView;
    }
}
