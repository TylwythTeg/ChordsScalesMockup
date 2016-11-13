import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Chord //extends Triad
{
    protected String name;
    protected Note root;
    Triad type;
    protected List<Note> notes = new ArrayList<>();

    //attributes/variants


    public String getName()
    {
        return name;
    }

    Chord()
    {

    }

    Chord(Note ... chordNotes)
    {

        List<Note> newNotes = new ArrayList<>(Arrays.asList(chordNotes));
        this.notes = newNotes;
        //notes.add(Note.GSHARP);
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

    public static Chord major(Note root)
    {
        Chord chord = new MajorChord(root);
        return chord;
    }

    public static Chord minor(Note root)
    {
        Chord minorChord = new MinorChord(root);
        return minorChord;
    }

    public static Chord suspended(Note root, Interval interval)
    {
        Chord susChord = new SuspendedChord(root,interval);
        return susChord;
    }

    public static Chord augmented(Note root)
    {
        Chord augChord = new AugmentedChord(root);
        return augChord;
    }

    public static Chord diminished(Note root)
    {
        Chord dimChord = new DiminishedChord(root);
        return dimChord;
    }

    public static Chord flatFifth(Note root)
    {
        Chord chord = new FlatFifthChord(root);
        return chord;
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

    //public static Chord of(Note ... notes)
    //{

    //}







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
