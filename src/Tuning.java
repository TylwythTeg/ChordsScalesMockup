import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public enum Tuning
{
    STANDARD(Note.E, Note.A, Note.D, Note.G, Note.B, Note.E);

    List<Note> notes = new ArrayList<>();

    Tuning(Note ... notes)
    {
        this.notes = Arrays.asList(notes);
    }

    public List<Note> getNotes()
    {
        return notes;
    }









}
