package partie_3;
import java.util.Scanner;
public class EXERCICE8 {
	 public static void main(String[] args) {
		 int m;
		 Scanner scanner = new Scanner(System.in);
		 int[][] tab = new int[3][3];
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 System.out.println("entrer lelement ["+ (i+1) +"]["+(j+1)+"]");
			      m = scanner.nextInt();
			  
			     tab[i][j]=m ;
			 
			  
		  }
			  
	 }
		  System.out.println("Le matrice est :");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tab[i][j]+"  ");
	            }
	            System.out.println();
	        }
		 scanner.close();
		 
	 }
		 
	

}
