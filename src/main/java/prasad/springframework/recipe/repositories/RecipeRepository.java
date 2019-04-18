package prasad.springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.recipe.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
