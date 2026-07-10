package gemini1;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Mediateca{
	private ArrayList<Opera> catalogo;
	//metodi 
	public Mediateca(){
		catalogo = new ArrayList<>();
	}
	public void leggiCatalogo(String path){
		try(Scanner sc = new Scanner(new File(path))){
			int n= sc.nextInt();
			catalogo.ensureCapacity(n);
			for(int i=0;i<n;i++){
				String s= sc.next();
				if(s.equalsIgnoreCase("Libro")){
                   String codice= sc.next();
                   String titolo = sc.next();
                   int giorno = sc.nextInt();
                   int mese = sc.nextInt();
                   int anno = sc.nextInt();
                   DataRilascio dt = new DataRilascio(giorno,mese,anno);
                   String nome = sc.next();
                   String cognome = sc.next();
                   Creatore autore = new Creatore(nome,cognome);
                   int numeropg = sc.nextInt();
                   catalogo.add(new Libro(codice,titolo,dt,autore,numeropg));

				}else if(s.equalsIgnoreCase("Film")){
                    String codice= sc.next();
                   String titolo = sc.next();
                   int giorno = sc.nextInt();
                   int mese = sc.nextInt();
                   int anno = sc.nextInt();
                   DataRilascio dt = new DataRilascio(giorno,mese,anno);
                   String nome = sc.next();
                   String cognome = sc.next();
                   Creatore autore = new Creatore(nome,cognome);
                   int minuti = sc.nextInt();
                   catalogo.add(new Film(codice,titolo,dt,autore,minuti));
				}
			}
			System.out.println("inserimento terminato con successo");

		}catch(FileNotFoundException c){
			System.out.println("File non caricato");
		}catch(NullPointerException k){
			System.out.println("FileNotFoundException");
		}
	}
	public ArrayList<Opera> filtraperAnno(int anno){
		ArrayList<Opera> ritorno = new ArrayList<>();
		for(Opera i : catalogo){
			if(i != null){
				int n = i.getData().getAnno();
				if(n>anno){
					ritorno.add(i);
					i.stampaDettagli();
				}
			}
		}
		return ritorno;
	}
	public void contaTipologie(){
	      int contatoreL=0;
	      int contatoreF=0;
	      for(Opera i : catalogo){
	      	if(i instanceof Libro)
	      		contatoreL++;
	      	if(i instanceof Film)
	      		contatoreF++;
	      }
	      System.out.println(contatoreL);
	      System.out.println(contatoreF);
	}

}