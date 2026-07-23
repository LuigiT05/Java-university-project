package Gennaio_2025;

public class Illuminazione extends Dispositivo {
    private int livelloLuce;
    public Illuminazione(String codice){
        super(codice);
        livelloLuce=50;
    }
    @Override
    public void accendi(){
        try {
            if(this.getAccesso())
                throw new ExceptionP("Dispositivo gia accesso");
            this.setAccesso(true);
            livelloLuce=50;
            this.setDisconesso(false);
        } catch (ExceptionP e) {
            System.out.println("Dispositivo gia acceso");
        }
    }
    @Override
    public void spegni(){
        try {
            if(!this.getAccesso())
                throw new ExceptionP("Dispositivo gia spento");
            this.setAccesso(false);

        } catch (Exception e) {
            System.out.println("Dispositivo gia spento");
        }
    }

    
}
