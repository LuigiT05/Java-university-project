package Gennaio_2025;

public class Dispositivo implements Actionable{
    private String codice;
    private boolean accesso;
    private boolean disconesso;
    // meotodi 
    public Dispositivo(String codice){
        this.codice = codice;
        accesso=true;
        disconesso=true;
    }
    @Override
    public void spegni(){
        accesso= false;
        
    }
    @Override
    public void accendi(){
        accesso=true;
    }
    public void setAccesso(boolean  n){
        accesso=n;
    }
    public boolean getAccesso(){
        return accesso;
    }
    public void setDisconesso(boolean n){
        disconesso = n;
    }
    public boolean  getDisconesso(){
        return disconesso;
    }
    public String getCodice(){
        return codice;
    }
    @Override
    public String toString(){
        return "Dispositivo: " + codice;
    }
}