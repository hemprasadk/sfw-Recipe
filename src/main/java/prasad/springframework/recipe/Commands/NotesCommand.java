package prasad.springframework.recipe.Commands;

import lombok.*;
import prasad.springframework.recipe.model.Recipe;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipenotes;


}
