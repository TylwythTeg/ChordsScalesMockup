import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Chord extends Triad
{
    protected String name;
    List<Note> notes = new ArrayList<>();


    public String getName()
    {
        return name;
    }

    Chord(Note ... notes)
    {
        this.notes = Arrays.asList(notes);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name + ": " + notes.toString();
    }




}
