package AgenziaViaggi;
public class Persona {
    private String Nome;
    private String Cognome;
    // metodi 
    @Override
    public String toString(){
        return Nome + " "+ Cognome;
    }
    public Persona(String n,String c){
        this.Nome =n;
        this.Cognome=c;
    }
}
