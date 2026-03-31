package partie_2;
import java.util.Scanner;
public class EXERCICE6 {
	 public static void main(String[] args) {
		 int[] tableau = new int[10];
		 int m ;
		 Scanner scanner = new Scanner(System.in);
		 for(int i=0;i<10;i++) {
			  System.out.println("entrer le nombre n° " + (i+1));
			  m = scanner.nextInt();
			  
			  tableau[i]=m ;
			 
			  
		  }
		 
		 System.out.println("entrer le nombre por le chercher:");
		
		 int N = scanner.nextInt();
		 int pos = 0 ;
		 boolean exist=false; 
		 for(int i=0;i<10;i++) {
			 if(N==tableau[i]) {
				 pos=i;
				 exist=true;
				 
			 }
		
			  
		  
			  
		  }
		 if(exist) {
			 System.out.println("l'element existe et sa position est : "+ pos);
	    }else {
	    	System.out.println("l'element n'existe pas");
	    }
		 scanner.close();
		 
	 }
	 

}
