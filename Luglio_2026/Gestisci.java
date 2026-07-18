package Luglio_2026;

public class Gestisci{
	public static void main(String[] args) {
		Simulazione<OggettoInMovimento> s1 = new Simulazione<>();
        Itinerario i1 = new Itinerario("C:\\Users\\luigi\\Desktop\\Java\\text.txt");
        Turista t1 = new Turista(10,10,"Luca",i1);
        Elicottero e1 = new Elicottero(3,3,"C03",5,5,200);
        s1.aggiungi(t1);
        s1.aggiungi(e1);
        s1.isEmpity();
        s1.eseguiSimulazione();
        System.out.println("Ciao");
        Simulazione<OggettoInMovimento> s2 = new Simulazione<>(s1.ancoraInMovimento());
        s2.eseguiSimulazione();

	}
}