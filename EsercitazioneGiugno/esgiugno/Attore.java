package esgiugno;
public class Attore extends Membro {
    private boolean ruolo;
     //metodi 
     public Attore(String n, String c, boolean r, Contratto c1){
        super(n,c,c1);

     }
     public  boolean getRuolo(){
        return ruolo;
     }
     @Override 
    public String toString(){
        String c= this.getNome()+" "+ this.getCognome()+" e' un Attore " + contratto.toString();
        return c;
    } 
    @Override
    public int calcoloRischio(){
        if(ruolo ==true)
            return 10*contratto.getRepliche();
        return 4*contratto.getRepliche();
    } 
    @Override
   public void set(String c){
     if(c.equalsIgnoreCase("true")){
        this.ruolo=true;}
        this.ruolo=false;

   }   
}
