package stazioneSpaziale;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;


public class PlanciaDiComando {
LinkedList<UnitaOperativa> ingegneri = new LinkedList<>();
public LinkedList<UnitaOperativa> moduli = new  LinkedList<>();
public void registra(String s, String percorso){
    try(PrintWriter file= new PrintWriter(new FileOutputStream(percorso,true))){
                file.println(s); 
    }catch(FileNotFoundException e){
      System.out.println("File non trovato");
    }

    
}
public void gestisciSegnalazione(String s){
    registra(s, "C:\\Users\\luigi\\Desktop\\Java\\traccia.txt");
   Iterator<UnitaOperativa> p= ingegneri.iterator();
   while(p.hasNext()){
    Ingegnere i=(Ingegnere)p.next();
    if(i.disponibile){
        String d= i.gestisci(s);
        registra(d, "C:\\Users\\luigi\\Desktop\\Java\\traccia.txt");
        p.remove();
        ingegneri.addLast(i);
        break;
    }

   }
        
}
public PlanciaDiComando(Ingegnere p1,Ingegnere p2,Ingegnere p3,ModuloOrbitale m1, ModuloOrbitale m2){
    ingegneri.add(p1);
    ingegneri.add(p2);
    ingegneri.add(p3);
    moduli.add(m1);
    moduli.add(m2);
}
public void ricercaErrori(){
    for( UnitaOperativa i: moduli){
    if(i instanceof ModuloOrbitale){
        if(((ModuloOrbitale)i).errore){
            String s = ((ModuloOrbitale) i).lanciaErrore("Errore generico");
           gestisciSegnalazione(s);
        }
    }
    }
}
}
