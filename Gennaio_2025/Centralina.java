package Gennaio_2025;

public class Centralina {
    Dispositivo[] raccolta;
    private int maxDevice;
    private int  extSize;
    public Centralina(int n, int max){
        extSize=max;
        raccolta= new Dispositivo[n];
        maxDevice=n;

    }
    // metodi 
    public void disconettiSpenti(){
        for(Dispositivo i : raccolta){
            if(i != null){
                if(i.getAccesso()){
                    if(!i.getAccesso()){
                        i.setDisconesso(false);
                    }
                }
            }
        }
    }
    public boolean  cercaCodice(String c){
        boolean ritorno = false;
        for(Dispositivo i : raccolta){
            if(i != null){
            if(i.getCodice().equalsIgnoreCase(c))
                ritorno = true;
        }
        }
        return ritorno;
    }
    public void aggiungi(Dispositivo nuovo){
        if(!cercaCodice(nuovo.getCodice())){
            estendiCentralina();
            for(int i =0;i<raccolta.length;i++){
                if(raccolta[i] == null){
                    raccolta[i] = nuovo;
                    break;
                }
            }
          
        }
    }
    public void estendiCentralina(){
        int posti_occupati=0;
        for(Dispositivo i: raccolta){
            if(i != null)
                posti_occupati++;
        }
        if(raccolta.length != maxDevice+extSize &&posti_occupati== maxDevice){
            Dispositivo [] nuovo = new Dispositivo[raccolta.length+1];
            for(int i=0; i< raccolta.length;i++){
                nuovo[i]=raccolta[i];
            }
            raccolta=nuovo;
            maxDevice++;
        }
    }
    public void Elimina(Dispositivo c){
        String codice_da_eliminare = c.getCodice();
        boolean trovato = false;
        for(int i=0;i< raccolta.length;i++){
            if(raccolta[i] != null){
               if(codice_da_eliminare.equalsIgnoreCase(raccolta[i].getCodice()))
                trovato = true;
            }
            if(trovato){
                  if(i+1<raccolta.length){  //cosi non vado outofBonds
                    raccolta[i]=raccolta[i+1];
                  }else{
                    raccolta[i]=null;
                  }
            }
            
        }
    }
    public void stampa(){
        for(Dispositivo i : raccolta){
            if(i != null)
                System.out.println(i.toString());
        }
    }
    
}
