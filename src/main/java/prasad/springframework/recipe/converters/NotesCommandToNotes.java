package prasad.springframework.recipe.converters;


import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import prasad.springframework.recipe.Commands.IngredientCommand;
import prasad.springframework.recipe.Commands.NotesCommand;
import prasad.springframework.recipe.model.Ingredient;
import prasad.springframework.recipe.model.Notes;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand notesCommand) {
        if (notesCommand == null)
        {
            return null;
        }

        final Notes notes= new Notes();
        notes.setId(notesCommand.getId());
        notes.setRecipenotes(notesCommand.getRecipenotes());

        return notes;
    }



}
