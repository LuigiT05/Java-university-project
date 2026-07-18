package Luglio_2026;
import java.util.LinkedList;

public class Simulazione<T extends OggettoInMovimento>{
	LinkedList<T> oggetti;
	//metodi 
	public Simulazione(){
		oggetti= new LinkedList<>();
	}
	public Simulazione(LinkedList<T> o){
		oggetti=o;
	}
	public void aggiungi(T object){
		oggetti.add(object);
	}
	public boolean isEmpity(){
     T temp = oggetti.peek();
     if( temp == null)
     	return true;
     return false;
	}
	public LinkedList<T> ancoraInMovimento(){
		LinkedList<T> ritorno = new LinkedList<>();
		for (T i : oggetti){
			if(!(i.destinazioneRaggiunta())){
				ritorno.add(i);
				System.out.println("oggetto aggiunto");
			}
		}
		return ritorno;
	}
	public void eseguiSimulazione(){
		for(T i : oggetti){
			i.avanza();
		}
	}

}