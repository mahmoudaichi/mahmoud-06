package partie_4;

import java.util.Scanner;

public class EXERCICE11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer une chaine");
		
		String s = scanner.nextLine();
		scanner.close();
		System.out.println("la longuer de la chaine est : " + s.length());
		
		
	}
	

}
