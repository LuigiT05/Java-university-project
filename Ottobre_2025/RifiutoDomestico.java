package Ottobre_2025;

public class RifiutoDomestico implements Riciclabile {
    private String descrizione;
    private String codiceMateriale;
    // metodi
    public RifiutoDomestico(String descrizione, String codiceMateriale){
        this.descrizione = descrizione;
        this.codiceMateriale = codiceMateriale;
    }
    @Override
    public String toString(){
        return codiceMateriale + " " + descrizione;
    }
    @Override 
    public String riciclabile(Tabella t){
        String ritorno = t.categoriaPerCodice(this.codiceMateriale);
        return ritorno;
    }
    
    
}
