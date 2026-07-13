package AgenziaViaggi;

public class DepTime {
    private int ora;
    private int minuti;
    //metodi 
    public DepTime(int o, int m){
        this.ora=o;
        this.minuti=m;

    }
    public int getOra(){
        return ora;
    }
    public int getMinuti(){
        return minuti;
    }
}
