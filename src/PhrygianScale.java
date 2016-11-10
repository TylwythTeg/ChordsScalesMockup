
public class PhrygianScale extends Scale
{

    PhrygianScale(Note root)
    {
        name = root + " Phrygian";
        this.root = root;
        notes.add(root);
        notes.add(root.plus(1));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(10));
    }
    PhrygianScale()
    {

    }

}
