import java.util.Scanner;

public class Inventory 
{
    public static void main (String[] args)
    {
        int choix;
        Double BowRange;
        String BowName, SwordName, swordType;

        
        Bow b = new Bow("[default]", 0.0);

        Sword s = new Sword("[default]","[default]");

        System.out.println("Bonjour!!! Bienvenue dans votre inventory.");
        System.out.print("Votre inventory contient ");
        b.afficherBow();
        System.out.print("et une épée nommé ");
        s.afficherSword();
        
        System.out.println("\nPour changer le nom de votre bow, écris 1.");
        System.out.println("Pour changer le nom de votre épée, écris 2.");
        System.out.println("Pour changer le range de votre bow, écris 3.");
        System.out.println("Pour changer le type de votre épée, écris 4.");
        System.out.println("Pour changer tous, écris n'importe quelle chiffre.");

        Scanner input = new Scanner(System.in);
        Scanner bow_name = new Scanner(System.in);
        Scanner sword_name = new Scanner(System.in);
        Scanner bow_range = new Scanner(System.in);
        Scanner sword_type = new Scanner(System.in);

        choix=input.nextInt();

        if (choix==1)
        {
            System.out.print("Taper le nouveau nom de votre bow: ");
            BowName=bow_name.nextLine();
            b.setNomBow(BowName);
        }

        else if (choix==2)
        {
            System.out.print("Taper le nouveau nom de votre épée: ");
            SwordName=sword_name.nextLine();
            s.setNomSword(SwordName);
        }

        else if (choix==3)
        {
            System.out.print("Taper le range de votre bow: ");
            BowRange=bow_range.nextDouble();
            b.setRangeBow(BowRange);
        }

        else if (choix==4)
        {
            System.out.print("Taper le nouveau type de votre épée: ");
            swordType=sword_type.nextLine();
            s.setTypeSword(swordType);
        }

        else
        {
            System.out.print("Taper le nouveau nom de votre bow: ");
            BowName=bow_name.nextLine();
            b.setNomBow(BowName);
            
            System.out.print("Taper le nouveau nom de votre épée: ");
            SwordName=sword_name.nextLine();
            s.setNomSword(SwordName);
            
            System.out.print("Taper le range de votre bow: ");
            BowRange=bow_range.nextDouble();
            b.setRangeBow(BowRange);
            
            System.out.print("Taper le nouveau type de votre épée: ");
            swordType=sword_type.nextLine();
            s.setTypeSword(swordType);
        }
        b.afficherBow();
        s.afficherSword();
    }
}
