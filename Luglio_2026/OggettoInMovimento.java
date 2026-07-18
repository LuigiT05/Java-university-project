package Luglio_2026;

public abstract class OggettoInMovimento{
	private int x;
	private int y;
	//metodi 
	public OggettoInMovimento(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int k){
		x=k;
	}
	public void setY(int k){
		y=k;
	}
	public abstract void avanza();
	public abstract boolean destinazioneRaggiunta();
}