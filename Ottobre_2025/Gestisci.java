package Ottobre_2025;

public class Gestisci {
    public static void main(String[] args) {
        Tabella t = new Tabella(3);
        t.carica(0);
        RifiutoDomestico r1 = new RifiutoDomestico("plastica", "PL1");
        RifiutoDomestico r2 = new RifiutoDomestico("biglie", "C67");
        CentroSmaltimento<RifiutoDomestico> c1 = new CentroSmaltimento<>("Plastica");
        c1.conferisci(r2, t);
        c1.conferisci(r1, t);
        c1.stampa();

    }
}
