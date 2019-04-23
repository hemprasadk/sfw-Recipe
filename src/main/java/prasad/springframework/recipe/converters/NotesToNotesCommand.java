package prasad.springframework.recipe.converters;


import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import prasad.springframework.recipe.Commands.NotesCommand;
import prasad.springframework.recipe.model.Notes;

@Component
public class NotesToNotesCommand implements Converter<Notes,NotesCommand> {

    @Synchronized
    @Nullable
    @Override
    public NotesCommand convert(Notes notes) {
        if (notes == null)
        {
            return null;
        }

        final NotesCommand notesCommand= new NotesCommand();
        notesCommand.setId(notes.getId());
        notesCommand.setRecipenotes(notes.getRecipenotes());

        return notesCommand;
    }



}
