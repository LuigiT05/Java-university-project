package parcheggio;

public class EccezioneP extends Exception{ //ho creato un eccezione Personalizzata
    public EccezioneP(){
        super();
    }
    public EccezioneP(String s){
        super(s);
    }
}
