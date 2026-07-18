package Luglio_2026;
import java.util.Scanner;
import java.io.File;
 import java.io.FileNotFoundException;

public class Itinerario{
	private Tappa[] tappe;
	//metodi
	public Itinerario(String path){
		leggiTappe(path);
	}
	private void leggiTappe(String path){
		try(Scanner sc = new Scanner(new File(path))){
			int n = sc.nextInt();
			tappe = new Tappa[n];
			String nome;
			int x;
			int y;
			for(int i=0;i<n;i++){
              try{
             	tappe[i]= new Tappa(null,0,0,0,100);
             	nome= sc.next();
             	x=sc.nextInt();
             	y=sc.nextInt();
             	if(x<tappe[i].getMin() || x>tappe[i].getMax() || y<tappe[i].getMin() || y>tappe[i].getMax())
             		throw new ExceptionP("Out of limits",x,y);
             	tappe[i].setNome(nome);
             	tappe[i].setX(x);
             	tappe[i].setY(y);
              }catch(ExceptionP e){
             	System.out.println("Tappa negata");
               }
            }
		}catch(FileNotFoundException c){
		}
	}
	//utilizziamo una copia  profonda, in questo modo nessuno puo modificare ne l'array originale ne le informazioni al suo interno
	public Tappa[] getTappe(){
         Tappa ritorno[] = new Tappa[tappe.length];
         for(int i=0;i< tappe.length;i++){
         	ritorno[i] = new Tappa(tappe[i].getNome(),tappe[i].getX(),tappe[i].getY(),tappe[i].getMin(),tappe[i].getMax()); 
         }
         return ritorno;
	}
}