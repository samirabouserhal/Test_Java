public class car 
{
    String make, year,colour;

    public car ()
    {
        make="default";
        year="default";
        colour="default";
    }

    public car (String a, String b, String c)
    {
        make=a;
        year=b;
        colour=c;
    }

    public void setMake(String m)
    {
        make=m;
    }

    public void setYear(String y)
    {
        year=y;
    }

    public void setColour(String c)
    {
        colour=c;
    }

    public String toString()
    {
        String str = String.format("Votre véhicule est de mark '%s', d'année '%s' et de colour '%s'", this.make,this.year,this.colour);
        return str;
    }
}
