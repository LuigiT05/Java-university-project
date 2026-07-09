package Galleria;


public class Quadro extends Opera{
	private String tecnica;
	private String dimensioni;
	// metodi 
	@Override
	public String toString(){
		return "Quadro dipinto con tecnica: " + tecnica + " dimensioni: " + dimensioni +" autore e titolo: " + this.getAutore() + "; " + this.getTitolo();
	}
	public Quadro(String titolo,String autore, int anno, String tecnica, String dimensioni){
            super(titolo,autore,anno);
            this.tecnica=tecnica;
            this.dimensioni=dimensioni;
	}
}