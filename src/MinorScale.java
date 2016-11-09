
public class MinorScale extends Scale
{
    MinorScale(Note root)
    {
        name = root + " Minor";
        this.root = root;
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(10));
    }
    MinorScale()
    {

    }






}
