
public class FlatFifthChord extends Chord
{


    //create specific chords in scale generation?
    FlatFifthChord(Note root)
    {
        this.root = root;
        name = root + "Flat 5";

        notes.add(root);
        notes.add(root.plus(Interval.MAJOR_THIRD));
        notes.add(root.plus(Interval.FIFTH.flat()));

    }

    public static FlatFifthChord of(Note root)
    {
        FlatFifthChord chord = new FlatFifthChord(root);

        return chord;
    }




}
