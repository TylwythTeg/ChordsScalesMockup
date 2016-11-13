import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Collections;
import java.util.HashMap;


public abstract class Scale
{
    protected String name;
    protected String type;
    protected Note root;
    protected List<Note> notes = new ArrayList<>();
    List<Chord> triads = new ArrayList<>();


    //can get all chords through:
    //iterate through each note, each note gives a list of possible Triads in the scale
    //The Triads themselves are the key to the list of chord variants
    HashMap<Note, List<Chord>> realTriads = new HashMap<Note, List<Chord>>();
    HashMap<Chord,Chord> triadVariants = new HashMap<Chord,Chord>();




    ChordMap chordmap;

    //List<Chord> variations = new ArrayList<>();
    //TreeMap<Chord,ArrayList<Chord>> triads = new TreeMap<Chord, ArrayList<Chord>>();
    //TreeMap<Note,TreeMap >

    Scale()
    {
        //build triads
        /*for (Note note : notes)
        {
            List<Chord> triads = getTriads(note);
            realTriads.put(note,triads);

            System.out.println(realTriads);

            //build variants below here?

        }*/


    }




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

    public List<Chord> getTriadsForNote(Note chordRoot)
    {
        List<Chord> triadsForNote = new ArrayList<>();
        //Figure out what triads exist based on the root note and scale notes

        //check MAJOR
        if(this.hasTriad(chordRoot, Triad.MAJOR))
            triadsForNote.add(Chord.major(chordRoot));

        //check MINOR
        if(this.hasTriad(chordRoot, Triad.MINOR))
            triadsForNote.add(Chord.minor(chordRoot));

        //check SUSPENDED
        if(this.hasTriad(chordRoot,Triad.SUSPENDED_SECOND))
            triadsForNote.add(Chord.suspended(chordRoot,Interval.SECOND));

        if(this.hasTriad(chordRoot,Triad.SUSPENDED_FOURTH))
            triadsForNote.add(Chord.suspended(chordRoot,Interval.FOURTH));

        if(this.hasTriad(chordRoot,Triad.AUGMENTED))
            triadsForNote.add(Chord.augmented(chordRoot));

        if(this.hasTriad(chordRoot,Triad.DIMINISHED))
            triadsForNote.add(Chord.diminished(chordRoot));

        if(this.hasTriad(chordRoot,Triad.FLAT_FIFTH))
            triadsForNote.add(Chord.flatFifth(chordRoot));



        //check AUGMENTED

        //check FLATTED FIFTH
        //System.out.println("EWREWRW" + triadsForNote);

        //check DIMINISHED

        return triadsForNote;
    }

    public boolean hasTriad(Note chordRoot, Triad type)
    {
        switch(type)
        {
            case MAJOR:
                return chordRoot.plus(Interval.MAJOR_THIRD).isInScale(this) && chordRoot.plus(Interval.FIFTH).isInScale(this);
            case MINOR:
                return chordRoot.plus(Interval.MINOR_THIRD).isInScale(this) && chordRoot.plus(Interval.FIFTH).isInScale(this);
            case SUSPENDED_SECOND:
                return chordRoot.plus(Interval.SECOND).isInScale(this) && chordRoot.plus(Interval.FIFTH).isInScale(this);
            case SUSPENDED_FOURTH:
                return chordRoot.plus(Interval.FOURTH).isInScale(this) && chordRoot.plus(Interval.FIFTH).isInScale(this);
            case AUGMENTED:
                return chordRoot.plus(Interval.MAJOR_THIRD).isInScale(this) && chordRoot.plus(Interval.FIFTH.sharp()).isInScale(this);
            case FLAT_FIFTH:
                return chordRoot.plus(Interval.MAJOR_THIRD).isInScale(this) && chordRoot.plus(Interval.FIFTH.flat()).isInScale(this);
            case DIMINISHED:
                return chordRoot.plus(Interval.MINOR_THIRD).isInScale(this) && chordRoot.plus(Interval.FIFTH.flat()).isInScale(this);
            default:
                return false;

        }
    }

    public List<Note> getNotes()
    {
        return notes;
    }

    public boolean hasNote(Note note)
    {
        for (Note noteInScale : notes)
        {
            if( noteInScale == note )
                return true;
        }
        return false;
    }

    public boolean hasNotes(final Note ... theseNotes) //ugh dont use yet
    {
        for (Note thisNote : theseNotes)
        {
            for(Note scaleNote : this.notes)
            {
                if(thisNote != scaleNote)
                    return false;
            }
        }
        return true;
    }



    public List<Chord> getChords()
    {
        return triads;
    }



}
