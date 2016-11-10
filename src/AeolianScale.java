
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

        //add triad chords based on scale
        chords.add(new Chord(notes.get(0), notes.get(2), notes.get(4))); //i
        chords.add(new Chord(notes.get(1), notes.get(3), notes.get(5))); //iio
        chords.add(new Chord(notes.get(2), notes.get(4), notes.get(6))); //III
        chords.add(new Chord(notes.get(3), notes.get(5), notes.get(0))); //iv
        chords.add(new Chord(notes.get(4), notes.get(6), notes.get(1))); //v
        chords.add(new Chord(notes.get(5), notes.get(0), notes.get(2))); //VI
        chords.add(new Chord(notes.get(6), notes.get(1), notes.get(3))); //VII

        //set names for chords
        chords.get(0).setName(notes.get(0) + " Minor");
        chords.get(1).setName(notes.get(1) + " Diminished");
        chords.get(2).setName(notes.get(2) + " Major");
        chords.get(3).setName(notes.get(3) + " Minor");
        chords.get(4).setName(notes.get(4) + " Minor");
        chords.get(5).setName(notes.get(5) + " Major");
        chords.get(6).setName(notes.get(6) + " Major");


    }
    AeolianScale()
    {

    }

}
