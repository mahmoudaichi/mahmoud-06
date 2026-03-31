package PARTIE3;
import PARTIE1.CompteBancaire;
import PARTIE2.ClasseBanque;

	public class TestBanque {
	    public static void main(String[] args) {

	        ClasseBanque b = new ClasseBanque("MarocBank", 1500);

	        CompteBancaire c1 = new CompteBancaire("Mahmoud", 1000, 500);
	        CompteBancaire c2 = new CompteBancaire("Rkia", 2000, 300);
	        CompteBancaire c3 = new CompteBancaire("Mehdi", 1500, 400);

	        b.ajouterCompte(c1);
	        b.ajouterCompte(c2);
	        b.ajouterCompte(c3);

	        c1.deposer(500);
	        c1.retirer(200);

	        c2.virementVers(c3, 300);

	        b.afficherTous();

	        System.out.println("Solde avec interet: " + c2.calculerSoldeAvecInterets());
	        System.out.println("Solde avec bonus: " + c2.calculerSoldeAvecInterets(0.015));

	        System.out.println("Nombre de comptes: " + CompteBancaire.getNbComptes());
	        System.out.println("Taux interet: " + CompteBancaire.getTauxInteretAnnuel());
	    }
	}


