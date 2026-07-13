import java.util.Iterator;
import java.util.LinkedList;
public class ProvaIterator {
    public static void main(String[] args) {
        LinkedList<t> g = new LinkedList<>();
        t e= new t(3);
        t z= new t(7);
        g.add(e);
        g.add(z);
        Iterator <t> k= g.iterator();
        System.out.println(k.next().n);
         System.out.println(k.next().n);
    }
    
}
class t{
    int n;
    public t(int k){
        this.n=k;
    }
}