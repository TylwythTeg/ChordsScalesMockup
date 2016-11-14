import java.util.List;


public class DoubleHarmonicMajorScale extends Scale
{
    //Right now this class poses an inevitable problem, and that's chords beyond the simple triads.
    //It's a problem in the others, but this is more apparent because certain notes in the scale
    //e.g. the second and 3rd note in the scale have both Major and Minor
    //second note has augmented too



    DoubleHarmonicMajorScale(Note root)
    {
        this.root = root;
        type = "Double Harmonic Major";
        name = root + " Double Harmonic Major";


        //Build scale with appropriate notes based on root
        addNotes();

        //Build triads
        addTriads();

        //build variants here
        //addTriadVariants();

        System.out.println("TRIADS FOR " + this + ": ");
        System.out.println(realTriads);

    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(1));
        notes.add(root.plus(4));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(11));
    }



}
