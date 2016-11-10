
public class LocrianScale extends Scale
{

    LocrianScale(Note root)
    {
        name = root + " Locrian";
        this.root = root;
        notes.add(root);
        notes.add(root.plus(1));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(6));
        notes.add(root.plus(8));
        notes.add(root.plus(10));
    }
    LocrianScale()
    {

    }

}
