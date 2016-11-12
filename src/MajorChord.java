
public class MajorChord extends Chord
{


    //create specific chords in scale generation?
    MajorChord(Note root)
    {
        this.root = root;
        name = root + "Major";

        notes.add(root);
        notes.add(root.plus(4));
        notes.add(root.plus(7));

    }




}
