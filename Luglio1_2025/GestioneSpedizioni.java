package Luglio1_2025;

public class GestioneSpedizioni{
	public static void main(String[] args) {
		ColloNormale c1 = new ColloNormale("libri", 12.5,400);
		ColloNormale c2 = new ColloNormale("acqua",9.99,500);
		ColloSpeciale c3 = new ColloSpeciale("vetro", 9.80,1000,"fragile",90);
		Box<ColloNormale> b1= new Box<>("C11", 2,30,5, c1);
		Box<ColloNormale> b2 = new Box<>("C24", 2,3.5,7, c2);
		Box<ColloSpeciale> b3 = new Box<>("C77", 7,90,30,c3);
		DepositoBox d=new DepositoBox(50000);
		d.newOggetto(b1);
		d.newOggetto(b2);
		d.newOggetto(b3);
		d.ordinaPerCodice();
		Comparatore c = new Comparatore();
		d.ordinaPerVolume(c);


	}
}