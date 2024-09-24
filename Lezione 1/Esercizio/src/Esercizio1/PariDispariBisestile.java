package Esercizio1;

public class PariDispariBisestile {

    // Metodo per controllare se la lunghezza della stringa è pari
    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0;
    }

    // Metodo per controllare se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test del metodo stringaPariDispari
        String testStringa = "ciao";
        System.out.println("La stringa è pari: " + stringaPariDispari(testStringa));

        // Test del metodo annoBisestile
        int testAnno = 2025;
        System.out.println("L'anno è bisestile: " + annoBisestile(testAnno));
    }
}
