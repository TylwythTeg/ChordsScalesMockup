import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ChordMap
{
    ChordMap chordMap;

    TreeMap<Chord, Chord> map = new TreeMap<Chord, Chord>();

    Scale scale;


    ChordMap(Scale scale)
    {
        this.scale = scale;
        //scale.getRoot();
        //scale.getTriads();

        List<Chord> triads = scale.getTriads();

        for (Chord triad : triads)
        {
            Note chordRoot = triad.getRoot();

            //if dom seventh is in scale
            if( (chordRoot.plus(Interval.DOMINANT_SEVENTH)).isInScale(scale));
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

        List<Chord> chords = scale.getTriadsForNote(note); //this function let's us split into variables






        return chords;
    }





}
