import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	static Scanner clav = new Scanner(System.in);
	static Registre registre = new Registre();
	static Mariage mariage= new Mariage();
	static Deces deces= new Deces();  
	static Divorce divorce= new Divorce(); 
	static ActedeNaissance actedenaissance=new ActedeNaissance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Personne x=new Personne ("titi", "titi","titi","Paris",4,"F",new Date("31/08/2000"));
	  Personne y=new Personne("momo","momo","mm","Paris",5,"M",new Date("12/12/2012"));
	  Personne z=new Personne ("yooo", "yooo","yooo","Paris",2323,"F",new Date("12/12/2222"));
	  Personne a =new Personne("tata","toto","toto","ici",11,"M",new Date("01/05/2000"));
	  Personne b =new Personne ("polo","polo","pp","paname",12,"M",new Date("11/11/2011"));
	   registre.ajouterPersonne("momo","momo","mm","Paris","f",new Date("12/12/2000") );
	   registre.ajouterPersonne("Mario joy", "Mario joy","Samantha","Paris","F",new Date("31/08/2000"));
	   registre.ajouterPersonne("sam", "sam","Sam","Paname","F",new Date("11/12/2017"));
	   mariage.setMariage( x,y,new Date("12/12/1111"));
	   /////////////////// MENU /////////////////////
	   boolean redo = true;
	   while (redo == true){
	   affichageMenu();
	   System.out.print("Choix : ");
	   int choix=clav.nextInt();
	   while ((choix<1) || (choix>7)) {	
			System.out.print("Choix incorrect. Choisissez à nouveau : ");
			choix = clav.nextInt();
		}
	   
		if(choix==1) {
			Mariage();
		}
		if(choix==2) {
			Divorcer();
		}
		if (choix==3) {
			declarerDeces();
		}
		
		if (choix==4) {
			afficherActeDeNaissance();
		}
		
		if (choix==5) {
			registre.affichage();
		}
		
		if(choix==6) {
			SaisirNouvellePersonne();
		}
		

		if (choix==7) {						
			System.out.println("Vous allez quitter le programme. \n Confirmer ? (1 : oui/2 : non)");
			int confirmation = clav.nextInt();		
			if(confirmation==1) {
				redo=false;							
				System.out.println("Au revoir !");
			}else {
					System.out.println("Retour au menu.");
				}}}
			
	   
	}
	

	public static void affichageMenu() {	
		System.out.println("********************* BIENVENUE ***********************");
		System.out.println("*************** Gestion Citoyen Mairie *****************");
		System.out.println("\n Veuillez choisir une option du menu :");
		System.out.println("1 : Mariage");
		System.out.println("2 : Divorce");
		System.out.println("3 : Décès");
		System.out.println("4 : Affichage de l'acte de Naissance");
		System.out.println("5 : Affichage de la liste des citoyens");
		System.out.println("6 : Saisie d'une nouveau citoyen");
		System.out.println("7 : Quitter le programme");
	}
	



public static void SaisirNouvellePersonne() {
	    
	  System.out.println("Est ce un nouvel arrivant ? (1: oui/ 2: non )");
	  int reponse=clav.nextInt();
	  
	  
	   if(reponse==1) {
		 
		    System.out.println("saisir le nom : ");
		  	String nom=clav.nextLine();
		  	nom = clav.nextLine();
		  	System.out.println("saisir le nom d'usage : ");
		  	String nomUsage=clav.nextLine();
		  	System.out.println("saisir le prenom : ");
		  	String prenom=clav.nextLine();
		  	System.out.println("saisir le lieu de naissance : ");
		  	String lieuNaissance=clav.nextLine();
		  	System.out.println("saisir le sexe (M ou F): ");
		  	String sexe=clav.nextLine();
		  	System.out.println("saisir date de naissance : ");
		  	String d = clav.nextLine();
		  	Date dateNaissance = new Date(d);
		  	Personne s=new Personne(nom, nomUsage, prenom,lieuNaissance,registre.newIdentifiant(), sexe, dateNaissance);	
		    registre.ajouterPersonne (nom, nomUsage, prenom,lieuNaissance, sexe, dateNaissance);
		    System.out.println(s);
		    if (s!=null) {
				registre.listPersonne.add(s);
	 }		
	   }else {
		   Personne x = registre.trouverPersonne(registre.listPersonne);
		   if (x==null) {
				System.out.println("Vérifiez l' identifiant du citoyen ");
				}else {
					x.affichage();
				}
	   }
}



public static Personne choixNom(Personne x, Personne y) {
	System.out.println("1 : "+x.nom);
	System.out.println("2 : "+y.nom);
	int choix = clav.nextInt();							
	if(choix == 1) {
		System.out.println("Vous avez choisi :"+x.nom);
		return x;										
	} 
	System.out.println("Vous avez choisi :"+y.nom);
	return y;
	
}

