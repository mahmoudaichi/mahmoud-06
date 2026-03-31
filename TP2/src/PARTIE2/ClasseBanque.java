package PARTIE2;
import PARTIE1.CompteBancaire;

public class ClasseBanque {
	public String nom ;
	private CompteBancaire [] comptes ;
	public int nbActuels ;
	
	public ClasseBanque (String nom , int capacite ) {
		this.nom = nom ;
		comptes = new CompteBancaire[capacite];
		this.nbActuels = 0 ;
		
	}
	
	public void ajouterCompte(CompteBancaire c){
		if(nbActuels < comptes.length) {
			comptes[nbActuels++]=c;
		
			
			
			
		}else {
			 System.out.println(" Banque pleine");
			
			
		}
		
	}
	public void afficherTous(){
		for(int i = 0;i<nbActuels ;i++) {
			comptes[i].afficherInfos();
		}
		
	}

}
