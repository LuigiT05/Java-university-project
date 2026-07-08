package bagagli;

public class GestisciValigia{
public static void main(String[] args) {
		Indumento i1 = new Indumento("Xl","maglione",11.23);
    Liquido l2 = new Liquido(3,2,"profumo");
    Indumento i3 = new Indumento("l","maglione",33);
    Bagaglio b= new Bagaglio();
    b.push(i1);
    b.push(l2);
    b.push(i3);
    EffettoPersonale[] k = b.filtro("profumo");
    System.out.println(k[0].toString());
    b.pop(2);
    b.stampa();
     }
}