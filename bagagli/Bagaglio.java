package bagagli;

public class Bagaglio implements Trasportabile{
	private double pesoMax=200;
    private Nodo head;
    private int quantita;
	private class Nodo{
		EffettoPersonale b;
		Nodo next;
		public Nodo(EffettoPersonale c){
			this.next=null;
			this.b=c;
		}
	}
	public Bagaglio(){
        this.head=null;
        this.quantita=0;
	}
	@Override
	public double getPeso(){
		double peso=0;
		Nodo corrente = head;
		while(corrente != null){
            peso +=corrente.b.getPeso();
            corrente=corrente.next;
		}
		return peso;
	}
	@Override 
	public boolean checkPeso(double p){
		if(p>pesoMax)
			return false;
		return true;
	}
	public void push(EffettoPersonale n){
		try{
			if(n.preparaPerViaggio()){
	          Nodo c = new Nodo(n);
	          c.next=head;
	          head=c;  
	          quantita++; 
	    }
		}catch( GrandeEccezione e){
		   System.out.println("Errore oggetto ENorme");
		}
		
	}
	public void pop(int i){           //i indica il numero di elemento e non l'indice                 
		int d =1;
		Nodo corrente = head;
		if(i==0){
          System.out.println("Valore non valido");
          
		}
		if(i==1){
			head=head.next;
		}else{

		   while(corrente != null && d<i){
              if(d==i-1){
            	corrente.next =corrente.next.next;
               }
               corrente=corrente.next;
               d++;
		       }
	    }
	}
	public EffettoPersonale[] filtro(String s){
          Nodo corrente =head;
         int n=0;
         EffettoPersonale[] k = new EffettoPersonale[quantita];
         while(corrente != null){
         	if(corrente.b.getTipo().equalsIgnoreCase(s)){
              k[n]=corrente.b;
              n++;
         	}
         	corrente=corrente.next;
         }
         return k;
	}
	public void stampa(){
		Nodo corrente=head;
		while(corrente != null){
            System.out.println(corrente.b.toString());
            corrente=corrente.next;
		}
	}

}

/*
while(corrente !=null i<3){
	if(i=2){
	   corrente.next= corrente.next.next;
	}
	corrente=corrente.next;
}


*/