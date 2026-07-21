package Giugno_2025;

public class Gestisci {
    public static void main(String[] args) {
       ElencoMacchinari e=  new ElencoMacchinari("C:\\Users\\luigi\\Desktop\\Java\\text.txt");
       int m=3;
       for(Macchinario i : e.macchine){
        if(i != null)
        i.setMod(m);
       }
       System.out.println(e.macchine.length);
       e.consumoTotale();
       e.stampa();
       System.out.println("Stampo per soglia");
       e.stampaSopraSoglia(56, 0);
       Robot r3 = new Robot("R4", 200,50, 0, false);
       e.add(r3);
       System.out.println(e.macchine.length);
       
    }
}
