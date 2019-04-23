package prasad.springframework.recipe.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import prasad.springframework.recipe.Commands.RecipeCommand;
import prasad.springframework.recipe.converters.RecipeCommandToRecipe;
import prasad.springframework.recipe.converters.RecipeToRecipeCommand;
import prasad.springframework.recipe.model.Recipe;
import prasad.springframework.recipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
@AllArgsConstructor
public class ReciepeServiceImpl implements RecipeServices{

    private final RecipeRepository recipeRepository;
    private final RecipeCommandToRecipe recipeCommandToRecipe;
    private final RecipeToRecipeCommand recipeToRecipeCommand;



    @Override
    public Set<Recipe> getRecipe() {
        log.debug("I'm in the service");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().forEach(recipe -> recipeSet.add(recipe));
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        return recipeRepository.findById(l).orElse(null);
    }

    @Override
    @Transactional
    public RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand) {
        Recipe detachedrecipe = recipeCommandToRecipe.convert(recipeCommand);
        Recipe savedRecipe = recipeRepository.save(detachedrecipe);

        return recipeToRecipeCommand.convert(savedRecipe);
    }



}
