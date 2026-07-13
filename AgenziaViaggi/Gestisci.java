package AgenziaViaggi;

public class Gestisci {
    static void main() {
        Treno p1= new Treno(4,"A4","c21", "NAAPLL", "VESUVIO", "17/05", "Carlo", "luca", 3, 30);
        Treno p2 = new Treno(4,"b7","c73", "Roma", "NApll", "17/05", "Luigi", "giancazzo",23, 0);
        Treno p3 = new Treno(73, "55", "C77", "Vaffanculo", "stronzo", "20/05", "Cazzo", "in boxxa", 0, 0);
        Volo p4 = new Volo(null, 0, null, null, null, "77/99", null, null, 0, 0);
        Elenco e1= new Elenco();
        e1.push(p4);
        e1.push(p3);
        e1.push(p2);
        e1.push(p1);
        //e1.stampa();
        //Prenotazione temp = new Prenotazione(null, null, null, null, null, null, 0, 0);
        int n= e1.contaSe(p1);
        System.out.println(n);
        int k = e1.contaSe(p4);
        System.out.println(k);
        Prenotazione[] p = e1.filtraPrenotazione("17/05", 1, 1);
        for(Prenotazione i : p){
            if(i != null)
            i.stampaPrenotazione();

        }
    }
    }
java.io.PrintWriter;


