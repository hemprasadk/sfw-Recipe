package prasad.springframework.recipe.Services;

import org.springframework.stereotype.Service;
import prasad.springframework.recipe.model.Recipe;
import prasad.springframework.recipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReciepeServiceImpl implements RecipeServices{

    private final RecipeRepository recipeRepository;

    public ReciepeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }



    @Override
    public Set<Recipe> getRecipe() {

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().forEach(recipe -> recipeSet.add(recipe));
        return recipeSet;
    }


}
