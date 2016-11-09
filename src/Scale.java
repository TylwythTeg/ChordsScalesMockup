import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;


public abstract class Scale
{
    protected String name;
    protected Note root;
    protected EnumSet<Note> notes = EnumSet.noneOf(Note.class);
    List<Chord> chords = new ArrayList<>();





}
