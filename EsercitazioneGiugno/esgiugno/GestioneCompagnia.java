package esgiugno;

public class GestioneCompagnia {
    public static void main(String[] args) {
        Compagnia c= new Compagnia(3);
        c.caricaDaFile("C:\\Users\\luigi\\Desktop\\Java\\Compagnia.txt");
        c.ordinaCosto();
        c.stampa();
        c.ordinaCognome();
        c.stampa();
    }
}
