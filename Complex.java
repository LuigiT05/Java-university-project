import java.util.Scanner;
public class Complex{
    private double Re;
    private double Imm;

    public Complex(double Re,double Imm){
        this.Re=Re;
        this.Imm=Imm;
    }
    public Complex(Complex C){
        this.Re=C.Re;
        this.Imm=C.Imm;
    }
    public Complex(){
        System.out.println("inserisci la parte reale:");
        Scanner input = new Scanner(System.in);  //apre il canale per prendere input
        this.Re = input.nextDouble();
        System.out.println("inserisci la parte immaginaria:");
        this.Imm = input.nextDouble();
        //input.close();


    }
    public double getRe(){
        return this.Re;
    }
    public void setRe(double Re){
        this.Re=Re;
    }
    public double getImm(){
        return this.Imm;
    }
    public void setImm(double Imm){
        this.Imm=Imm;
    }
    public void stampa(){
        System.out.println("la parte reale e:"+ this.Re + "la parte immaginaria e:" + this.Imm + "j");
    }
    public double moduloComplex(){
       double k = this.Re * this.Re;
       double q = this.Imm * this.Imm;
       double r= k+q;
       return Math.sqrt(r);

    }
    public Complex sommaComplex(Complex C){
        double NRe;
        double NImm;
        NRe= this.Re + C.Re;
        NImm= this.Imm + C.Imm;
        Complex S = new Complex(NRe,NImm);
        return S;
    }
    public Complex prodottoComplex( Complex C){
        double NRe = C.Re * this.Re;
        double NImm = C.Imm *this.Imm;
        Complex S = new Complex(NRe,NImm);
        return S;
    }
}