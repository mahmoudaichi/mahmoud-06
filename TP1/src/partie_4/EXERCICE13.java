package partie_4;
import java.util.Scanner;
public class EXERCICE13 {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Entrer une chaine: ");
		  String chaine = scanner.nextLine();

		  String inverse = "";
		  for (int i = chaine.length() - 1; i >= 0; i--) {
			  inverse = inverse + chaine.charAt(i);
		  }

		  System.out.println("La chaine inversée est: " + inverse);

		  scanner.close();
		}
}
		  
	  
	


