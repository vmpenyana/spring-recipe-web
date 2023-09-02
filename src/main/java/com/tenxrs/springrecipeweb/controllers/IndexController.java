package com.tenxrs.springrecipeweb.controllers;


import com.tenxrs.springrecipeweb.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", ""})
    public String getIndexPage(Model model) {
        recipeService.findAll();
        log.debug("IndexController()");
        return "index";
    }
}
