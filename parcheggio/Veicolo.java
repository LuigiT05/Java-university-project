package parcheggio;

public class Veicolo {
    protected String targa;
    protected int riga;
    protected int colonna;
    // metodi 
    public char getSymbol(){
        return '*';
    }
    public double getTariffaOraria(){
        return 0;
    }
    public double calcolaCosto(double time){
        return this.getTariffaOraria()*time;
    }
    @Override
    public String toString(){
        return "veicolo generico";
    }
    public Veicolo(String t,int r, int c){
        this.targa=t;
        this.riga=r;
        this.colonna=c;


    }
    public void parcheggia(AreaParcheggio p){
          p.occupaCella(this.riga, this.colonna, this);
    }
}
