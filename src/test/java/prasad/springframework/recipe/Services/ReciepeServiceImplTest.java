package prasad.springframework.recipe.Services;

import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import prasad.springframework.recipe.converters.RecipeCommandToRecipe;
import prasad.springframework.recipe.converters.RecipeToRecipeCommand;
import prasad.springframework.recipe.model.Recipe;
import prasad.springframework.recipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ReciepeServiceImplTest {


    ReciepeServiceImpl reciepeService;

    @Mock
    RecipeRepository recipeRepository;
    RecipeCommandToRecipe recipeCommandToRecipe;
    RecipeToRecipeCommand recipeToRecipeCommand;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        reciepeService = new ReciepeServiceImpl(recipeRepository,recipeCommandToRecipe,recipeToRecipeCommand);
    }

    @Test
    public void getRecipe() {

        Recipe recipe = new Recipe();
        HashSet recipeData = new HashSet();
        recipeData.add(recipe);

        when(reciepeService.getRecipe()).thenReturn(recipeData);

        Set<Recipe> recipeSet = reciepeService.getRecipe();
        System.out.println(recipeSet.size());
        assertEquals(recipeSet.size(),1);
    }
}