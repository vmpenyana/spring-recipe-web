package com.tenxrs.springrecipeweb.domain;

import jakarta.persistence.*;

@Entity
public class Note {

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
