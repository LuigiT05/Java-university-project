package esgiugno;
public class Contratto{
    private String codice;
    private int repliche;
    private int cache;
    // metodi 
    public void setCodice(String c){
        this.codice=c;
    }
    public void setRepliche(int n){
        this.repliche=n;

    }
    public void setCashe(int n){
        this.cache=n;
    }
    public Contratto(String co, int r, int c){
        this.codice=co;
        this.cache=c;
        this.repliche=r;
    }
    @Override
    public String toString(){
        String c= this.codice+ " ha n.repliche: "+this.repliche+" cache: "+this.cache;
        return c;
    }
    public int getRepliche(){
        return repliche;
    }
    public int getCache(){
        return this.cache;
    }
    public String getCodice(){
        return this.codice;
    }
    
}
