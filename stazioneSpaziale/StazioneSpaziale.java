package stazioneSpaziale;

public class StazioneSpaziale {
    public static void main(String[] args) {
        Ingegnere p1= new Ingegnere("C0", "C33");
        Ingegnere p2 = new Ingegnere("C1", "C34");
        Ingegnere p3 = new Ingegnere("C2", "C55");
        ModuloOrbitale m1= new ModuloOrbitale("M01", "M33", false);
        ModuloOrbitale m2 = new ModuloOrbitale("M02", "M34", true);
        PlanciaDiComando p= new PlanciaDiComando(p1, p2, p3, m1, m2);
        p.ricercaErrori();
        System.out.println(p1.getInterventi());
        System.out.println(p2.getInterventi());
    }
}
