package Luglio_2026;

public class Tappa{
	private int min_cordinata;
	private int max_cordinata;
	private int x;
	private int y;
	private String nome;
	//metodi 
	public int getMin(){
           return min_cordinata;
	}
	public int getMax(){
		return max_cordinata;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public String getNome(){
		return nome;
	}
	public void setX(int n){
		this.x=n;
	}
	public void setY(int n){
		this.y=n;
	}
	public void setNome(String s){
		this.nome=s;
	}
	public Tappa(String s, int x,int y, int min,int max){
		nome=s;
		this.x=x;
		this.y=y;
		min_cordinata=min;
		max_cordinata=max;
	}
}