package esgiugno;
public class Tecnico extends Membro{
    private String funzione;
    public String getFunzione(){
        return funzione;
    }
    public Tecnico(String n, String c, Contratto c1, String f){
        super(n, c, c1);
        this.funzione=f;
    }
    @Override
    public String toString(){
        String c= this.getNome() + " "+this.getCognome()+ "e'un tecnico di " + this.funzione+ " " + contratto.toString(); 
        return c;
    }
    @Override
    public int calcoloRischio(){
        if(funzione.equalsIgnoreCase("Luci"))
        return 5*contratto.getRepliche();
        if(funzione.equalsIgnoreCase("trucco"))
            return 2*contratto.getRepliche();
        return contratto.getRepliche(); 
            
        
    }
    @Override
   public void set(String c){
       this.funzione=c;
   }
}