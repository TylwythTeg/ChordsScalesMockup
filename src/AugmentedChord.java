
public class AugmentedChord extends Chord
{


    //create specific chords in scale generation?
    AugmentedChord(Note root)
    {
        this.root = root;
        name = root + "Augmented";

        notes.add(root);
        notes.add(root.plus(Interval.MAJOR_THIRD));
        notes.add(root.plus(Interval.FIFTH.sharp()));

    }

    public static AugmentedChord of(Note root)
    {
        AugmentedChord chord = new AugmentedChord(root);

        return chord;
    }




}
