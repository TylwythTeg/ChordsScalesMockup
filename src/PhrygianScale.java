
public class PhrygianScale extends Scale
{

    PhrygianScale(Note root)
    {
        this.root = root;
        name = root + " Phrygian";

        addNotes();
        addTriads();
    }
    PhrygianScale()
    {

    }
    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(1));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(10));
    }


}