public static void Mariage(){
	Personne x = registre.trouverPersonne(registre.listPersonne);
	Personne y = registre.trouverPersonne(registre.listPersonne);

if (x==null) {
	System.out.println("Vérifiez l' identifiant du citoyen 1 ");
}else if(y==null) {
	System.out.println("Vérifiez l' identifiant du citoyen 2 ");
}else {
 
if(x.estMarie() == true) {			
	System.out.println(x.nom+" "+x.prenom+" est déjà marié.");
	
}else if(y.estMarie() == true) {
		System.out.println(y.nom+" "+y.prenom+" est déjà marié.");
}else if(x.ageLegal(18) == false) {	
			System.out.println(x.nom+" "+x.prenom+" n'est pas majeur, le mariage est impossible.");
	
}else if(y.ageLegal(18) == false) {
			System.out.println(y.nom+" "+y.prenom+" n'est pas majeur, le mariage est impossible.");

}else{
	
	Date dateDuJour = new Date("20/04/2020");
	x.mariage.add((new Mariage(x,y,dateDuJour)));
	y.mariage.add((new Mariage(y,x,dateDuJour)));
	mariage.listMariage.add((new Mariage(x,y,dateDuJour)));

	System.out.println("Saisissez le choix du nom de famille commun du couple"); 
	if(choixNom(x,y)==x) {							
		y.changeName(y, x.nom);
	} else {
		x.changeName(x, y.nom);
	}
	System.out.println("Le nom de famille choisi est " +x.nomUsage);
	System.out.println(x.nomUsage +" "+ x.prenom+" et " +y.nomUsage+" "+y.prenom+" sont maintenant mariés.");
	
}}}




public static void Divorcer() {
	Personne x = registre.trouverPersonne(registre.listPersonne);
	Personne y = registre.trouverPersonne(registre.listPersonne);
  	Date dateDivorce = new Date("14/05/2021");
	
	
	if(x.numeroId==y.numeroId) { 
		System.out.println("il s'agit de la même personne, vérifiez les identifiants");
			
		}
	if ((x.mariage.isEmpty())||(y.mariage.isEmpty())) {	
		System.out.println
		(x.nom +" "+ x.prenom+" et " +y.nom +" "+ y.prenom+" ne sont pas mariés entre eux.");
	}
	int i = x.mariage.size()-1;
   	if (x.mariage.get(i).personne2 == y) {			
   		x.mariage.get(i).setDivorce(x, y,dateDivorce);
		i = y.mariage.size()-1;
		y.mariage.get(i).setDivorce(x,y,dateDivorce);
		divorce.listDivorce.add((new Divorce(x,y,dateDivorce)));
		repriseNomInitial(x,y);				
		System.out.println(x.nom +" "+ x.prenom+" et " +x.nom +" "+ x.prenom+" sont maintenant divorcés.");
		
   	} else {										
		System.out.println(x.nom +" "+ x.prenom+" et " +y.nom +" "+ y.prenom+" ne sont pas mariés entre eux.");
		
   	}
	}

	

public static void repriseNomInitial(Personne x, Personne y) { 
	if(x.nomUsage == y.nom) {			
			x.nomUsage=x.nom;
		} else if (y.nomUsage == x.nom) {	
			y.nomUsage=y.nom;				
		}
	}
	
public static void declarerDeces() {
	Personne x = registre.trouverPersonne(registre.listPersonne);
	if (x==null) {
		System.out.println("Vérifiez l' identifiant du citoyen ");
	}else {
	System.out.println("Entrez la date de divorce (jj/mm/aaaa) :");
	String d = clav.nextLine();
  	Date dateDeces = new Date("14/05/2021");
	deces.listDeces.add((new Deces(x,dateDeces)));
	registre.listPersonne.remove(x);
	x.setDeces(new Deces(x,dateDeces));
	System.out.println("Le citoyen "+x.nom+" "+x.prenom+" a été enregistré décédé le "+x.decede.dateDeces);
	int i = x.mariage.size()-1;
	if (x.estMarie()==true){						
		i = x.mariage.size()-1;
		Personne veuf = x.mariage.get(i).personne2;
		if(veuf.nomUsage == x.nom) {				
			veuf.changeName(veuf,veuf.nom);			
			System.out.println("Le conjoint de "+x.nom+" "+x.prenom+" a repris son nom de naissance.");
			if(veuf.estVeuf()==true) {				
				System.out.println("Le statut du conjoint "+veuf.nom+" "+veuf.prenom+" a bien été modifié.");
			}
		}
	 }
	}
}	
public static void afficherActeDeNaissance() {
	Personne x = registre.trouverPersonne(registre.listPersonne);
	if (x==null) {
		System.out.println("Vérifiez l' identifiant du citoyen ");
	}else {
	System.out.println("Acte de naissance n° : " +x.numeroId);
	x.affichage();
	}
}

}




  
