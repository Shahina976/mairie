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
	   registre.ajouterPersonne("momo","momo","mm","Paris","f",new Date("12/12/2012") );
	   registre.ajouterPersonne("Mario joy", "Mario joy","Samantha","Paris","F",new Date("31/08/2000"));
	   registre.ajouterPersonne("sam", "sam","Sam","Paname","F",new Date("11/12/1212"));

	   
	 //  Mariage(x,y);
    
	//   afficherActeDeNaissance(x);
  // Divorcer(x,y,new Date("12/12/1212"));
  // afficherActeDeNaissance(x);
	 // Mariage(a,z);
	
	// afficherActeDeNaissance(x);
	// Divorcer(x,y,new Date("12/12/1212"));
	// afficherActeDeNaissance(x);
	//declarerDeces(x,new Date("12/11/1122"));
	//declarerDeces(b,new Date("12/11/1122"));
	//declarerDeces(z,new Date("12/11/1122"));
	//System.out.println(deces.listDeces);
	  // registre.trouverPersonne(0);
	  // registre.trouverPersonne(1);
	  // registre.trouverPersonne(3);
	  //System.out.println( x.getIdentifiant());
	  // x.affichage();
	  // a.affichage();
	  // z.affichage();
	// SaisirNouvellePersonne();
	   
	//  System.out.println(mariage.listMariage);
	  // Mariage(z,y);
	  
	  // System.out.println(mariage.listMariage);
	   
	  // System.out.println(x.mariage);
	  
		//System.out.println(x.mariage);
		//System.out.println(y.mariage);
		//System.out.println(z.mariage);
		//System.out.println(mariage.listMariage);
	   
	  // 	 System.out.println(p);


   //	System.out.println(registre.listPersonne);

	   
	}


//public static Personne trouverPersonne(ArrayList<Personne> listPersonne) {	 
	//System.out.println("Entrez l'identifiant du citoyen : ");
	//Scanner clav = new Scanner(System.in);
	//int id1 = clav.nextInt();
		//for (int j = 0;j<listPersonne.size(); j++) { 
			//if (id1 ==listPersonne.get(j).numeroId) {
				//Personne x = listPersonne.get(j);		
				//return x;	
		//	} 
	//	}
	
	//return null;		
//}




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
	   }
}



public static Personne choixNom(Personne x, Personne y) {
	System.out.println("1 : "+x.nom);
	System.out.println("2 : "+y.nom);
	int choix = clav.nextInt();							
	if(choix == 1) {
		System.out.println(x.nom);
		return x;										
	} 
	System.out.println(y.nom);
	return y;
	
}

public static void Mariage(Personne x,Personne y){

	
if(x.estMarie() == true) {			
	System.out.println(x.nom+" "+x.prenom+" est déjà marié.");
	
}else if(y.estMarie() == true) {
		System.out.println(y.nom+" "+y.prenom+" est déjà marié.");

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
	
}}


public static void Divorcer(Personne x, Personne y,Date date) {
	
	if(x.numeroId==y.numeroId) { 
		System.out.println("il s'agit de la même personne, vérifiez les identifiants");
			
		}
	if ((x.mariage.isEmpty())||(y.mariage.isEmpty())) {	
		System.out.println
		(x.nom +" "+ x.prenom+" et " +y.nom +" "+ y.prenom+" ne sont pas mariés entre eux.");
	}
	int i = x.mariage.size()-1;
   	if (x.mariage.get(i).personne2 == y) {			
   		x.mariage.get(i).setDivorce(x, y,date);
		i = y.mariage.size()-1;
		y.mariage.get(i).setDivorce(x,y,date);
		divorce.listDivorce.add((new Divorce(x,y,date)));
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
	
public static void declarerDeces(Personne x, Date date) {
	deces.listDeces.add((new Deces(x,date)));
	System.out.println("Le décès de "+x.nom+" est déclaré");
}
public static void afficherActeDeNaissance(Personne x) {
   x.affichage();
}
 }


  
