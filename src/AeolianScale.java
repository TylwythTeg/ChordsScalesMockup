
public class AeolianScale extends Scale
{
    AeolianScale(Note root)
    {
        this.root = root;
        name = root + " Aeolian (Natural Minor)";
        type = "Aeolian";


        //Build scale with appropriate notes based on root
        addNotes();
        addTriads();

    }
    AeolianScale()
    {

    }

    public void addNotes()
    {
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(10));
    }

}
