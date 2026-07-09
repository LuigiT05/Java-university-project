package Galleria;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// fare il costruttore;
public class Catalogo{
	Opera[] opere;
	// metodi 
	public String toString(){
		return " catagolo di Opere quantita: " + opere.length;
	}
	public boolean aggiungiOpera(Opera a){
          for(int i=0; i< opere.length; i++){
          	  if(opere[i] == null){
          		opere[i]=a;
          		System.out.println("Opra inserita correntamente n: " + i );
          		return true;
          	   }
          }
          System.out.println("Impossibile inserire opera");
          return false;

	}
	public String[] visualizzaOpere(){
		String[] ritorno = new String[opere.length];
		for(int i=0;i < opere.length;i++){
			if(opere[i] == null)
				break;
			ritorno[i]=opere[i].toString();
			System.out.println(opere[i].toString());
		}
		return ritorno;
	}
	public boolean leggidaFile(String percorso){
       try(Scanner sc = new Scanner(new File(percorso))){    //creo lo scanner e vedo se puo lanciare qualche eccezione;
              int n = sc.nextInt();
              opere= new Opera[2*n];
              for(int i=0;i<n;i++){
              	if(sc.next().equalsIgnoreCase("Quadro")){
                   String titolo= sc.next();
                   String autore = sc.next();
                   int anno = sc. nextInt();
                   String tecnica = sc.next();
                   String dimensioni = sc.next();
                   opere[i] = new Quadro(titolo,autore,anno,tecnica,dimensioni);
              	}else{
                    String titolo= sc.next();
                   String autore = sc.next();
                   int anno = sc. nextInt();
                   opere[i]=new Opera(titolo,autore,anno);
              	}
              }
       }catch(FileNotFoundException e){      //eccezione di Scanner
       	System.out.println("file non trovato");
       }catch(NullPointerException k){       //eccezione di File
         System.out.println("path non valido");
       }catch(Exception e){
       	System.out.println("Eccezione generale?");

       }
     return true;
	}
	public void ordinaOpere(){
		for(int i=0;i<opere.length-1;i++){           //bubble-sort 
			for(int q=0; q<opere.length-1-i;q++){
				if(opere[q] !=null && opere[q+1] !=null){
					if(opere[q].compareTo(opere[q+1]) ==1){   //ordine crescente
					Opera temp= opere[q];
					opere[q]=opere[q+1];
					opere[q+1]=temp;
				    }
				}
			}

		}
	}


}