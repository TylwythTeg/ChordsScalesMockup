
public class MixolydianScale extends Scale
{

    MixolydianScale(Note root)
    {
        this.root = root;
        name = root + " Mixolydian";

        addNotes();
        addTriads();


    }
    MixolydianScale()
    {

    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(4));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(10));
    }

}
