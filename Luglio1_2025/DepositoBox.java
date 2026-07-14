package Luglio1_2025;
import java.util.LinkedList;   //coda->FIFO
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class DepositoBox{
	private LinkedList<Box<?>> coda;
	private final double capacitaMassima;
	private double volumeCorrente;
	//metodi 
	public DepositoBox(double capacita){
          coda = new LinkedList<>();
          capacitaMassima=capacita;
          volumeCorrente=capacita;
	}
	public boolean newOggetto(Box<?> b){
		if(b.getVolume() > volumeCorrente){
			System.out.println("Oggetto troppo grande!!");
			return false;
		}
		coda.addLast(b);  //inserito all'ultimo come vuole la politica FIFO
		volumeCorrente= volumeCorrente - b.getVolume();
		System.out.println("Oggetto inserito");
		return true;
	}
	public void rimuoviOggetto(){
		Box<?> temp= coda.peek();
		double volumeTemp= temp.getVolume();
		volumeCorrente= volumeCorrente + volumeTemp;
		coda.poll();
	}
	public void ordinaPerCodice(){
		//int n= coda.size();
		//Box[] temp = new Box[n];
		Box<?>[] temp = coda.toArray(new Box<?>[0]);  //salva tutti gli elementi della lista nell'array;
		for(int i=0;i<temp.length-1;i++){    //Bubble Sort
			for(int q=0;q<temp.length-1-i;q++){
				if(temp[q].compareTo(temp[q+1]) >0){
                    Box<?> temp2=temp[q];
                     temp[q]=temp[q+1];
                     temp[q+1]=temp2;
				}
			}
		}
		for(Box<?> i : temp){
			if( i != null)
			System.out.println(i.toString());
		}
	}
	public void ordinaPerVolume(Comparatore c){
		Box<?>[] temp = coda.toArray(new Box<?>[0]);
		for(int i=0; i<temp.length-1;i++){    //Bubble Sort
			for(int q=0;q<temp.length-1-i;q++){
				if(c.compare(temp[q],temp[q+1]) >0){
                    Box<?> temp2=temp[q];
                    temp[q]=temp[q+1];
                    temp[q+1]=temp2;
				}
			}
		}
		try(PrintWriter sc = new PrintWriter("C:\\Users\\luigi\\Desktop\\Java\\text.txt")){
             for(Box<?> i : temp){
             	if(i != null)
             	sc.println(i.toString());
             }

		}catch(FileNotFoundException n){
			System.out.println("File non trovato");

		}catch( SecurityException z){
			System.out.println("Impossibile accedere al file");
		}

	}

}

