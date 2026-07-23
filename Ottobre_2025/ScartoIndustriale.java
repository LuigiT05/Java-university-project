package Ottobre_2025;

public class ScartoIndustriale implements Riciclabile {
    private String settore;
    private boolean scartoIndustriale;
    private String codiceMateriale;
    // metodi 
    public ScartoIndustriale(String settore,String codice){
        this.settore=settore;
        codiceMateriale=codice;
        if(settore.equalsIgnoreCase("Chimico"))
            scartoIndustriale = true;
        scartoIndustriale = false;
    }
    @Override
    public String toString(){
        return codiceMateriale + " " + settore;
    }
    @Override
    public String  riciclabile(Tabella t){
        boolean ritorno= false;
        for(String i : t.getCodici() ){
            if(this.codiceMateriale.equalsIgnoreCase(i)){
                 ritorno= true;
                 break;
            }
        }
        try {
            if(!ritorno)
                throw  new NonSmaltibileException();
            return  t.categoriaPerCodice(codiceMateriale);
            
        } catch (NonSmaltibileException e) {
            e.segnala();
            return "Nulla";
        }
    }
    public boolean getIndustriale(){
        return scartoIndustriale;
    }
}
