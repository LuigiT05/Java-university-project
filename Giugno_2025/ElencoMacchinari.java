package Giugno_2025;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ElencoMacchinari {
    public  Macchinario[] macchine;
    private int size;
    private static final int RESIZE=2;
    //metodi 
      public int getSize(){
        return size;
      }
      public ElencoMacchinari(){
        macchine = new Macchinario[10];
        size=0;
      }
      public ElencoMacchinari(String path){
        try(Scanner sc = new Scanner(new File(path))){
           int n= sc.nextInt();
           macchine = new Macchinario[n];
           size=0;
           for(int i=0;i<n;i++){
            String s = sc.next();
            if(s.equalsIgnoreCase("Robot")){
               String nome = sc.next();
               int tempo = sc.nextInt();
               float potenza = sc.nextFloat();
               boolean visione = sc.nextBoolean();
               macchine[i] = new Robot(nome,tempo,potenza,0,visione);
               size++;
            }  
            if(s.equalsIgnoreCase("Pressa")){
               String nome = sc.next();
               int tempo = sc.nextInt();
               float potenza = sc.nextFloat();
               int colpi=sc.nextInt();
               macchine[i]= new Pressa(nome,tempo,potenza,0,colpi);
               size++;
            }
           }
        }catch(FileNotFoundException e){
            System.out.println("File non trovato");
        }
      }
      public void consumoTotale(){
        float consumoTotale=0;
        for(Macchinario i : macchine){
              if(i !=null){
               consumoTotale= consumoTotale + i.consumoFinale();
               System.out.println(i.toString() +" consumo: " + i.consumoFinale());
              }
               
        }
        System.out.println("Consumo totale: " + consumoTotale);
      }
      public void stampa(){
        for(Macchinario i : macchine){
            if(i != null)
            System.out.println(i.toString());
        }
      }
      public void stampaSopraSoglia(float p, int i){
        if(i < macchine.length){
            if(macchine[i] != null){
           if(macchine[i].confronta(p)>0)
            System.out.println(macchine[i].toString());
               if(i != macchine.length){
                  i++;
                  stampaSopraSoglia(p, i);
                 }
            }
        }
      }
      private void ridimensiona(){
            if(macchine.length - size <=  RESIZE){
                Macchinario sostituto[] = new Macchinario[macchine.length*2];
                for(int i=0; i< macchine.length;i++){
                    sostituto[i]=macchine[i];
                }
                macchine=sostituto;
            }
      }
      public void add(Macchinario m){
        ridimensiona();
        macchine[size]= m;
        size++;
      }

}
