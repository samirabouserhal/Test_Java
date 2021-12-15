public class Bow
{
    private String nom;
    private Double range;

    public Bow (String n, Double r )
    {
        nom=n;
        range=r;
    }    

    public void setNomBow(String x)
    {
        nom=x;
    }

    public void setRangeBow(Double y)
    {
        range=y;
    }

    public String getNomBow()
    {
        return nom;
    }

    public Double getRangeBow()
    {
        return range;
    }

    public void afficherBow()
    {
        System.out.println("un bow nommé "+nom+" et son range est de "+range);
    }
}
