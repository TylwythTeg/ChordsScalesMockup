import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;


public abstract class Scale
{
    protected String name;
    protected Note root;
    protected List<Note> notes = new ArrayList<>();
    List<Chord> chords = new ArrayList<>();


    public String toString()
    {
        return name + " Scale: " + notes;
    }

    public List<Chord> getChords()
    {
        return chords;
    }



}
