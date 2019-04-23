package prasad.springframework.recipe.converters;


import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import prasad.springframework.recipe.Commands.CategoryCommand;
import prasad.springframework.recipe.Commands.IngredientCommand;
import prasad.springframework.recipe.model.Category;
import prasad.springframework.recipe.model.Ingredient;

@Component
public class IngredientsCommandToIngredients implements Converter<IngredientCommand, Ingredient> {

    @Synchronized
    @Nullable
    @Override
    public Ingredient convert(IngredientCommand ingredientCommand) {
        if (ingredientCommand == null)
        {
            return null;
        }

        final Ingredient ingredient= new Ingredient();
        ingredient.setId(ingredientCommand.getId());
        ingredient.setDescrption(ingredientCommand.getDescrption());
        ingredient.setAmount(ingredientCommand.getAmount());
        ingredient.setUnitOfMeasure(ingredientCommand.getUnitOfMeasure());

        return ingredient;
    }



}
