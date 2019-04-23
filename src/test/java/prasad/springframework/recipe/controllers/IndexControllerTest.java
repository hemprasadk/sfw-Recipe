package prasad.springframework.recipe.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import prasad.springframework.recipe.Services.ReciepeServiceImpl;
import prasad.springframework.recipe.converters.RecipeCommandToRecipe;
import prasad.springframework.recipe.converters.RecipeToRecipeCommand;
import prasad.springframework.recipe.repositories.RecipeRepository;

import static org.junit.Assert.*;

public class IndexControllerTest {

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
    public void getIndexPage() {
    }
}