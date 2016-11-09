import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class AMajorScale extends MajorScale
{


    private Chord AMajor = new Chord(Note.A,Note.CSHARP,Note.E);
    private Chord BMinor = new Chord(Note.B,Note.D,Note.FSHARP);
    private Chord CSharpMinor = new Chord(Note.CSHARP,Note.E,Note.GSHARP);
    private Chord DMajor = new Chord(Note.D,Note.FSHARP,Note.A);
    private Chord EMajor = new Chord(Note.E,Note.GSHARP,Note.B);
    private Chord FSharpMinor = new Chord(Note.FSHARP,Note.A,Note.CSHARP);
    private Chord GSharpDiminished = new Chord(Note.GSHARP,Note.B,Note.D);


    AMajorScale()
    {
        //notes = EnumSet.of(Note.A, Note. B, Note.CSHARP, Note.D, Note.E, Note.FSHARP, Note.GSHARP);

        chords.add(AMajor);
        chords.add(BMinor);
        chords.add(CSharpMinor);
        chords.add(DMajor);
        chords.add(EMajor);
        chords.add(FSharpMinor);
        chords.add(GSharpDiminished);
    }


    public List<Chord> getChords()
    {
        return chords;
    }



}
