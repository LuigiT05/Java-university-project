package bagagli;

public class Indumento extends EffettoPersonale{
	private String ingombro;
	// metodi 
	public Indumento(String ingombro, String tipo, double d){
		super(tipo,d);
		this.ingombro=ingombro;
	}
	@Override
	public boolean preparaPerViaggio()throws GrandeEccezione{
            if(ingombro.equalsIgnoreCase("XL")){
            	throw new GrandeEccezione("Indumento troppo grande");
            	 //return false; post-eccezione non serve a nulla 
            }
            System.out.println("Indumento messo in valigia :)");
            return true;
	}
	@Override
	public String toString(){
		return " indumento taglia: " +ingombro + " tipo: " +this.getTipo(); 
	}

}