package prasad.springframework.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.recipe.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
