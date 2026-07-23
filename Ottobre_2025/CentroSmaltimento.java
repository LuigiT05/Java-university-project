package Ottobre_2025;
import java.util.LinkedList;

public class CentroSmaltimento <T extends  Riciclabile> {
    LinkedList<T> raccolta;
    private String categoria;
    public CentroSmaltimento(String s){
        raccolta = new LinkedList<>();
        categoria = s;
    }
    public String getCategoria(){
        return categoria;
    }
    public void conferisci(T a, Tabella t){
        try {
            if(categoria.equalsIgnoreCase(a.riciclabile(t))){
            if(a instanceof  RifiutoDomestico)
                raccolta.add(a);
            if(a instanceof ScartoIndustriale){
                if(!((ScartoIndustriale) a).getIndustriale())
                    raccolta.add(a);
            }else{
                throw new  NonSmaltibileException();
            }
           }
        } catch ( NonSmaltibileException e) {
        }
    }
    public void stampa(){
        for(T i : raccolta){
            System.out.println(i.toString());
        }
    }
}
