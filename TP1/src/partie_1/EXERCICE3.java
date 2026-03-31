package partie_1;
import java.util.Scanner;
public class EXERCICE3 {
	  public static void main(String[] args) {
		  System.out.println("entrer un nombre:");
		  Scanner scanner = new Scanner(System.in);
		  int nombre = scanner.nextInt();
		  System.out.println("la table de multiplication de "+ nombre +" est :");
		  for(int i=0;i<=10;i++) {
			  System.out.println(nombre + "x"+ i +"="+ nombre*i);
			  
		  }
		  
		  
		  scanner.close(); 
		  
	  }

	
	  

}
