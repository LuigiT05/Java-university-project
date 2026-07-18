package Luglio_2026;

public class Elicottero extends OggettoInMovimento{
	private String codice;
	private int incendioX;
	private int incendioY;
	private int litri;
	private boolean interventoCompletato;
	// metodi 
	public Elicottero(int x,int y,String codice,int incendioX, int incendioY,int litri){
		super(x,y);
		this.codice=codice;
		this.incendioX=incendioX;
		this.incendioY=incendioY;
		this.litri=litri;
		interventoCompletato=false;
	}
	@Override
	public boolean destinazioneRaggiunta(){
		if(this.getX()==incendioX && this.getY()==incendioY){
			System.out.println("Destinazione Raggiunta");
		   interventoCompletato=true;
		   litri=0;
		   return true;
		}
		return false;
	}
	@Override
	public void avanza(){
		int x_attuale= this.getX();
		int y_attuale= this.getY();
		if(!(this.destinazioneRaggiunta())){
		if(incendioX >x_attuale)
			this.setX(x_attuale+1);
		if(incendioY > y_attuale)
			this.setY(y_attuale+1);
		if(incendioX < x_attuale)
			this.setX(x_attuale-1);
		if(incendioY < y_attuale)
			this.setY(y_attuale-1);
		}
		
		
	}
}
