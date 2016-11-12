import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Chord extends Triad
{
    protected String name;
    List<Note> notes = new ArrayList<>();


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

    public static Chord Major(Note root)
    {
        Chord majorChord = new MajorChord(root);
        return majorChord;
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
