
public class DiminishedChord extends Chord
{


    //create specific chords in scale generation?
    DiminishedChord(Note root)
    {
        this.root = root;
        name = root + "Major";

        notes.add(root);
        notes.add(root.plus(4));
        notes.add(root.plus(7));

    }

    public static DiminishedChord of(Note root)
    {
        DiminishedChord chord = new DiminishedChord(root);

        return chord;
    }




}
