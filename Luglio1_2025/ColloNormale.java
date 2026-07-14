package Luglio1_2025;

public class ColloNormale implements Name{
	protected String nome;
	protected double prezzoUnitario;
	protected int quantita;
	//metodi
	public ColloNormale(String n, double pu,int q){
		nome=n;
		prezzoUnitario=pu;
		quantita=q;
	}
	@Override
	public double getPrezzo(){
         return prezzoUnitario*quantita;
	}
	@Override
	public String toString(){
		return nome;
	}
}