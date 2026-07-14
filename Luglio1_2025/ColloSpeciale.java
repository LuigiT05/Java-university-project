package Luglio1_2025;

public class ColloSpeciale extends ColloNormale{
	private String caratteristica;
	private double assicurazione;
	// metodi 
	public ColloSpeciale(String n,double pu, int q, String c, double as){
		super(n,pu,q);
		caratteristica=c;
		assicurazione=as;
	}
	@Override
	public double getPrezzo(){
		if(caratteristica.equalsIgnoreCase("fragile"))
			return super.getPrezzo()+assicurazione+30;
		return super.getPrezzo()+assicurazione;
	}
}