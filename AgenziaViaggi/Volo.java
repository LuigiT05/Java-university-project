package AgenziaViaggi;

public class Volo extends Prenotazione {
    private String posto;
    private int gate;
    // metodi 
    @Override
    public void stampaPrenotazione(){
          System.out.println("BUcchin");
    }
    public Volo(String posto, int gate,String codice, String origine, String destinazione, String data, String nome, String cognome, int ora, int minuti){
    	this.posto=posto;
    	this.gate=gate;
    	super(codice,origine,destinazione,data,nome,cognome,ora,minuti);
    }
}
