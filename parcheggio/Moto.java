package parcheggio;
public class Moto extends Veicolo {
    private String tipo;
    //metodi 
    @Override
    public String toString(){
        return "Parcheggiato: Moto "+ targa+ " [" + tipo + "]";
    }
    @Override
    public char getSymbol(){
        return 'M';
    }
    @Override
    public double getTariffaOraria(){
        if(this.tipo.equalsIgnoreCase("CICLOMOTORE"))
            return 3.5;
        return 5.5;
    }
    public Moto(String s,String t, int r, int c){
        super(t, r, c);
        this.tipo=s;
    }
}
