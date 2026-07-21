package Giugno_2025;

public class Pressa extends Macchinario {
    private int colpiAlMinuto;
    // metodi 
    public Pressa(String nome,int tempo, float p, int mode, int colpi){
        super(nome, tempo, p, mode);
        colpiAlMinuto = colpi;
    }
    @Override
    public float consumoBase(){
         double k = potenza *tempoUtilizzo/60.0;
         return (float)k;
    }
}
