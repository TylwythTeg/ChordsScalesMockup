



public class IonianScale extends Scale
{

    IonianScale(Note root)
    {
        this.root = root;
        name = root + " Ionian (Major)";
        type = "Ionian";


        addNotes();
        addTriads();

    }
    IonianScale()
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
        notes.add(root.plus(11));
    }

}
