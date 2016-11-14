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

        new MajorChord(Note.E);

        System.out.println(aMajorScale + ": " + aMajorScale.getTriads());
        System.out.println(cMajorScale + ": " + cMajorScale.getTriads());
        System.out.println(eMajorScale + ": " + eMajorScale.getTriads());



        AeolianScale aMinorScale = new AeolianScale(Note.A);
        AeolianScale fSharpMinorScale = new AeolianScale(Note.FSHARP);

        DorianScale dDorianScale = new DorianScale(Note.D);
        DorianScale fSharpDorianScale = new DorianScale(Note.FSHARP);

        System.out.println(fSharpMinorScale + ": " + fSharpMinorScale.getTriads());
        System.out.println(aMinorScale + ": " + aMinorScale.getTriads());
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

        System.out.println(new HarmonicMinorScale(Note.D) + " " + new HarmonicMinorScale(Note.D).getTriads());

        //System.out.println(new DoubleHarmonicMajorScale(Note.ASHARP) + " " + new DoubleHarmonicMajorScale(Note.ASHARP).getTriads());


        new Fretboard(new HarmonicMinorScale(Note.D));


        new Fretboard(new HarmonicMinorScale(Note.GSHARP));

        //System.out.println(new DoubleHarmonicMajorScale(Note.ASHARP) + " " + new DoubleHarmonicMajorScale(Note.ASHARP).getTriads());




        if( Note.F.isInScale(new HarmonicMinorScale(Note.D)))
        {
            System.out.println("yeah F is in D Harmonic Scale");
        }

        if( Note.F.isInScale(new IonianScale(Note.E)))
        {
            System.out.println("sdfdsf");
        }




        new DoubleHarmonicMajorScale(Note.E);



        //for reference
        for (Note note : Note.values())
        {
            System.out.println(note);



        }


    }
}
