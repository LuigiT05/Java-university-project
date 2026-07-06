package stazioneSpaziale;

public class Ingegnere extends UnitaOperativa {
   public  String codice;
   public boolean disponibile=true;
   private int numeroInterventi=0;
   public void nuovoIntervento(){
    numeroInterventi++;
   }
   public int getInterventi(){
    return numeroInterventi;
   }
   public Ingegnere(String s, String c){
      super(c);
      this.codice=s;
   }
   public String  gestisci(String s){
      nuovoIntervento();
      System.out.println( s+"Errore gestito dall'ingegnere "+codice);
      return s+"Errore gestito dall'ingegnere "+codice;
   }
}
