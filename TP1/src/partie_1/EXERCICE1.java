package partie_1;
import java.util.Scanner;
public class EXERCICE1 {
	
	    public static void main(String[] args) {
	    	System.out.println("Donner moi un nombre :");
	    	Scanner scanner = new Scanner(System.in);
	    	int nombre = scanner.nextInt();
	    	if(nombre>0) {
	    		System.out.println("Le nombre est positif");
	    		
	    	}
	    	if(nombre<0) {
	    		System.out.println("Le nombre est negatif");
	    		
	    	}
	    	if(nombre==0) {
	    		System.out.println("Le nombre est null");
	    		
	    	}
	    	scanner.close();
	    	
	       
	    }
	    
	}

