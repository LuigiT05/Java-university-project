package gemini1;

public class Gestisci{
	public static void main(String[] args) {
		Mediateca n= new Mediateca();
		n.leggiCatalogo("C:\\Users\\luigi\\Desktop\\Java\\traccia.txt");
		n.contaTipologie();
		n.filtraperAnno(1985);
	}
}