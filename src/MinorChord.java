public class MinorChord extends Chord
{


    //create specific chords in scale generation?
    MinorChord(Note root)
    {
        this.root = root;
        name = root + "Minor";

        notes.add(root);
        notes.add(root.plus(Interval.MINOR_THIRD));
        notes.add(root.plus(Interval.FIFTH));

    }




}
