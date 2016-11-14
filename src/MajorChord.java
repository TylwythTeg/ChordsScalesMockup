import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MajorChord extends Chord
{


    //create specific chords in scale generation?
    MajorChord(Note root)
    {
        this.root = root;
        name = root + "Major";

        addNotes();

    }

    /*public static MajorChord of(Note root)
    {
        MajorChord majorChord = new MajorChord(root);

        return majorChord;
    }*/
    public void addNotes()
    {
        this.notes.add(root);
        this.notes.add(root.plus(Interval.MAJOR_THIRD));
        this.notes.add(root.plus(Interval.FIFTH));
    }




}
