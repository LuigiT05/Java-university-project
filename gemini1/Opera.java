package gemini1;

public abstract class Opera{
  public  String codice; 
  private String titolo;
  private DataRilascio DataRilascio;
  private Creatore creatore;
  // metodi t
  public DataRilascio getData(){
    return DataRilascio;
  }
  public abstract void stampaDettagli();
  public Opera(String codice, String titolo, DataRilascio dt, Creatore cr){
    this.codice=codice;
    this.titolo=titolo;
    this.DataRilascio=dt;
    this.creatore=cr;
  }



}