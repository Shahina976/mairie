
public class Date {
	
	 public int jour;
	    public int mois;
	    public int annee;
	    
	    public Date (String d) {
	   	 String [] dateDecoupe=d.split("/");
	   	 jour=Integer.parseInt(dateDecoupe[0]);
	   	 mois=Integer.parseInt(dateDecoupe[1]);
	   	 annee=Integer.parseInt(dateDecoupe[2]);
	   	 
	    }
	    
	    public String toString() {
	      	 return jour+"/"+mois+"/"+annee;
	       }


}
