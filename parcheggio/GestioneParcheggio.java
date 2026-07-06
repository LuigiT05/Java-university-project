package parcheggio;

public class GestioneParcheggio {
    public static void main(String[] args) {
        Veicolo [] z= new Veicolo[5];
        z[0]= new Moto("ciclomotore", "txt9", 0, 0);
        z[1]=new Auto("trz9", "piccola", "orizzontale", 2, 2);
        z[2]= new Auto("zz0","grande","verticale",3,3);
        z[3]= new Auto("zz", "media", "orizzontale", 0, 0);
        z[4]= new Moto("ciclomotore","656",6,6);
        AreaParcheggio p= new AreaParcheggio(10);
        for(int i=0;i<z.length;i++){
           z[i].parcheggia(p);
        }
        p.StampaArea();

    }
}
