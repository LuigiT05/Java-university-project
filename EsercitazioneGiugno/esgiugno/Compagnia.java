package esgiugno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Compagnia {
   private  Membro [] element;

    public Compagnia(int n){
        element= new Membro[n];
    }
    public  int aggiungi(Membro M){
        for(int i=0;i<element.length;i++){
           if(element[i]==null){
            element[i]=M;
            return 0;
           }
        }
        return 1;
    }
    public void caricaDaFile(String s){
        try(Scanner sc= new Scanner(new File(s))) {
            int contatore=0;
            int n= sc.nextInt();
            element=new Membro[n];
            while(sc.hasNext() &&  contatore<n){
                String codice= sc.next();
                boolean  verifica=true;
                if(contatore !=0){
                for(int z=0;z<contatore;z++){
                     if(element[z].contratto.getCodice().equalsIgnoreCase(codice)){
                           verifica=false;
                           break;
                     }
                }
                }if(verifica){
                     String r= sc.next();
                     Contratto c = new Contratto(null, 0, 0);
                if(r.equalsIgnoreCase("a")){
                element[contatore]=new Attore(null, null, true, c);
                }else{
                    element[contatore]=new Tecnico(null,null,c,null);
                }
                element[contatore].contratto.setCodice(codice);
                element[contatore].setNome(sc.next());
                element[contatore].setCognome(sc.next());
                element[contatore].contratto.setCashe(sc.nextInt());
                element[contatore].contratto.setRepliche(sc.nextInt());
                element[contatore].set(sc.next());
                contatore=contatore+1;
                }else{
                    System.out.println("codice " +codice+" ignorato");
                    sc.next();
                    sc.next();
                    sc.next();
                    sc.next();
                    sc.next();
                    sc.next();
                }

              
                    
                
            }
        } catch(FileNotFoundException c){
              System.out.println("DIo");
        }catch (Exception e) {
            System.out.println("Errore");
        }
    }
    public int costoTotale(){
        int costo=0;
        for(Membro i:element){
        costo= costo + i.costo();
        }
        return costo;
    }
    public Membro membroCritico(){
        int rischio=0;
        Membro Critico=null;
        for(Membro i: element){
            if(i !=null)
            if(i.calcoloRischio()>rischio){
                rischio=i.calcoloRischio();
                Critico=i;
            }
        }
        return Critico;
    }
    public void stampa(){
        for(Membro i: element){
            if(i != null)
            System.out.println(i.toString());
        }
    }
    public void ordinaCognome(){
        Membro temp;
        for(int i=0;i<element.length-1;i++){
            for(int q=0;q<element.length-1-i;q++){
                if(element[q]!=null || element[q+1] != null)
                    break;
                String s= element[q].getCognome();
                String d= element[q+1].getCognome();
                if(s.compareTo(d) <0){  //confronto per cognome 
                    temp=element[q+1];
                    element[q+1]=element[q];
                    element[q]=temp;
                }else if(s.compareTo(d)==0){  //confronto per nome 
                   s=element[i].getNome();
                   d=element[q].getNome();
                   if(s.compareTo(d)<0){
                     temp=element[q];
                    element[q]=element[i];
                    element[i]=temp;
                   }
                }
            }
        
        }

    }
    public void ordinaCosto(){
        Membro temp;
        ComparatorContratto c= new ComparatorContratto();
        for(int i=0; i<element.length-1;i++){
            for(int q=0;q<element.length-1-i;q++){
                if(element[q]==null || element[q+1]==null)
                    break;
              if(c.compare(element[q].contratto, element[q+1].contratto)<0){
                 temp=element[q+1];
                 element[q+1]=element[q];
                 element[q]=temp;
              }
            }
        }
    }

}
