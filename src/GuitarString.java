
public class GuitarString
{
    Note frets[];

    GuitarString(Note openNote, int maxFrets)
    {
        frets = new Note[maxFrets+1];

        for(int i=0;i<frets.length;i++)
        {
            frets[i] = openNote.plus(i);
        }


    }


    public String toString()
    {
        String string = "";
        for(int i=0;i<frets.length;i++)
        {
            string += "Fret: " + i + " Note: " + frets[i] + "\n";
        }
        return string;
    }











}
