package Gennaio_2025;

public class Gestisci {
   public static void main(String[] args) {
     Centralina c1 = new Centralina(10, 20);
    Illuminazione i1 = new Illuminazione("C77");
    Condizionamento h1 = new Condizionamento("C23");
    c1.aggiungi(i1);
    c1.aggiungi(h1);
    if(c1.cercaCodice("C77")){
        System.out.println("Trovato");
    }
    i1.spegni();
    i1.accendi();
    i1.accendi();
    i1.spegni();
    i1.spegni();

    c1.Elimina(i1);
    c1.stampa();
   }

}
