import java.util.*;
public class Deces {
	public Date dateDeces;

    public Personne personne;				
    ArrayList<Deces> listDeces = new ArrayList<Deces>();
    
    public Deces() {				
		
		 this.listDeces = new ArrayList<Deces>();
 }
    
    public Deces(Personne x, Date date) {
    	personne = x;
    	dateDeces = date;
    }
    
    public Deces(Personne x) {
    	personne = x;
    }
}
