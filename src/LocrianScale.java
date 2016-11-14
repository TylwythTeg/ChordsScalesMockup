
public class LocrianScale extends Scale
{

    LocrianScale(Note root)
    {
        this.root = root;
        name = root + " Locrian";

        addNotes();
        addTriads();
    }
    LocrianScale()
    {

    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(1));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(6));
        notes.add(root.plus(8));
        notes.add(root.plus(10));
    }

}
