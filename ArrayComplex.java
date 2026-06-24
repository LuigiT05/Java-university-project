
import java.util.Scanner;

public class ArrayComplex{
    static final  int Dim=7;
   static  Complex A1[]= new Complex[Dim];  //istanzio lo spazio per l'array
    public static void main(){
        Menu();
    }
        
    public static void InsertComplexFromTerminal( Complex A1[], int Dim){
         for(int i=0; i<Dim;i++){
            A1[i]= new Complex();
         }
    }
    public static void Printall( Complex A1[], int Dim){
       for(Complex i : A1){
        System.out.println("Re:"+ i.getRe() + "Imm:"+i.getImm());
        }
    }
    public static void BubbleSort(Complex A1[],int Dim){
        Complex A2;
        for(int i=0; i<Dim-1; i++){
            for(int d=0; d<Dim-i-1; d++){ //rivedere il  bubblesort
                if(A1[d].moduloComplex()>A1[d+1].moduloComplex()){  
                A2=A1[d];
                A1[d]=A1[d+1];
                A1[d+1]=A2; 
                }
            }
        }
    }
    public static boolean Search(Complex A1[], int Dim, Complex e){ //non capisco perche c'e un array di interi
        for(Complex i: A1){
            if(i.getRe() == e.getRe() && i.getImm() == e.getImm()){
                System.out.println("Funziona!!");
             return true;
            }
            
        }
        return false;
    }
    public static void PrintAllModules(Complex A1[], int Dim){
        for(Complex i : A1){
          System.out.println("Modulo:"+ i.moduloComplex());
        }
    }
    public static void Menu(){
        Scanner input = new Scanner(System.in);
        int s=8;
       while(s !=0){
         System.out.println("1) crea l'array");
         System.out.println("2) stampa array");
         System.out.println("3) ordina Array");
         System.out.println("4) verifica se un elemento e nell'array");
         System.out.println("5) stampa i moduli dell'array");
         s= input.nextInt();
         switch(s){
            case 1:
                ArrayComplex.InsertComplexFromTerminal(A1,Dim);
                break;
            case 2:
                ArrayComplex.Printall(A1,Dim);
                break;
            case 3: 
                 ArrayComplex.BubbleSort(A1,Dim);
                 break;
            case 4:
                 Complex e= new Complex();
                 ArrayComplex.Search(A1, Dim, e);
                 break;
            case 5:
                ArrayComplex.PrintAllModules(A1, Dim);
                break;
         }
        
        }
        input.close();
     }
}