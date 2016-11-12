import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ChordMap
{
    ChordMap chordMap;

    //List<ChordMap> triadsMap = new ArrayList<ChordMap>();

    //TreeMap<Chord, List<Chord> > triadsMap = new TreeMap<Chord, List<Chord>>();
    //can add2? can add9?
    //scale.getNotes();
    //KNOW WHAT NOTES ARE AVAILABLE
    TreeMap<Chord, Chord> map = new TreeMap<Chord, Chord>();

    //List<Note>
    Scale scale;


    ChordMap(Scale scale)
    {
        this.scale = scale;
        scale.getRoot();
        scale.getTriads();

        List<Chord> triads = scale.getTriads();

        for (Chord triad : triads)
        {
            //if seventh is in scale
                map.put(triad,triad.DominantSeventh());

        }
    }

    ChordMap(Chord chord, Scale scale)
    {

    }



    public List<Chord> get(Note note, Triad type )
    {
        //List<Chord> chords = new ArrayList<>();
        //chords.add()

        List<Chord> chords = scale.getTriads(note); //this function let's us split into variables






        return chords;
    }





}
