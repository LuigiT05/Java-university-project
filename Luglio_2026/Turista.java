package Luglio_2026;

public class Turista extends OggettoInMovimento{
	private String nome;
	private int contTappa;
	private Itinerario tappe;
	//metodi
	public Turista(int x,int y, String nome,Itinerario t){
		super(x,y);
		this.nome=nome;
		tappe=t;
	}
	@Override
	public void avanza(){
		if(destinazioneRaggiunta())
			return;
		Tappa temp[]= tappe.getTappe();
		if(temp[contTappa].getNome() != null){
		this.setX(temp[contTappa].getX());
		this.setY(temp[contTappa].getY());
	    }
	    contTappa++;
		
	    
	}
	@Override
	public boolean destinazioneRaggiunta(){
		Tappa temp[]= tappe.getTappe();
		int k=0;
		for(int i=0;i<temp.length;i++){
			if(temp[i].getNome() != null)
				k++;
		}
          if(contTappa== k){
          	System.out.println("Destinazione raggiunta");
          	return true;
         }
          return false;
	}
}