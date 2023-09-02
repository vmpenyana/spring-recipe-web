package com.tenxrs.springrecipeweb.controllers;

import com.tenxrs.springrecipeweb.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    /**
     * What is this guy dependent on?
     *  -..- Recipes Service.
     *  the function getIndexPage depends on 'Model'
     */

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        /**
         * Won't mock the Index controller because it is the code under test.
         */
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        assertEquals("index", indexController.getIndexPage(model));
        // the bit below tests Objects interaction:: How many times does the Index Controller
        // call the recipeService to get the recipes. Which is expected to be (1)
        Mockito.verify(recipeService, Mockito.times(1)).findAll();
    }
}