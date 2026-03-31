package partie_2;
import java.util.Scanner;
public class EXERCICE7 {
	 public static void main(String[] args) {
		 System.out.println("entrer un nombre:");
		 Scanner scanner = new Scanner(System.in);
		 int N = scanner.nextInt();
		 int[] tab = new int[N];
		  int m ;
		 for(int i=0;i<N;i++) {
			  System.out.println("entrer le nombre n° " + (i+1));
			  m = scanner.nextInt();
			  
			  tab[i]=m ;
			 
			  
		  }
		 int max = tab[0];
		 for(int i=0;i<N;i++) {
			 if(tab[i]>max) {
			  max=tab[i];
			 
			  
		  }
			 
			 
		 
		 
	 }
		 System.out.println("Le maximum dans un tableau : " + max);
		 scanner.close();
	 }
	 
		
		 
	 }


