package stazioneSpaziale;

public class ModuloOrbitale extends UnitaOperativa{
    private String missione;
    public boolean errore=false;
    public ModuloOrbitale(String s, String c, boolean b){
        super(c);
        this.missione=s;
        errore=b;
    }
    public String lanciaErrore(String s){
        errore=false;
        
        return "errore dalla missione: "+ missione + " "+s;

    }
    
}
