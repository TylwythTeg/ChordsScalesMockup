
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
        MajorScale aMajorScale = new MajorScale(Note.A);
        MajorScale cMajorScale = new MajorScale(Note.C);
        MajorScale eMajorScale = new MajorScale(Note.E);

        System.out.println(aMajorScale);
        System.out.println(cMajorScale);
        System.out.println(eMajorScale);



        MinorScale aMinorScale = new MinorScale(Note.A);
        MinorScale fSharpMinorScale = new MinorScale(Note.FSHARP);

        DorianScale dDorianScale = new DorianScale(Note.D);
        DorianScale fSharpDorianScale = new DorianScale(Note.FSHARP);

        System.out.println(fSharpMinorScale);
        System.out.println(aMinorScale);
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



        for (Note note : Note.values())
        {
            System.out.println(note);



        }


    }
}
