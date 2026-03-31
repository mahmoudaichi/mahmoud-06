package partie_3;
import java.util.Scanner;
public class  EXERCICE10  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lignes:");
        int lignes = scanner.nextInt();
        System.out.print("colonnes ");
        int colonnes = scanner.nextInt();

        int[][] matrice = new int[lignes][colonnes];

       
        System.out.println("entrer les elements du matrice");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print("lelement  [" + (i+1) + "][" + (j+1) + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }

       
        int[][] transpose = new int[colonnes][lignes];
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                transpose[j][i] = matrice[i][j];
            }
        }

        
        
        
        System.out.println("le tanspose est :");
        for (int i = 0; i < colonnes; i++) {
            for (int j = 0; j < lignes; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

