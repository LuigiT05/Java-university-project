package Galleria;

public class Gestisci{
	public static void main(String[] args) {
		Catalogo c = new Catalogo();
	c.leggidaFile("C:\\Users\\luigi\\Desktop\\Java\\traccia.txt");
	Quadro q = new Quadro("Morte","Zik",1988,"sangue","grande");
	c.aggiungiOpera(q);
	Mostra m = new Mostra("Art","Milano","12/02/35");
	m.mostraCatalogo("C:\\Users\\luigi\\Desktop\\Java\\Compagnia.txt",c);
	}
}