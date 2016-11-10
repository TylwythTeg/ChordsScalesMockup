



public class IonianScale extends Scale
{

    IonianScale(Note root)
    {
        name = root + " Ionian (Major)";
        type = "Ionian";
        this.root = root;

        //Build scale with appropriate notes based on root
        notes.add(root);
        notes.add(root.plus(2));
        notes.add(root.plus(4));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(9));
        notes.add(root.plus(11));

        //add triad chords based on scale
        chords.add(new Chord(notes.get(0), notes.get(2), notes.get(4))); //I
        chords.add(new Chord(notes.get(1), notes.get(3), notes.get(5))); //ii
        chords.add(new Chord(notes.get(2), notes.get(4), notes.get(6))); //iii
        chords.add(new Chord(notes.get(3), notes.get(5), notes.get(0))); //IV
        chords.add(new Chord(notes.get(4), notes.get(6), notes.get(1))); //V
        chords.add(new Chord(notes.get(5), notes.get(0), notes.get(2))); //vi
        chords.add(new Chord(notes.get(6), notes.get(1), notes.get(3))); //viio

        //set names for chords
        chords.get(0).setName(notes.get(0) + " Major");
        chords.get(1).setName(notes.get(1) + " Minor");
        chords.get(2).setName(notes.get(2) + " Minor");
        chords.get(3).setName(notes.get(3) + " Major");
        chords.get(4).setName(notes.get(4) + " Major");
        chords.get(5).setName(notes.get(5) + " Minor");
        chords.get(6).setName(notes.get(6) + " Diminished");

    }
    IonianScale()
    {

    }

}
