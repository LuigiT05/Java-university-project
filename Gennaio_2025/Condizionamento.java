package Gennaio_2025;


public class Condizionamento extends Dispositivo {
    private int temperatura;
    private int umidita;
    // metodi 
    public Condizionamento(String codice){
        super(codice);
        temperatura=23;
        umidita=40;

    }
    @Override
    public void accendi(){
        try {
            if(this.getAccesso())
                throw new ExceptionP("Dispositivo gia accesso");
            this.setAccesso(true);
            this.setDisconesso(false);
            temperatura=23;
            umidita=40;
        } catch (ExceptionP e) {
        }
    }
    @Override
    public void spegni(){
        try {
            if(!this.getAccesso())
                throw new ExceptionP("Dispositivo gia spento");
            this.setAccesso(false);
            
        } catch (ExceptionP e) {
        }
    }
    
}
