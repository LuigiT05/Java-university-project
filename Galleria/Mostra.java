package Galleria;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Mostra{
	private String nome;
	private String location;
	private String data;
	// metodi
	public void ordinaCatalogo(Catalogo c){
		c.ordinaOpere();
	}
	@Override
	public String toString(){
		return " Mostra :" + nome + " Luogo e data: " + location + " & " + data;
	}
	public void mostraCatalogo(String path,Catalogo c){
      try(PrintWriter sc= new PrintWriter(path)){
         String[] s= c.visualizzaOpere();
         sc.println(this.toString());
          for(String i : s){
          	if(i==null)
          		break;
          	sc.println(i);
          }

      }catch(FileNotFoundException z ){
      	System.out.println("non trovo il file");
      }catch(SecurityException d){
      	System.out.println("Non riesce ad accede al file");
      }
	}
	public Mostra(String nome,String location,String data){
          this.nome=nome;
          this.location=location;
          this.data=data;
	}
}