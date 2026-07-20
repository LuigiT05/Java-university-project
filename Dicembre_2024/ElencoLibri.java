package Dicembre_2024;

public class ElencoLibri {
    Libro [] elenco;
    int contatore;
    // metodi 
    public  ElencoLibri(int n){
     elenco = new Libro[n];
     contatore=0;
    }
    public boolean aggiungi(Libro l){
        if(contatore== elenco.length){
            System.out.println("Impossibile aggiungere");
            return false;
        }
        elenco[contatore]=l;
        contatore++;
        System.out.println("Libro aggiunto");
        return true;
            
    }
    public void ordina(){
        for(int i=0; i <elenco.length -1;i++){
         for(int q=0; q<elenco.length -1-i;q++){
            if(elenco[q] != null && elenco[q+1] != null){
               if(elenco[q].compareTo(elenco[q+1])>0){
                Libro temp = elenco[q];
                elenco[q]= elenco[q+1];
                elenco[q+1]=temp;
               }
            }
         }

        }
    }
    public void stampa(){
        for(Libro i: elenco){
            if(i != null)
            System.out.println(i.toString());
        }
    }
    public void fruisciLibro(){
        for(Libro i:elenco){
            if(i != null)
            i.consuma();
        }
    }
    public Libro cerca(String s){
        for(Libro i : elenco){
            if( i != null){
               if(s.equalsIgnoreCase(i.getTitolo())){
                System.out.println("Libro trovato");
                return i;
               }       
            }
        }

        System.out.println("Libro non trovato");
        return null;
    }
}

