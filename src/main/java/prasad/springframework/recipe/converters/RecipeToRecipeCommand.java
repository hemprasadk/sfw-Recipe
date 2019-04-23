package prasad.springframework.recipe.converters;


import lombok.AllArgsConstructor;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import prasad.springframework.recipe.Commands.RecipeCommand;
import prasad.springframework.recipe.model.Recipe;

@Component
@AllArgsConstructor
public class RecipeToRecipeCommand implements Converter<Recipe, RecipeCommand> {

    private final NotesToNotesCommand notesToNotesCommand;
    private final IngredientsToIngredientsCommand ingredientsToIngredientsCommand;
    private final CategoryToCategoryCommand categoryToCategoryCommand;

    @Synchronized
    @Nullable
    @Override
    public RecipeCommand convert(Recipe recipe) {
        if (recipe == null)
        {
            return null;
        }
        final RecipeCommand recipeCommand= new RecipeCommand();
         recipeCommand.setId(recipe.getId());
        recipeCommand.setDescription(recipe.getDescription());
        recipeCommand.setDifficulty(recipe.getDifficulty());
        recipeCommand.setNotes(notesToNotesCommand.convert(recipe.getNotes()));
        recipeCommand.setPicture(recipe.getPicture());
        recipeCommand.setCookTime(recipe.getCookTime());
        recipeCommand.setPrepTime(recipe.getPrepTime());
        recipeCommand.setDirections(recipe.getDirections());
        recipeCommand.setServings(recipe.getServings());
        recipeCommand.setSource(recipe.getSource());
        recipeCommand.setUrl(recipe.getUrl());
        if (recipe.getCategories() != null && recipe.getCategories().size() > 0) {

            recipe.getCategories().forEach(category -> recipeCommand.getCategoryCommands().add(categoryToCategoryCommand.convert(category)));

        }
        if (recipe.getIngrediants() != null && recipe.getIngrediants().size() > 0) {

            recipe.getIngrediants().forEach(ingredient -> recipeCommand.getIngredientCommands().add(ingredientsToIngredientsCommand.convert(ingredient)));
        }
           return recipeCommand;
    }



}
