import java.util.ArrayList;
import java.util.List;

public class Fretboard
{

    private Tuning tuning = Tuning.STANDARD;
    private int maxFrets = 20;
    List<GuitarString> strings = new ArrayList<>();

    Fretboard(Scale scale)
    {
        switch(tuning)
        {
            case STANDARD:
                strings.add( new GuitarString(Note.E, maxFrets));
                strings.add( new GuitarString(Note.A, maxFrets));
                strings.add( new GuitarString(Note.D, maxFrets));
                strings.add( new GuitarString(Note.G, maxFrets));
                strings.add( new GuitarString(Note.B, maxFrets));
                strings.add( new GuitarString(Note.E, maxFrets));
                break;
            default:
                System.err.println("Error in Tuning");
                break;
        }


        for(GuitarString string : strings)
        {
            System.out.println(string);
        }


    }



}
