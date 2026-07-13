package AgenziaViaggi;
public class Elenco{
 private class Nodo{
     public Prenotazione p;
     public Nodo next;
     public Nodo(Prenotazione p, Nodo n){
        this.next=n;
        this.p=p;

     }
     
    }
    private Nodo head;
    public Elenco(){
        this.head=null;
     }
     public void push(Prenotazione p){
        Nodo newNodo = new Nodo(p, null);
        newNodo.next=head;
        head=newNodo;

     }
     public boolean full(){
        return false;
     }
     public boolean Empity(){
        return head==null;
     }
     public int contaSe(Prenotazione p){
        int contatoregenerico =0;
        int contatoreVolo=0;
        int contatoreTreno=0;
        Nodo corrente = head;
        while(corrente != null){
              if( corrente.p instanceof Treno)
               contatoreTreno++;
              if(corrente.p instanceof Volo)
               contatoreVolo++;
            contatoregenerico++;
        corrente=corrente.next;
     }
     if(p instanceof Treno)
        return contatoreTreno;
    if( p instanceof Volo)
        return contatoreVolo;
    if(p instanceof Prenotazione)
        return contatoregenerico;
    return -1;
    }
    public Prenotazione[] filtraPrenotazione(String data, int ora, int minuti){
        Prenotazione temp = new Prenotazione(null, null, null, data, null, null, ora, minuti);
       int n = contaSe(temp);
       Prenotazione[] p = new Prenotazione[n];
       Nodo corrente= head;
       int i=0;
       while(corrente !=null && i<n){
          if(corrente.p.compareTo(temp)==1){
            //System.out.println("XXX");
            p[i]=corrente.p;
            i++;  //in questo mono non si creano spazi nell'array;
          }  
          corrente=corrente.next;
         }
         return p;
    }
    public void stampa(){
        Nodo corrente = head;
        while (corrente != null){
              corrente.p.stampaPrenotazione();
              corrente=corrente.next;
        }
    }
    
}
