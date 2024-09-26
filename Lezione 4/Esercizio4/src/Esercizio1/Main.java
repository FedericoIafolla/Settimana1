package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = new Dipendente("001", 1500, "PRODUZIONE");
        dipendenti[1] = new Dipendente("002", 2000, "AMMINISTRAZIONE");
        dipendenti[2] = new Dipendente("003", 1800, "VENDITE");

        for (Dipendente dip : dipendenti) {
            System.out.println("Matricola: " + dip.getMatricola());
        }
    }
}
