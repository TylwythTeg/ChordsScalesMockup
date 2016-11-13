
public class SuspendedChord extends Chord
{


    //create specific chords in scale generation?
    SuspendedChord(Note root, Interval susInterval)
    {
        this.root = root;
        name = root + " Suspended " + susInterval;

        notes.add(root);
        notes.add(root.plus(susInterval));
        notes.add(root.plus(Interval.FIFTH));

    }

    public static SuspendedChord of(Note root, Interval interval)
    {
        SuspendedChord suspendedChord = new SuspendedChord(root, interval);

        return suspendedChord;
    }




}