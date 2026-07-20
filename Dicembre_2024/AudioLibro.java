package Dicembre_2024;

public class AudioLibro extends Libro{
	private String voceNarrante;
	private int durata;
	//metodi
	public AudioLibro(String titolo,String autore, String contenuto, String voce, int durata){
		super(titolo,autore,contenuto);
		voceNarrante=voce;
		this.durata=durata;
	}
	@Override
	public void consuma(){
		System.out.println(this.contenuto);
	}
	@Override
	public String toString(){
		return "Audiolibro " + super.toString();
	}
}