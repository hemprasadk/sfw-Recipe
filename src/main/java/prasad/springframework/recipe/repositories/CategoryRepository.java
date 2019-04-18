package prasad.springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.recipe.model.Category;

public interface CategoryRepository extends CrudRepository <Category,Long> {
}
