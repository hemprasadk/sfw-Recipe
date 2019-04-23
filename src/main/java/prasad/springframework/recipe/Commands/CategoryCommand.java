package prasad.springframework.recipe.Commands;

import lombok.*;
import prasad.springframework.recipe.model.Recipe;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
public class CategoryCommand {

    private Long id;
    private String description;

}
