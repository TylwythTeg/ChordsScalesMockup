import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Chord extends Triad
{
    String name;
    List<Note> notes = new ArrayList<>();


    public String getName()
    {
        return name;
    }

    Chord(Note ... notes)
    {
        this.notes = Arrays.asList(notes);
    }

    @Override
    public String toString()
    {
        return notes.toString();
    }




}
