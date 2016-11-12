import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Collections;


public abstract class Scale
{
    protected String name;
    protected String type;
    protected Note root;
    protected List<Note> notes = new ArrayList<>();
    List<Chord> triads = new ArrayList<>();

    //List<Chord> variations = new ArrayList<>();
    //TreeMap<Chord,ArrayList<Chord>> triads = new TreeMap<Chord, ArrayList<Chord>>();
    //TreeMap<Note,TreeMap >




    public String toString()
    {
        return name + " Scale: " + notes;
    }

    public Note getRoot()
    {
        return root;
    }

    public List<Chord> getTriads()
    {
        return triads;
    }

    /*List<Triad> getTriadsForNote(Note root)
    {
        List<Triad> triadsForNote = new ArrayList<>();
        //Figure out what triads exist based on the root note and scale notes

        //check MAJOR
            triadsForNote.add(Triad.MAJOR);
        //check MINOR

        //check SUSPENDED

        //check AUGMENTED

        //check FLATTED FIFTH

        //check DIMINISHED

        return triadsForNote;
    }*/

    public List<Chord> getTriads(Note root)
    {
        List<Chord> triadsForNote = new ArrayList<>();
        //Figure out what triads exist based on the root note and scale notes

        //check MAJOR
            //if(MajorIsInScale(root);
            triadsForNote.add(Chord.Major(root));
        //check MINOR

        //check SUSPENDED

        //check AUGMENTED

        //check FLATTED FIFTH

        //check DIMINISHED

        return triadsForNote;
    }
    

    public List<Chord> getChords()
    {
        return triads;
    }



}
