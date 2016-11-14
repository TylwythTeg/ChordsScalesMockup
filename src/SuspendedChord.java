
public class SuspendedChord extends Chord
{
    private Interval susInterval;


    //create specific chords in scale generation?
    SuspendedChord(Note root, Interval susInterval)
    {
        this.root = root;
        this.susInterval = susInterval;
        name = root + " Suspended " + susInterval;

        addNotes();

    }

    public static SuspendedChord of(Note root, Interval interval)
    {
        SuspendedChord suspendedChord = new SuspendedChord(root, interval);

        return suspendedChord;
    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(susInterval));
        notes.add(root.plus(Interval.FIFTH));
    }




}