import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Chord //extends Triad
{
    protected String name;
    protected Note root;
    Triad type;
    List<Note> notes = new ArrayList<>();

    //attributes/variants


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

    public Note getRoot()
    {
        return root;
    }

    public List<Chord> getVariants(Scale scale)
    {
        List<Chord> chords = new ArrayList<>();
        chords.add(new MajorChord(scale.getRoot()));

        return chords;
    }

    public void addNote(Note note)
    {
        notes.add(note);
    }

    public static Chord Major(Note root)
    {
        Chord majorChord = new MajorChord(root);
        return majorChord;
    }

    public Triad getType()
    {
        return type;
    }



    public Chord DominantSeventh()
    {
        Note notesArray[] = notes.stream().toArray(Note[]::new);

        Chord newChord = new Chord(notesArray);
        newChord.addNote(root.plus(Interval.DOMINANT_SEVENTH));

        return newChord;
    }







    //hmm
    public boolean isMajor()
    {
        // if scale.getChords().get(i).isMajor()
        // Chord chord = new chord(Note.A,Note.B, Note.C); if chord.isMajor()
        //get all notes
        //look at intervals

        return true;
    }

    public boolean isMinor()
    {

        return true;
    }


}
