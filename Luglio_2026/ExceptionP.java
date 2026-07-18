package Luglio_2026;

public class ExceptionP extends Exception{
	public int warningX;
	public int warningY;
	public ExceptionP(String s,int x,int y){
		super(s);
		warningX=x;
		warningY=y;
	}
}