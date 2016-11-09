



public class MajorScale extends Scale
{


    MajorScale(Note root)
    {
        name = root + " Major";
        this.root = root;

        System.out.println("Root: " + root);

        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(4));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(11));

        //System.out.println("Root idex[0]: " + notes.g);



    }
    MajorScale()
    {

    }




    public String toString()
    {
        return name + " Scale: " + notes;
    }

}
