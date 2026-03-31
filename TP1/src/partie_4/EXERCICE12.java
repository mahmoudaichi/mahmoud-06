package partie_4;
import java.util.Scanner;
public class EXERCICE12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer une chaine ");
        String chaine = scanner.nextLine();
        String chainemin = chaine.toLowerCase();

        int s = 0;

        for (int i = 0; i < chainemin.length(); i++) {
            char c = chainemin.charAt(i); 

            if (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'y' || c == 'i') {
                s++;
            }
        }

        System.out.println("le nombre des voyelles dans le mot est : " + s);

        scanner.close();
    }
}