
public class MinorMajorSeventhChord extends Chord
{

    //create specific chords in scale generation? Probably
    MinorMajorSeventhChord(Note root)
    {
        this.root = root;
        name = root + " Minor Major 7th Chord";

        notes.add(root);
        notes.add(root.plus(3));
        notes.add(root.plus(7));
        notes.add(root.plus(11));
    }



}
