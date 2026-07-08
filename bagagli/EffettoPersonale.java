package bagagli;

public class EffettoPersonale{
	private String tipo;
	private double peso;
	// metodi 
	public EffettoPersonale(String tipo, double d){
		this.peso=d;
		this.tipo=tipo;
	}
	@Override
	public String toString(){
		return "Effetto personale: " + tipo + " pesa: "+ peso;
	}
	public boolean preparaPerViaggio() throws GrandeEccezione{
		if(tipo==null)
			throw new GrandeEccezione("eccezione nulla");
		return true;
	}
	public double getPeso(){
		return this.peso;
	}
	public String getTipo(){
		return tipo;
	}
}