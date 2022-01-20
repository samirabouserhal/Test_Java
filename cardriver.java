import java.util.Scanner;
public class cardriver 
{
    public static void main(String[] args)
    {
        String Mark,Année,Couleur;
        Scanner clavier = new Scanner( System.in );
        System.out.println("Bonjour!! Voici à votre constructeur d'automobile.");
        car car1=new car("[default]", "[default]", "[default]");
        System.out.println("Jusqu'a présent, votre automobile est "+car1);
        System.out.println("Vous devrez choisir la mark, l'année et la couleur.");

        System.out.print("Choisi votre mark: ");
        Mark=clavier.nextLine();
        car1.setMake(Mark);

        System.out.print("Choisi votre année: ");
        Année=clavier.nextLine();
        car1.setYear(Année);

        System.out.print("Choisi votre couleur: ");
        Couleur=clavier.nextLine();
        car1.setColour(Couleur);

        System.out.println(car1);
    }    
}
