

public class LydianScale extends Scale
{

    LydianScale(Note root)
    {
        this.root = root;
        name = root + " Lydian";

        addNotes();
        addTriads();
    }
    LydianScale()
    {

    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(4));
        notes.add(root.plus(6));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(11));
    }
}
