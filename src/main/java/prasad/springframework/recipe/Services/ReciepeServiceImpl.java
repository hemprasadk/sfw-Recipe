package prasad.springframework.recipe.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import prasad.springframework.recipe.model.Recipe;
import prasad.springframework.recipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class ReciepeServiceImpl implements RecipeServices{

    private final RecipeRepository recipeRepository;

    public ReciepeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }



    @Override
    public Set<Recipe> getRecipe() {
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().forEach(recipe -> recipeSet.add(recipe));
        return recipeSet;
    }


}
