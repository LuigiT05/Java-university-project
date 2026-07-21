package Giugno_2025;

public abstract class Macchinario implements Comparatore{
    protected String nome;
    protected int tempoUtilizzo;
    protected float potenza;
    protected int mode;
    // metodi 
    public Macchinario(String nome, int tempo, float p, int mode){
        this.nome=nome;
        tempoUtilizzo=tempo;
        potenza=p;
        this.mode=mode;
    }
    @Override
    public String toString(){
        return nome + " Modalita: " + mode;
    }
    public abstract float consumoBase();
    public float consumoFinale(){
        float k = consumoBase();
        if(mode == 0)
            return 0;
        if (mode==1)
            return k;
        if(mode>3 && mode<9)
            return k * 5;
        return  k * 10;
    }
    public void setMod(int n){
        mode=n;
    }
    @Override
    public int confronta(float p){
        if(this.consumoFinale() > p)
            return 1;
        if(this.consumoFinale()<p)
            return -1;
        return 0;
    }
}
