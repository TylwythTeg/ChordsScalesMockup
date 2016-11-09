
public enum Note
{
    A(0), ASHARP(1), B(2), C(3), CSHARP(4), D(5), DSHARP(6), E(7), F(8), FSHARP(9),G(10), GSHARP(11);

    private final int index;

    Note(int index)
    {
        this.index = index;
    }

    public int getIndex()
    {
        return this.index;
    }
    public static Note getByIndex(int n)
    {
        return Note.values()[n];
    }

    public Note plus(int n)
    {
        n += this.index;
        if(n >= 12)
            n -= 12;

        return getByIndex(n);
    }

    @Override
    public String toString()
    {
        switch(this)
        {
            case A:
            case B:
            case C:
            case D:
            case E:
            case F:
            case G:
                return this.name();
            case ASHARP:
                return "A#";
            case CSHARP:
                return "C#";
            case DSHARP:
                return "D#";
            case FSHARP:
                return "F#";
            case GSHARP:
                return "G#";
            default:
                return "error";

        }

    }


}
