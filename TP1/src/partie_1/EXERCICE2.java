package partie_1;
import java.util.Scanner;
public class EXERCICE2 {
	  public static void main(String[] args) {
		  System.out.println("Donner moi trois nombre :");
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("premier nombre :");
		  int a = scanner.nextInt();
		  System.out.println("deuxieme nombre :");
		  int b = scanner.nextInt();
		  System.out.println("troisiemme nombre :");
		  int c = scanner.nextInt();
		  if(a>b && a>c) {
	    		System.out.println("Le plus grand nombre entre les trois est "+ a);
	    
	    	}else {
	    		if(b>c) {
	    			System.out.println("Le plus grand nombre entre les trois est "+ b);
	    		    
	    			
	    		}else {
	    			System.out.println("Le plus grand nombre entre les trois est "+ c);
	    		    
	    		}
	    	}
		  scanner.close();
		  
	  }

}
