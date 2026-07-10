package gemini1;

public class Film extends Opera implements Noleggiabile{
	private int durataMinuti;
	@Override
	public void stampaDettagli(){
		System.out.println("e' un film.... dura "+ durataMinuti + "codice:" + this.codice);
	}
	@Override
	public double calcolaTariffa(int ore){
		return ore*prezzoOrario;
	}
	public Film(String codice, String titolo, DataRilascio dt,Creatore autore,int minuti){
           super(codice,titolo,dt,autore);
           this.durataMinuti=minuti;
	}
}