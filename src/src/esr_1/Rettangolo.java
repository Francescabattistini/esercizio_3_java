package esr_1;
//esercizio 1 la classe

public class Rettangolo {
 private int altezza;
 private int larghezza;

    // costrutto
public Rettangolo( int alt, int larg) {
     this.altezza = alt;
     this.larghezza = larg;

}
    public  int getarea() {
     return altezza * larghezza;}
    public int getperimetro(){
     return (altezza + larghezza)*2;
    }
}
