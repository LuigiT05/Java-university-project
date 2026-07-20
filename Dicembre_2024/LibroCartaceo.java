package Dicembre_2024;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class LibroCartaceo extends Libro{
	private String nomeFile;
	private int numeroPagine;
	// metodi 
	public LibroCartaceo(String titolo, String autore, String contenuto, String nomeFile, int numero){
		super(titolo,autore,contenuto);
		this.nomeFile=nomeFile;
		this.numeroPagine=numero;
	}
	@Override
	public void consuma(){
		try(PrintWriter sc = new PrintWriter(this.getTitolo() +"_" + this.getAutore()+".txt")){
          sc.println(this.contenuto);


		}catch(FileNotFoundException e){

		}catch(SecurityException k){

		}
	}
	@Override
	public String toString(){
		return "Libro: " + super.toString();
	}
}