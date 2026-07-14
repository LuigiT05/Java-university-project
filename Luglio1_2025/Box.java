package Luglio1_2025;

public class Box <T> implements Comparable<Box<?>>{
	private String codice;
	private double larghezza;
	private double altezza;
	private double profondita;
	T contenuto;
	//metodi 
	public Box(String codice,double l, double a, double p, T c){
		contenuto=c;
		this.codice=codice;
		larghezza=l;
		altezza=a;
		profondita=p;
	}
	public String getId(){
		return codice;
	}
	public double getVolume(){
		return altezza * larghezza * profondita * 3;
	}
	@Override
	public String toString(){
		return "Box codice: " + codice +"Volume: " + getVolume() + " tipo di trasporto: " + contenuto.toString();  //posso utilizzare toString() su contenuto perche il limite superiore di T e default Object
	}
       //compareTo per id
	@Override
	public int compareTo(Box<?> b){
      return this.codice.compareTo(b.getId());   //utilizzo compareTo() delle stringhe 
	}

}