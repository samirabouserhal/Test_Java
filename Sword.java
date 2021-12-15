public class Sword
{
    private String nom, type;
    
    public Sword (String s, String t)
    {
        nom=s;
        type=t;
    }

    public void setNomSword(String a)
    {
        nom=a;
    }

    public void setTypeSword (String b)
    {
        type=b;
    }

    public String getNomSword()
    {
        return nom;
    }

    public String getTypeSword()
    {
        return type;
    }

    public void afficherSword()
    {
        System.out.println("votre sword est nommé "+nom+" et son type est de "+type);
    }
}