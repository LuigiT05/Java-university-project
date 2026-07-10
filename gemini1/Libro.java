package gemini1;

public class Libro extends Opera implements Noleggiabile{
	private int numeroPagine;
	//metodi
	@Override
	public void stampaDettagli(){
		System.out.println("Libro n.pagine" + numeroPagine + this.codice);
	}
	@Override
	public double calcolaTariffa(int ore){
		return ore*prezzoOrario;
	}
	public Libro(String codice, String titolo, DataRilascio dt, Creatore c,int numeroPagine){
		this.numeroPagine=numeroPagine;
		super(codice,titolo,dt,c);
	}
}