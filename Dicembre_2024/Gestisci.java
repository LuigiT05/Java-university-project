package Dicembre_2024;

public class Gestisci {
    public static void main(String[] args) {
        ElencoLibri elenco = new ElencoLibri(10);
        LibroCartaceo l1 = new LibroCartaceo("la bella", "Luigi", "ciao \n mondo", "rob", 1);
        elenco.aggiungi(l1);
        AudioLibro l2 = new AudioLibro("La brutta","Marco","hello world", "Luigi", 90);
        elenco.aggiungi(l2);
        elenco.cerca("la bella");
        elenco.ordina();
        elenco.stampa();
        elenco.fruisciLibro();
    }
}
