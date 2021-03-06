
public class DiminishedChord extends Chord
{


    //create specific chords in scale generation?
    DiminishedChord(Note root)
    {
        this.root = root;
        name = root + "Diminished";

        addNotes();

    }

    public static DiminishedChord of(Note root)
    {
        DiminishedChord chord = new DiminishedChord(root);

        return chord;
    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(Interval.MINOR_THIRD));
        notes.add(root.plus(Interval.FIFTH.flat()));
    }




}
