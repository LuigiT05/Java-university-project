package parcheggio;

public class Auto extends Veicolo {
    private String categoria;
    private String orientamento;
    //metodi 
    @Override
    public char getSymbol(){
        return 'A';
    }
    @Override
    public double getTariffaOraria(){
        if(categoria.equalsIgnoreCase("Piccola"))
            return 3.5;
        if(categoria.equalsIgnoreCase("Media"))
            return 5.5;
        return 6.5;
    }
    @Override
    public String toString(){
        return "Parcheggiato: Auto "+ targa + "["+categoria+"]";
    }
    public String getOrientamento(){
        return orientamento;
    }
    public Auto(String targa, String categoria, String orientamento, int r,int c){
        super(targa,r,c);
        this.categoria=categoria;
        this.orientamento=orientamento;
    }
}
