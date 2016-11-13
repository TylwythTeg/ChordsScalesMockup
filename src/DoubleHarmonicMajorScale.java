import java.util.List;


public class DoubleHarmonicMajorScale extends Scale
{
    //Right now this class poses an inevitable problem, and that's chords beyond the simple triads.
    //It's a problem in the others, but this is more apparent because certain notes in the scale
    //e.g. the second and 3rd note in the scale have both Major and Minor
    //second note has augmented too



    DoubleHarmonicMajorScale(Note root)
    {
        //super();



        name = root + " Double Harmonic Major";
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

        for (Note note : notes)
        {
            System.out.println("CURRENT NOTE IS " + note);
            List<Chord> triads = getTriadsForNote(note);
            System.out.println("TRIADS FOR [" + note + "] ARE:  " + triads);
            realTriads.put(note,triads);

            //System.out.println(realTriads);

            //build variants below here?

        }

        //note+5;

        //add triad chords based on scale
        /*triads.add(new Chord(notes.get(0), notes.get(2), notes.get(4))); //i
        triads.add(new Chord(notes.get(1), notes.get(3), notes.get(5))); //iidim
        triads.add(new Chord(notes.get(2), notes.get(4), notes.get(6))); //IIIaug
        triads.add(new Chord(notes.get(3), notes.get(5), notes.get(0))); //iv
        triads.add(new Chord(notes.get(4), notes.get(6), notes.get(1))); //V
        triads.add(new Chord(notes.get(5), notes.get(0), notes.get(2))); //VI
        triads.add(new Chord(notes.get(6), notes.get(1), notes.get(3))); //viidim

        //set names for chords
        triads.get(0).setName(notes.get(0) + " Major");
        triads.get(1).setName(notes.get(1) + " Major/Minor");
        triads.get(2).setName(notes.get(2) + " Major/Minor/Augmented");
        triads.get(3).setName(notes.get(3) + " Minor");
        triads.get(4).setName(notes.get(4) + " Major");
        triads.get(5).setName(notes.get(5) + " Major");
        triads.get(6).setName(notes.get(6) + " Diminished");*/



        System.out.println("TRIADS FOR SCALE:");
        System.out.println(realTriads); //use orderedmap?
        System.out.println(realTriads.keySet());
        System.out.println(realTriads.get(Note.E));

        /*for(Note note : realTriads.keySet())
        {
            System.out.println(realTriads.get(Note.E));
            System.out.println(note + " Chords: " + realTriads.get(note));
        }*/


    }
    DoubleHarmonicMajorScale()
    {

    }


}
