package prasad.springframework.recipe.Commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import prasad.springframework.recipe.model.Difficulty;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {

    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private Byte[] picture;
    private String directions;
    private NotesCommand notes;
    private Difficulty difficulty;
    private Set<CategoryCommand>  categoryCommands= new HashSet<>();;
    private Set<IngredientCommand> ingredientCommands = new HashSet<>();


}
