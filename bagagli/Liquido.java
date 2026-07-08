package bagagli; 
public class Liquido extends EffettoPersonale{
	private final int maxML=100;
	private int ml;
	// metodi 
	public Liquido(int ml, double d, String tipo){
		super(tipo,d);
		this.ml=ml;
	}
	@Override
	public boolean preparaPerViaggio()throws GrandeEccezione{
		  if(ml > maxML){
		  	throw new GrandeEccezione("Liquido troppo grande");
		  	//return false; post-eccezione non serve  a nulla
		  }
		  System.out.println("l'oggetto soddisfa i valori e puo' essere imbarcato");
          return true;
	}
	@Override
	public String toString(){
		return "liquido di grandezza:" + ml + " tipo: " + this.getTipo(); 
	}
}