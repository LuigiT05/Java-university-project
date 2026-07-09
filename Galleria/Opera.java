package Galleria;

public class Opera implements Comparable<Opera>{
	private String titolo;
	private String autore;
	private int annoDiCreazione;
	// metodi 
	public int getAnno(){
		return this.annoDiCreazione;
	}
	public String getAutore(){
		return autore;
	}
	public String getTitolo(){
		return titolo;
	}
	@Override
	public String toString(){
		return "Titolo: " + titolo + " autore: " + autore+ " anno: " + annoDiCreazione;
	}
	@Override
	public int compareTo(Opera o){
		
        return this.titolo.compareTo(o.getTitolo()); 
	}
	public Opera(String titolo,String autore, int anno){
		this.titolo=titolo;
		this.autore=autore;
		this.annoDiCreazione=anno;
	}

}