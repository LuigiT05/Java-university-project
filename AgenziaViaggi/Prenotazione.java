package AgenziaViaggi;

public class Prenotazione implements Comparable<Prenotazione>{
    private String codice;
    private String origine;
    private String destinazione;
    private String data;
    private Persona p;
    private DepTime dt;
    // metodi 
    public void  stampaPrenotazione(){
        System.out.println("Codice prenotazione: "+ codice + " Data: " + data + "Biglietto di " + p.toString());
    }
    public Prenotazione(String codice, String origine, String destinazione, String data, String nome, String cognome, int ora, int minuti){
        this.codice=codice;
        this.origine=origine;
        this.destinazione=destinazione;
        this.data=data;
        this.p= new Persona(nome, cognome);
        this.dt= new DepTime(ora, minuti);
    }
    @Override
    public int compareTo(Prenotazione p){
        if(this.data.compareTo(p.data) ==0 && this.dt.getOra() > p.dt.getOra()){
            return 1;
        }else if(this.data.compareTo(p.data) ==0 && this.dt.getOra() == p.dt.getOra() && this.dt.getMinuti() > p.dt.getMinuti())
                return 1;
                return 0;
    }
}
        
       
