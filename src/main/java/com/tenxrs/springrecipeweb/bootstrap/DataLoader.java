package com.tenxrs.springrecipeweb.bootstrap;

import com.tenxrs.springrecipeweb.domain.Ingredient;
import com.tenxrs.springrecipeweb.domain.Recipe;
import com.tenxrs.springrecipeweb.repository.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    RecipeRepository recipeRepository;

    public DataLoader(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe creamyChickenFlorentine = new Recipe();

        creamyChickenFlorentine.setDescription("""
                 Chicken Florentine is a dish that feels restaurant-quality but is surprisingly simple to make at home and ready in 30 minutes flat. With tender chicken cutlets nestled into a creamy spinach sauce, this recipe uses just one pan and is practically a complete meal all on its own. Serve with hot pasta, rice, or crusty bread for soaking up the sauce.

                Chicken breast cutlets are dredged in flour to give the meat a slight crust and add some body to the sauce. Sautéed mushrooms, garlic, Parmesan, and wilted spinach flavor the cream sauce that pairs wonderfully with the chicken. It’s satisfying but not too rich, reminiscent of creamed spinach but with the addition of hearty chicken and mushrooms.\s""");
        creamyChickenFlorentine.setCookTime(20);
        creamyChickenFlorentine.setPrepTime(10);
        creamyChickenFlorentine.setServing(5);

        Ingredient allPurposeFlower = new Ingredient();
        allPurposeFlower.setDescription("all-purpose flour");
        allPurposeFlower.setRecipe(creamyChickenFlorentine);
        Ingredient kosherSalt = new Ingredient();
        kosherSalt.setDescription("kosher salt");
        kosherSalt.setRecipe(creamyChickenFlorentine);

        Set<Ingredient> ingredients = new HashSet<>();

        ingredients.add(allPurposeFlower);
        ingredients.add(kosherSalt);

        creamyChickenFlorentine.setIngredients(ingredients);
        recipeRepository.save(creamyChickenFlorentine);
        System.out.println("Total number of recipes: " + recipeRepository.count());
    }
}
