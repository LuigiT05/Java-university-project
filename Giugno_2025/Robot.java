package Giugno_2025;

public class Robot extends Macchinario{
    private boolean visione_artificiale;
    public Robot(String nome, int tempo,float p, int mode,boolean visione){
        super(nome, tempo, p, mode);
        visione_artificiale=visione;
    }
    @Override
    public float consumoBase(){
        if(visione_artificiale)
            return this.potenza*5;
        return potenza*4;
    }
}
