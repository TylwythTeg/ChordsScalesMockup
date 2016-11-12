
public class DoubleHarmonicMajorScale extends Scale
{
    //Right now this class poses an inevitable problem, and that's chords beyond the simple triads.
    //It's a problem in the others, but this is more apparent because certain notes in the scale
    //e.g. the second and 3rd note in the scale have both Major and Minor
    //second note has augmented too

    DoubleHarmonicMajorScale(Note root)
    {
        name = root + " Harmonic Minor";
        type = "Ionian";
        this.root = root;

        //Build scale with appropriate notes based on root
        notes.add(root);
        notes.add(root.plus(1));
        notes.add(root.plus(4));
        notes.add(root.plus(5));
        notes.add(root.plus(7));
        notes.add(root.plus(8));
        notes.add(root.plus(11));

        //add triad chords based on scale
        chords.add(new Chord(notes.get(0), notes.get(2), notes.get(4))); //i
        chords.add(new Chord(notes.get(1), notes.get(3), notes.get(5))); //iidim
        chords.add(new Chord(notes.get(2), notes.get(4), notes.get(6))); //IIIaug
        chords.add(new Chord(notes.get(3), notes.get(5), notes.get(0))); //iv
        chords.add(new Chord(notes.get(4), notes.get(6), notes.get(1))); //V
        chords.add(new Chord(notes.get(5), notes.get(0), notes.get(2))); //VI
        chords.add(new Chord(notes.get(6), notes.get(1), notes.get(3))); //viidim

        //set names for chords
        chords.get(0).setName(notes.get(0) + " Minor");
        chords.get(1).setName(notes.get(1) + " Diminished");
        chords.get(2).setName(notes.get(2) + " Augmented");
        chords.get(3).setName(notes.get(3) + " Minor");
        chords.get(4).setName(notes.get(4) + " Major");
        chords.get(5).setName(notes.get(5) + " Major");
        chords.get(6).setName(notes.get(6) + " Diminished");

    }
    DoubleHarmonicMajorScale()
    {

    }


}
