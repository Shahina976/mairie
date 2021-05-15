import java.util.ArrayList;
public class Divorce {
	public Personne personne1;
	public Personne personne2;
	public Date dateDivorce;
	public Divorce divorce;
	
	ArrayList<Divorce>listDivorce=new ArrayList<Divorce>();
	
	public Divorce(Personne x, Personne y, Date date) {	
    	dateDivorce = date;	
    	personne1=x;
    	personne2=y;
    }
	
	public Divorce(){
		this.listDivorce = new ArrayList<Divorce>();
	}
}


