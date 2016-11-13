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
        System.out.println("ROOT IS " + root);

        System.out.println(notes);
        //notes.add

        System.out.println(this.notes.getClass());

        //notes = new ArrayList<>();
        this.notes.add(root);
        this.notes.add(root.plus(4));
        this.notes.add(root.plus(7));

        //System.out.println(notes);

    }

    /*public static MajorChord of(Note root)
    {
        MajorChord majorChord = new MajorChord(root);

        return majorChord;
    }*/




}
