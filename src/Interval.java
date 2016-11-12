
public enum Interval
{
    UNISON(0), SECOND(2), MINOR_THIRD(3), MAJOR_THIRD(4), FOURTH(5), FIFTH(7), SIXTH(9), DOMINANT_SEVENTH(10), MAJOR_SEVENTH(11);

    int semitones;


    Interval(int n)
    {
        this.semitones = n;
    }

    public int getSemitones()
    {
        return semitones;
    }





}
