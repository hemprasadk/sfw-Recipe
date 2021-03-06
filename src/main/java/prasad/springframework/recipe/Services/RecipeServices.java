package prasad.springframework.recipe.Services;

import prasad.springframework.recipe.Commands.RecipeCommand;
import prasad.springframework.recipe.model.Recipe;

import java.util.Set;

public interface RecipeServices  {

    Set<Recipe> getRecipe();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

}
