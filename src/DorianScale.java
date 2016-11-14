
public class DorianScale extends Scale
{


    DorianScale(Note root)
    {
        this.root = root;
        name = root + " Dorian";

        addNotes();
        addTriads();
    }
    DorianScale()
    {

    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(10));
    }






}
