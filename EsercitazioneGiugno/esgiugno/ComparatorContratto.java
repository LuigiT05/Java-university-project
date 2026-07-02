package esgiugno;
import java.util.Comparator;
public class ComparatorContratto implements Comparator<Contratto> {
    @Override
    public int compare(Contratto c1, Contratto c2){
       int p1= c1.getCache();
       int p2=c2.getCache();
       if(p1>p2)
        return 1;
       if(p1<p2)
        return -1;
       return 0;
    }
    
}
