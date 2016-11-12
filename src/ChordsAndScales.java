//Entry point to test implementation
public class ChordsAndScales
{


    Note note = Note.A;

    public static void main(String[] args)
    {
        System.out.println("hey");
        new ChordsAndScales();
    }



    public ChordsAndScales()
    {
        IonianScale aMajorScale = new IonianScale(Note.A);
        IonianScale cMajorScale = new IonianScale(Note.C);
        IonianScale eMajorScale = new IonianScale(Note.E);

        System.out.println(aMajorScale + ": " + aMajorScale.getChords());
        System.out.println(cMajorScale + ": " + cMajorScale.getChords());
        System.out.println(eMajorScale + ": " + eMajorScale.getChords());



        AeolianScale aMinorScale = new AeolianScale(Note.A);
        AeolianScale fSharpMinorScale = new AeolianScale(Note.FSHARP);

        DorianScale dDorianScale = new DorianScale(Note.D);
        DorianScale fSharpDorianScale = new DorianScale(Note.FSHARP);

        System.out.println(fSharpMinorScale + ": " + fSharpMinorScale.getChords());
        System.out.println(aMinorScale + ": " + aMinorScale.getChords());
        System.out.println(dDorianScale);
        System.out.println(fSharpDorianScale);


        System.out.println(new PhrygianScale(Note.E));
        System.out.println(new PhrygianScale(Note.B));

        System.out.println(new LydianScale(Note.F));
        System.out.println(new LydianScale(Note.D));

        System.out.println(new MixolydianScale(Note.G));


        System.out.println(new AeolianScale(Note.A));
        System.out.println(new AeolianScale(Note.CSHARP));

        System.out.println(new LocrianScale(Note.B));
        System.out.println(new LocrianScale(Note.F));

        System.out.println(new HarmonicMinorScale(Note.D) + " " + new HarmonicMinorScale(Note.D).getChords());


        new Fretboard(new HarmonicMinorScale(Note.D));



        //for reference
        for (Note note : Note.values())
        {
            System.out.println(note);



        }


    }
}
