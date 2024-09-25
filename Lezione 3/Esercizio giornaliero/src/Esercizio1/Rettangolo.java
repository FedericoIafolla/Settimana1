package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);
        System.out.println("Rettangolo 2:");
        stampaRettangolo(r2);
        System.out.println("Somma delle aree: " + (r1.calcolaArea() + r2.calcolaArea()));
        System.out.println("Somma dei perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
    }

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 7);
        Rettangolo r2 = new Rettangolo(3, 4);

        // Utilizzo dei metodi get
        System.out.println("Altezza del Rettangolo 1: " + r1.getAltezza());
        System.out.println("Larghezza del Rettangolo 1: " + r1.getLarghezza());

        // Modifica l'altezza e la larghezza
        r1.setAltezza(10);
        r1.setLarghezza(12);

        System.out.println("Nuova altezza del Rettangolo 1: " + r1.getAltezza());
        System.out.println("Nuova larghezza del Rettangolo 1: " + r1.getLarghezza());

        // Stampa delle informazioni
        stampaRettangolo(r1);
        stampaDueRettangoli(r1, r2);
    }
}
