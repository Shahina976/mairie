import java.util.*;
public class Personne {
	Scanner clav = new Scanner(System.in);
	  public String nom;
	    public String nomUsage;
	    public String prenom;
	    public String lieuNaissance;
	    public int numeroId;
	    public String sexe;
	    public Date date;
	    
	    public ArrayList<Mariage> mariage;
	    public ArrayList<ActedeNaissance> actedenaissance;
		public Deces decede ;
	    
	    
	    public Personne(String n, String nUsage, String p, String l, int nId, String s, Date d ) {
	   	 this.nom=n;
	   	 this.nomUsage=nUsage;
	   	 this.prenom=p;
	   	 this.lieuNaissance=l;
	   	 this.numeroId=nId;
	   	 this.sexe=s;
	   	 this.date=d;
	   	 mariage = new ArrayList<Mariage>();
	   	 decede = new Deces(this);
	    }
	    
	

	@Override
	    public String toString() {
	   	 return "Personne [nom= " + nom + ", nomUsage= " + nomUsage + ", prenom= " + prenom + ", lieuNaissance= "
	   			 + lieuNaissance + ", numeroId= " + numeroId + ", sexe= " + sexe + ", date= " + date + "]";

}
	
  public Personne(){
  	
  }
  public int getIdentifiant() {				
  	return numeroId;
  }
  
  public void ajoutMariage(Mariage m) {		
  	mariage.add(m);
  }
  
  public void ajoutActdeNaissance(ActedeNaissance m) {		
	  	actedenaissance.add(m);
	  }
		
	
	  public <Mariage> Personne(int id, String n, String p){
	    	this.numeroId = id;
	    	this.nom = n;
	    	this.nomUsage = n;
	    	this.prenom = p;
	    	ArrayList<Mariage> mariage = new ArrayList<Mariage>();

		  
	  }
	  

	    public boolean estMarie() {					
	    	if (mariage.isEmpty()) { 
	    		return false;						
	    		}
	    	int i = mariage.size()-1;				//si l'emplacement est vide dans la liste des divorces à l'indice correspondant celui du dernier mariage dans la liste des marriages 
	    	if ((mariage.get(i).divorce==null)) { //et que la personne n'est pas veuve
	    		return true;						//alors le méthode retourne vrai
	    	} 
	    	else {return false;}					//en dehors de ces conditions, la méthode retourne faux
	    
	    }
	    
	    public boolean estDivorce() {
	    	if (mariage.isEmpty()) { 				
	    		return false;						
	    		}
	    	int i = mariage.size()-1;
	    	if (mariage.get(i).divorce==null) {		
	    		return false;						
	    	} else {
	    		return true;
	    		}					
	    }
		
		

	public Personne affichage() {
		if(nomUsage!=nom) {						
    		System.out.print("Nom : " +nom);
    		if(sexe=="f") {						
    			System.out.println(", épouse : " +nomUsage);
    		} else {
    			System.out.println(", époux : " +nomUsage);
    		}

    	} else { 
    		System.out.println("Nom : " +nom);	
    	}
    	System.out.println("Prenom : " +prenom);
    	System.out.println("Date de naissance : " +date);
    	System.out.println("Numéro Identifiant : "+numeroId);
    	System.out.println("sexe : " +sexe);
    	
    	if (estMarie()==true) {
    		int i = mariage.size()-1;
    		if(sexe=="f") {						
    			System.out.println("Etat civil : mariée" );
    	    } else {
    		System.out.println("Etat civil : marié" );
    	    
    	    }
    		System.out.println("Nom du conjoint : " +mariage.get(i).personne2.nom);
    	    System.out.println("Prénom du conjoint : " +mariage.get(i).personne2.prenom);
    		System.out.println("Numéro identifiant conjoint : " +mariage.get(i).personne2.numeroId);
    		
    	}else if (estDivorce()==true) {		
    		if(sexe=="f") {						
    			System.out.println("Etat civil : célibataire (divorcée)" );
    		} else {
    			System.out.println("Etat civil : célibataire (divorcé)" );
    		}	
    	}
		return null;
	}



	public void changeName(Personne x, String nouveauNom) {
    	x.nomUsage = nouveauNom;				
    }
    
	


  }
  

