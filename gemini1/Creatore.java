package gemini1;

public class Creatore{
	private String nome;
	private String cognome;
	//metodi
	@Override
	public String toString(){
		return nome+cognome;
	}
	public Creatore(String n,String c){
		this.nome=n;
		this.cognome=c;
	}
}