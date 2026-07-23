package Ottobre_2025;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tabella {
    private String [] codici;
    private String[] categorie;
    private int size;
    // metodi 
    public Tabella(int n){
        codici = new String[n];
        categorie = new String[n];
    }
    public  void carica(int tipo){
        if(tipo == 0){
            Scanner input = new Scanner(System.in);       
            String  path = input.nextLine();
            input.close();
            try(Scanner sc = new Scanner(new File(path))) {
                int n = sc.nextInt();
                codici = new String[n*2];  //non ho bisogno di copiare l'array per convenzione penso che possa essere caricata massimo una tabella per esecuzione
                categorie = new String[n*2]; 
                String s = sc.next();
                String c = sc.next();
                aggiungi(s,c);
            } catch (FileNotFoundException e) {
                   System.out.println("File non trovato");
            }
        }else if(tipo == 1){
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci Codice: ");
            String s = input.nextLine();
            System.out.println("Inserisci Categoria: ");
            String c = input.nextLine();
            aggiungi(s, c);
            input.close();
        }else{
            System.out.println("Sistema di lettura non consentito");
        }
        
    }
    public void aggiungi(String s, String t){
        codici[size] = s;
        categorie[size] = t;
        size++;
    }
    public String categoriaPerCodice(String codice){
        String categoriaDiRitorno = null;
        for(int i =0; i< codici.length;i++){
            if(codici[i] !=null){
                if(codici[i].equalsIgnoreCase(codice)){
                    categoriaDiRitorno=categorie[i];
                    break;
                }
            }
            
        }
        try {
            if( categoriaDiRitorno == null)
             throw new NonSmaltibileException();
            System.out.println(categoriaDiRitorno);
            return categoriaDiRitorno;
        }catch (NonSmaltibileException e) {
            e.segnala();
        }
        return null;
    }
    public int getSize(){
        return size;
    }
    public void stampa(){
        for(int i=0;i < codici.length;i++){
            if(codici[i] != null && categorie[i] != null){
                System.out.println("Codice: " + codici[i] + " -> Categoria: " + categorie[i]);
            }
        }
    }
    public String[] getCodici(){
        String [] ritorno = new String[codici.length];
        for(int i=0; i< codici.length;i++){
            ritorno[i] = codici[i];    //posso fare cosi perche le stringhe sono inmodificabili
        }
        return ritorno;
    }


}
