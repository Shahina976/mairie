import java.util.ArrayList;

public class Mariage {
	public Personne personne1;
	public Personne personne2;
	public Date dateMariage;
	public Divorce divorce;
	public Mariage mariage;

	ArrayList<Mariage> listMariage = new ArrayList<Mariage>();
	
	
	public Mariage() {				
		
		 this.listMariage = new ArrayList<Mariage>();
  }
	
	public Mariage(Personne x, Personne y, Date d) {
    	personne1 = x;
    	personne2 = y;
    	dateMariage = d;
    }

	public Divorce getDivorce() {				
    	return divorce;
    }
	
	public void setMariage(Personne x,Personne y,Date date) {
    	mariage = new Mariage(x,y,date);		 
    }

	public void setDivorce(Personne x,Personne y,Date date) {
    	divorce = new Divorce(x,y,date);		 
    }

	
		
		
}


