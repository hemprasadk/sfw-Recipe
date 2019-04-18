package prasad.springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.recipe.model.Category;
import prasad.springframework.recipe.model.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
