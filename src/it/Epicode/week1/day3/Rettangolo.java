package it.Epicode.week1.day3;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    //Costruttore
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //Metodi per calcolare perimetro ed area
    public double calcolaPerimetro(){
        return 2 * (altezza + larghezza);
    }

    public double calcolaArea(){
        return altezza * larghezza;
    }

    //Funzione per stampare area e perimetro di un rettangolo
    public void stampaRettangolo(){
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    //Funzione per stampare area e perimetro di due rettangoli e la loro somma
    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
        System.out.println("Rettangolo 1: ");
        rettangolo1.stampaRettangolo();
        System.out.println("\nRettangolo 2: ");
        rettangolo2.stampaRettangolo();

        //Somma delle aree e dei perimetri
        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();

        System.out.println("\nSomma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args){
        //Creazione dei due rettangoli
        Rettangolo rettangolo1 = new Rettangolo(5,10);
        Rettangolo rettangolo2 = new Rettangolo(8,12);

        //Utilizzo delle funzioni
//        System.out.println("Rettangolo 1: ");
//        rettangolo1.stampaRettangolo();
//
//        System.out.println("\nRettangolo 2: ");
//        rettangolo2.stampaRettangolo();

        System.out.println("\nStampa i due rettangoli");
        stampaDueRettangoli(rettangolo1,rettangolo2);
    }


}
