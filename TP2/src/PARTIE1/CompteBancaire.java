package PARTIE1;

public class CompteBancaire {

    private int numero;
    private String titulaire;
    private double solde;
    private double decouvert;
    static int nbComptes = 0 ;
    static double tauxinteret = 0.03 ;
  

   
  
    public CompteBancaire() {
    	nbComptes ++ ;
        this.numero = nbComptes;
        this.titulaire = "mmmmmm";
        this.solde = 00000;
        this.decouvert = 5000;
      
        
    }
    public CompteBancaire(String nom ,double solde,double decouvert) {
    	nbComptes ++ ;
        this.numero = nbComptes;
        this.titulaire = nom;
        this.solde = solde;
        this.decouvert = decouvert;
    
     
        
    }
    public String gettitulaire() {
    	return titulaire ;
    	
    }
    public double getdecouvert() {
    	return decouvert ;
    }
    public void settitulaire(String titulaire) {
    	if(!titulaire.isEmpty()){
    		this.titulaire= titulaire ;
    		
    		
    		
    	}
    }
    public void setdecouvert(double decouvert) {
    	if(decouvert>=0){
    		this.decouvert= decouvert ;
    		
    		
    		
    		
    	}
    	
    
    }
    public void deposer(double montant) {
    	if(montant>0){
    		this.solde += montant;
    		System.out.println(" le montant a ete effectuer avec succse");
        	
    		
    		
    		
    	}else {
    		 System.out.println(" Montant de depot invalide");
    		
    	}
    }
    public void retirer(double montant) {
    	if(montant>0 && montant<this.decouvert){
    		this.solde= this.solde-montant ;
    		System.out.println("Retrait avec succee");
        	
    		
    		
    		
    	}else {
    		 System.out.println(" Retrait refuse");
    		
    	}
    }
    
    public void virementVers(CompteBancaire autre,double montant) {
    	if(montant>0 && montant>this.solde){
    		this.solde -= montant;       
            autre.solde += montant;   
    		
    		System.out.println("Virement effectuer avec succee");
        	
    		
    		
    		
    	}else {
    		 System.out.println(" Virement impossible:montant ou solde insuffisant");
    		
    	}
    }
	public double calculerSoldeAvecInterets() {
		
		return this.solde + solde *  tauxinteret ;
		
	}
    public double calculerSoldeAvecInterets(double bonus) {
    	return this.solde + solde *  (tauxinteret + bonus) ;
		
	}
    public static int getNbComptes() {
    	return  nbComptes  ;
    	
    }
    public static double getTauxInteretAnnuel() {
    	return  tauxinteret ;
    	
    }
    public static void setTauxInteretAnnuel(double taux) {
    	tauxinteret = taux ;
    	
    }
    public void afficherInfos() {
    	System.out.println(" Infos du Compte :");
    	System.out.println("Numéro du compte : " + numero);
        System.out.println("Titulaire       : " + titulaire);
    	System.out.println("Solde           : " + solde + " MAD");
    	System.out.println("Découvert       : " + decouvert + " MAD");  
    	
    }
    
    
    
    }


     