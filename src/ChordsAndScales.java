
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

        System.out.println(aMajorScale);
        System.out.println(cMajorScale);

        //for (Note note : Note.values())
        //{



        //}


    }
}
