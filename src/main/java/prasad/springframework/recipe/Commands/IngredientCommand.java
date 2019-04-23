package prasad.springframework.recipe.Commands;

import lombok.*;
import prasad.springframework.recipe.model.Recipe;
import prasad.springframework.recipe.model.UnitOfMeasure;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String descrption;
    private BigDecimal amount;
    private UnitOfMeasure unitOfMeasure;


}
