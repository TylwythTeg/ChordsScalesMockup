
public class HarmonicMinorScale extends Scale
{

    HarmonicMinorScale(Note root)
    {
        this.root = root;
        name = root + " Harmonic Minor";
        type = "Harmonic Minor";

        addNotes();
        addTriads();


        //make sure to set names for triads in specific constructor set names for triads

    }
    HarmonicMinorScale()
    {

    }


    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(11));
    }







}
