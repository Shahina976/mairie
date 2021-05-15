import java.util.ArrayList;
import java.util.Scanner;

public class Registre {
	
	ArrayList<Personne> listPersonne = new ArrayList<Personne>();
	public ArrayList<Deces> listDeces;	
	
	public void Registre() {				
							
		 this.listPersonne = new ArrayList<Personne>();
    }

	public Personne trouverPersonne (int id) {	
		Personne s;
		for (int j = 0; j < this.listPersonne.size(); j++) { 
			if (id == listPersonne.get(j).numeroId) {
				return listPersonne.get(j).affichage();
				
			}
			
		}
		return null;
		
	}
	
	
   	public int newIdentifiant () {		
		int id=0;
		for (int i = 0; i<this.listPersonne.size(); i++) {
			id =id+listPersonne.size();
		}
			return id;		
	}


	
	void ajouterPersonne(String nom, String nomUsage, String prenom, String lieuNaissance, String sexe, Date d ) {
		Personne p = new Personne(nom, nomUsage, prenom, lieuNaissance, newIdentifiant(), sexe, d);
		// créer un acte de naissance
		// le rattacher à personne 
		if (p!=null) {
			this.listPersonne.add(p);
		}
		
	}

    public void affichage() {	
    	Personne p;
    	for (int j = 0; j<listPersonne.size(); j++) {		
			p= listPersonne.get(j);				 
			System.out.println (p);
			
		}
    	int nbhabitant = listPersonne.size();				
		System.out.println("Le nombre d'habitants de la ville est "+nbhabitant);
		

    
    }
    

}



