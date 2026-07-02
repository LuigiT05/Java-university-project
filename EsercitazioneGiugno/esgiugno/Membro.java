package esgiugno;
public class Membro implements Inter{
    private  String nome;
    private   String cognome;
    Contratto contratto;

   //metodi 
   public  String getNome(){
       return nome;
   }
   public void setNome(String c){
    this.nome= c;
   }
   public void setCognome(String c){
    this.cognome=c;
   }
   public String getCognome(){
    return cognome;
   }
   public Membro(String N, String C, Contratto C1){
         this.nome=N;
         this.cognome=C;
         this.contratto=C1;

   }
   public int calcoloRischio(){
       return 0;
   }
   @Override
    public String toString(){
    String c = "Nome " + this.nome + " Cognome " + this.cognome;
    return c;
   }
   @Override
   public void set(String c){

   }
   @Override
   public int costo(){
    int risultato= contratto.getCache()*contratto.getRepliche();
    return risultato;
   }
}
