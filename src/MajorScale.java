



public class MajorScale extends Scale
{


    MajorScale(Note root)
    {
        name = root + " Major";
        this.root = root;
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(4));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(11));
    }
    MajorScale()
    {

    }

}
