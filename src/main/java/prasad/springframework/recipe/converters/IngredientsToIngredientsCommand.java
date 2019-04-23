package prasad.springframework.recipe.converters;


import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import prasad.springframework.recipe.Commands.IngredientCommand;
import prasad.springframework.recipe.model.Ingredient;

@Component
public class IngredientsToIngredientsCommand implements Converter<Ingredient,IngredientCommand> {

    @Synchronized
    @Nullable
    @Override
    public IngredientCommand convert(Ingredient ingredient) {
        if (ingredient == null)
        {
            return null;
        }

        final IngredientCommand ingredientCommand= new IngredientCommand();
        ingredientCommand.setId(ingredient.getId());
        ingredientCommand.setDescrption(ingredient.getDescrption());
        ingredientCommand.setAmount(ingredient.getAmount());
        ingredientCommand.setUnitOfMeasure(ingredient.getUnitOfMeasure());

        return ingredientCommand;
    }



}
