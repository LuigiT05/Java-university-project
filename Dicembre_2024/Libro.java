package Dicembre_2024;

public abstract class Libro implements Fruibile,Comparable<Libro>{
	private String titolo;
	private String autore;
	protected String contenuto;
	// metodi 
	public Libro(String titolo, String autore,String contenuto){
		this.titolo=titolo;
		this.autore=autore;
		this.contenuto=contenuto;
	}
	public String getTitolo(){
		return titolo;
	}
	public String getAutore(){
		return autore;
	}
	@Override
	public void consuma(){

	}
	@Override
	public int compareTo(Libro l){
		return this.titolo.compareTo(l.getTitolo());
	}
	@Override
	public String toString(){
		return titolo + " di " + autore;
	}


}