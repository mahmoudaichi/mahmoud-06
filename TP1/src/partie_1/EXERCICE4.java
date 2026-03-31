package partie_1;
import java.util.Scanner;
public class EXERCICE4 {
	  public static void main(String[] args) {
		  System.out.println("entrer un nombre:");
		  Scanner scanner = new Scanner(System.in);
		  int N = scanner.nextInt();
		  int i = 0 ;
		  int t = 0 ;
		  while(i<=N) {
			  t = t + i ;
			  i++ ;
		  }
		  System.out.println("La somme de les " + N +" premier nombre est : " + t);
		  scanner.close();
	  }

}
