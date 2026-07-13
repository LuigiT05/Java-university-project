public class ZombiesVSAliens {
  static void main(String[] c){   
    Campo C =new Campo(6);
    Zombie Z1= new Zombie(0, 0);
    Alien A1 = new Alien(2, 2);
    C.placePersonaggio(0, 0, Z1);
    C.placePersonaggio(2, 2, A1);
    printBoardState(C); 
    Z1.move(C); 
    A1.move(C); 
    System.out.println(Alien.getAlienCount());   
    System.out.println(Zombie.getZombieCount());
    printBoardState(C);       
  }
  static void printBoardState(Campo C){
          Personaggio[][] P= C.getGrid();
          for(int i=0; i<P.length;i++){
            for(int n=0; n<P[0].length;n++){
                if(P[n][i] instanceof Zombie){
                    System.out.print("[Z]");
                }else if(P[n][i] instanceof Alien){
                    System.out.print("[A]");
                }else{
                    System.out.print("[]");
                }
                
            }
            System.out.println("-");
          }
  }
    
}
class Personaggio{
    private int x;
    private int y;
    protected boolean vivo;
    // metodi
    public Personaggio(int x, int y){
        this.x=x;
        this.y=y;
        this.vivo=true;
    }
    public int getX(){
        return this.x;

    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;

    }
    public void move(Campo c){
         
    }
    protected void die(){
        this.vivo=false;
    }
}
class Zombie extends Personaggio{
    static private int zombieCount=0; // risulta essere una variabile di classe
    //metodi 
    public  Zombie(int x,int y){
        super(x,y);
        zombieCount= zombieCount +1;
    }
    @Override
    protected void die(){
        this.vivo=false;
        zombieCount= zombieCount-1;
    }
    static public int  getZombieCount(){
      return  zombieCount;
    }
    @Override
    public void move(Campo C){
       if( C.isValidPosition(getX()+1,getY()) && !(C.whois(getX()+1, getY()) instanceof Zombie)){
        if(C.whois(getX()+1,getY()) instanceof Alien){
            C.whois(getX()+1,getY()).die();
        }
        C.removePersonaggio(getX(), getY());
        setX(getX()+1); 
        C.placePersonaggio(getX(),getY(),this);  //this si riferisce all'intero oggetto
        System.out.println("Zombie mosso");
       }else{
        System.out.println("impossibile muovere personaggio");
       }
    }
}
class Alien extends Personaggio{
    static private int AlienCount=0;
    //metodi
    public Alien(int x,int y){
        super(x,y);
        AlienCount=AlienCount+1;

    }
    @Override
    protected void die(){
        this.vivo=false;
        AlienCount=AlienCount-1;
    }
    public static int getAlienCount(){
        return AlienCount;
    }
    @Override
    public void move(Campo C){
     if( C.isValidPosition(getX()+1,getY()+1) && !(C.whois(getX()+1,getY()) instanceof  Alien)){
        if(C.whois(getX()+1,getY()+1) instanceof Zombie){
            C.whois(getX()+1,getY()+1).die();
        }
        C.removePersonaggio(getX(), getY());
        setX(getX()+1);
        setY(getY()+1);
        C.placePersonaggio(getX(),getY(),this);
        System.out.println("alieno mosso");
       }else{
        System.out.println("impossibile muovere personaggio");
       }
    }
    
}
class Campo{
     private Personaggio[][] grid;
    //metodo
    public Campo(int n){
        this.grid= new Personaggio[n][n];
    }
    public Personaggio[][] getGrid(){
        return grid;
    }
    public void placePersonaggio(int x, int y, Personaggio p){
       if(isValidPosition(x, y)){
        p.setX(x);  
        p.setY(y);
        grid[x][y]=p;
        //System.out.println("Personaggio piazzato");
       }else{
        System.out.println("Posizione non valida");
       }
    }
    public boolean isValidPosition(int x,int y){
        int n= grid.length;
       return x <=n-1 && y <=n-1;
    }
    public void removePersonaggio(int x,int y){
        if(isValidPosition(x, y)){
            grid[x][y] = null;
            //System.out.println("personaggio rimosso");
        }else{
            //System.out.println("Posizione non valida");
        }
    }
    public boolean gameover(){
      return Zombie.getZombieCount()==Alien.getAlienCount() && Alien.getAlienCount()==0;
    }
    public Personaggio whois(int x, int y){
        return grid[x][y];
    }
}