

public class LydianScale extends Scale
{

    LydianScale(Note root)
    {
        name = root + " Lydian";
        this.root = root;
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(4));
        notes.add(root.plus(6));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(11));
    }
    LydianScale()
    {

    }

}
