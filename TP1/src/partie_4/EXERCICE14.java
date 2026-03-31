package partie_4;
import java.util.Scanner;
public class EXERCICE14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer une chaine: ");
        String chaine = scanner.nextLine();

        String inverse = "";

   
        for (int i = chaine.length() - 1; i >= 0; i--) {
            inverse = inverse + chaine.charAt(i);
        }

      
        if (chaine.equalsIgnoreCase(inverse)) {
            System.out.println("Chaine palindrome");
        } else {
            System.out.println("chaine nest pas palidrome");
        }

        scanner.close();
    }
}



