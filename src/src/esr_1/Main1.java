package esr_1;

public class Main1 {
    public static void main(String[] args) {
System.out.println("***stampa rettangolo 1****");
        Rettangolo r1 = new Rettangolo(5,2);
 stampaRettangolo(r1);
        System.out.println("***stampa rettangolo2****");
        Rettangolo r2 = new Rettangolo(2, 6);
        stampaRettangolo(r2);

        stampaDueRettangoli(r1,r2);




    }
     public static void stampaRettangolo(Rettangolo ret){
         System.out.println("Area rettangolo: " + ret.getarea());
         System.out.println("Perimetro rettangolo: " + ret.getperimetro());

     }
    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {

        System.out.println("****Rettangolo 1:***");
        stampaRettangolo(ret1);

        System.out.println("****Rettangolo 2:***");
        stampaRettangolo(ret2);

        int sommaAree = ret1.getarea() + ret2.getarea();
        int sommaPerimetri = ret1.getperimetro() + ret2.getperimetro();

        System.out.println("Somma perimetri: ");
        System.out.println(sommaPerimetri);

        System.out.println("Somma aree: ");
        System.out.println(sommaAree);

    }

}