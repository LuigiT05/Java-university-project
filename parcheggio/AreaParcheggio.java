package parcheggio;

public class AreaParcheggio {
    private Veicolo[][] attribute;
    //metodi 
    public AreaParcheggio(int n){
        this.attribute= new Veicolo[n][n];
        for(int i=0;i<n;i++){
           // for(int d=0;d<n;d++){
                //attribute[i][d]=new Veicolo(null, 0, 0);
            //}
        }
    }
    public void verificaCellaLibera(int riga,int colonna) throws EccezioneP{  //capire meglio come definire un eccezione personalizzata
         if(attribute.length <=riga || attribute.length <= colonna || riga<0 || colonna <0){
            throw new EccezioneP("Fuori dall'array"); //lancia una nuova eccezione 
        }else if (attribute[riga][colonna] instanceof Veicolo) {
              throw new EccezioneP(); //lancia una nuova eccezione 
        } 
    }
    public void occupaCella(int riga,int colonna, Veicolo v){
     try{
        verificaCellaLibera(riga, colonna);
        if(v instanceof Moto){
            attribute[riga][colonna]=v;
        }else if(v instanceof Auto){
            Auto a= (Auto)v;
            if(a.getOrientamento().equalsIgnoreCase("Orizzontale")){
                verificaCellaLibera(riga, colonna+1);
                attribute[riga][colonna]=v;
                attribute[riga][colonna+1]=v;
            }else{
               verificaCellaLibera(riga+1, colonna);
               attribute[riga][colonna]=v;
               attribute[riga+1][colonna]=v;
            }
        }

     }catch(EccezioneP e){
        System.out.println("Impossibile Parcheggiare");
     }
    }
    public int contaCelleOccupate(){
        int x=0;
        for(int i =0; i<attribute.length;i++){
            for (int d=0; d<attribute.length;d++) {
                if(attribute[i][d] != null){
                   x=x+1;
                }
            }
        }
        return x;
    }
    public double percentualeAreaOccupata(){
        int x = contaCelleOccupate();
        int d = x/(attribute.length *2);
        return d*100;
    }
    public void StampaArea(){
        for (int i=0;i<attribute.length;i++){
            for(int d=0; d<attribute.length;d++){
                if(attribute[i][d] instanceof Veicolo){
                System.out.print(attribute[i][d].getSymbol());      
                }else{
                 System.out.print("*");
                }
            }
                System.out.println(" ");
         }
    }
    

}
