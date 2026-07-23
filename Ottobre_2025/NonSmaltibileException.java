package Ottobre_2025;

public class NonSmaltibileException extends Exception {
    public NonSmaltibileException(){
        super();
    }
    public void segnala(){
        System.out.println("Categoria non trovata");
    }
}
