package AgenziaViaggi;
public class Treno extends Prenotazione {
    private int carrozza;
    private String posto;
    //metodi 
    public Treno(int carrozza, String posto,String codice, String origine, String destinazione, String data, String nome, String cognome, int ora, int minuti){
        this.carrozza=carrozza;
        this.posto =posto;
        super(codice,origine,destinazione,data,nome,cognome,ora,minuti);
    }
    @Override
    public void  stampaPrenotazione(){
        System.out.println("Sono un treno" + posto);
    }

}
