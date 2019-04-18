package prasad.springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.recipe.model.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository <Category,Long> {

    Optional<Category> findByDescription(String description);
}
