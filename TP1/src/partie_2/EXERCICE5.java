package partie_2;
import java.util.Scanner;
public class EXERCICE5 {
	 public static void main(String[] args) {
		 System.out.println("entrer un nombre:");
		 Scanner scanner = new Scanner(System.in);
		 int N = scanner.nextInt();
		 int[] tableau = new int[N];
		  int m ;
		 for(int i=0;i<N;i++) {
			  System.out.println("entrer le nombre n° " + (i+1));
			  m = scanner.nextInt();
			  
			  tableau[i]=m ;
			 
			  
		  }
		 System.out.println("les elements de tableau sont : ");
		 for(int i=0;i<N;i++) {
			  System.out.println("l'element n°  "+ (i+1)+" : " + tableau[i]);
			 
			 
			  
		  }
		 scanner.close();
		 
		 
	 }
	
	

}
