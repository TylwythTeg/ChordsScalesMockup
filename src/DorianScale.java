
public class DorianScale extends Scale
{


    DorianScale(Note root)
    {
        name = root + " Dorian";
        this.root = root;
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(10));
    }
    DorianScale()
    {

    }







}
