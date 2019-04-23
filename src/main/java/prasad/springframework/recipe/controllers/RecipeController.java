package prasad.springframework.recipe.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import prasad.springframework.recipe.Services.RecipeServices;
import prasad.springframework.recipe.repositories.RecipeRepository;

@Controller
@AllArgsConstructor
public class RecipeController {

    private final RecipeServices recipeServices;

    @RequestMapping("/recipe/show/{id}")
    public String showById(@PathVariable String id, Model model)
    {
        model.addAttribute("recipe", recipeServices.findById(new Long(id)));

        return "recipe/show";
    }
}
