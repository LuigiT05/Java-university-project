package gemini1;

public class DataRilascio implements Comparable<DataRilascio>{
	private int giorno;
	private int mese;
	private int anno;
	// metodi 
	public int getAnno(){
		return anno;
	}
	public int getMese(){
		return mese;
	}
	public int getGiorno(){
		return giorno;
	}
	@Override
	public int compareTo(DataRilascio d1){   // se this e piu grande ritorna 1
		if(this.anno > d1.getAnno())
			return 1;
		if(this.anno == d1.getAnno()){
			if(this.mese>d1.getMese())
				return 1;
			if(this.mese == d1.getMese() && this.giorno == d1.getGiorno())
				return 0;
			if(this.mese == d1.getMese() && this.giorno > d1.getGiorno())
				return 1;
			if(this.mese == d1.getMese() && this.giorno < d1.getGiorno())
				return -1;
		}
		return -1;
	}
	public DataRilascio(int g,int m, int a){
		this.giorno=g;
		this.mese=m;
		this.anno=a;
	}
}