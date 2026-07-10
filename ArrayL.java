/*Creazione di un ArrayList manuale, ho creato alcuni dei metodi principali(ed utili ad una traccia che stavo seguendo)*/

package gemini1;

public class ArrayL<T>{
	private Object a[];
	private int elementi=0;
	public ArrayL(){
		a = new Object[10];
	}
	public ArrayL(int n){
		a = new Object[n];
	}
	public T get(int indice){
		return (T)a[indice];
	}
	private void bigArray(){
		Object[] b = new Object[2*a.length];
		for(int i=0; i<a.length;i++){
             b[i]=a[i];
		}
		a=b;
	}
	private void bigArray(int n){
		Object[] b = new Object[n+a.length];
		for(int i=0; i<a.length;i++){
             b[i]=a[i];
		}
		a=b;
	}
	public void verificaCapacita(int k){  //se con gli elementi liberi riesci?
		if(k> a.length - elementi)
			bigArray(k);

	}
	public void add(T e){
		if(elementi==a.length){
               bigArray(5);
		}
		a[elementi]=e;
		elementi++;
	}
	public void add( T[] k){
		verificaCapacita(k.length);
		for(T i : k){
			this.add(i);
		}
	}
	public int getSize(){
		return a.length;
	}
	public void remove(int indice){
		for( int i= indice; i<elementi-1;i++){
			a[i]=a[i+1];
		}
		if(indice<elementi){
		elementi--;
		a[elementi]=null;
	    }
	}
	public void insert(T e, int indice){
		    verificaCapacita(elementi+1);
		    for(int i = elementi-1; i>=indice;i--){
		    	if(a[indice]==null && indice<=elementi){
			        break;
		            }
		    a[i+1]=a[i];
		    }
		    a[indice]=e;
		    elementi++;
		}

	}

}
