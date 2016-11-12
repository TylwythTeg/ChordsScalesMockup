
public class AeolianScale extends Scale
{
    AeolianScale(Note root)
    {
        name = root + " Aeolian (Natural Minor)";
        type = "Aeolian";
        this.root = root;

        //Build scale with appropriate notes based on root
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(3));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(10));

        //add triad triads based on scale
        triads.add(new Chord(notes.get(0), notes.get(2), notes.get(4))); //i
        triads.add(new Chord(notes.get(1), notes.get(3), notes.get(5))); //iio
        triads.add(new Chord(notes.get(2), notes.get(4), notes.get(6))); //III
        triads.add(new Chord(notes.get(3), notes.get(5), notes.get(0))); //iv
        triads.add(new Chord(notes.get(4), notes.get(6), notes.get(1))); //v
        triads.add(new Chord(notes.get(5), notes.get(0), notes.get(2))); //VI
        triads.add(new Chord(notes.get(6), notes.get(1), notes.get(3))); //VII

        //set names for triads
        triads.get(0).setName(notes.get(0) + " Minor");
        triads.get(1).setName(notes.get(1) + " Diminished");
        triads.get(2).setName(notes.get(2) + " Major");
        triads.get(3).setName(notes.get(3) + " Minor");
        triads.get(4).setName(notes.get(4) + " Minor");
        triads.get(5).setName(notes.get(5) + " Major");
        triads.get(6).setName(notes.get(6) + " Major");


    }
    AeolianScale()
    {

    }

}
