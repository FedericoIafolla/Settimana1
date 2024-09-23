import java.util.Scanner;

public class Main {

    // Esercizio1

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    public static String concatena(String str, int num) {
        return str + num;
    }

    public static String[] inserisciInArray(String[] array, String elemento) {
        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = elemento;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];
        return nuovoArray;
    }

    // esercizio 2

    public static void esercizio2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = scanner.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = scanner.nextLine();
        System.out.print("Inserisci la terza stringa: ");
        String stringa3 = scanner.nextLine();

        String concatenata = stringa1 + stringa2 + stringa3;
        System.out.println("Concatenazione: " + concatenata);

        String concatenataInversa = stringa3 + stringa2 + stringa1;
        System.out.println("Concatenazione Inversa: " + concatenataInversa);
    }

    // Esercizio 3

    public static double perimetroRettangolo(double lunghezza, double larghezza) {
        return 2 * (lunghezza + larghezza);
    }

    public static int pariDispari(int numero) {
        return (numero % 2 == 0) ? 0 : 1;
    }

    public static double areaTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void esercizio3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la lunghezza del rettangolo: ");
        double lunghezza = scanner.nextDouble();
        System.out.print("Inserisci la larghezza del rettangolo: ");
        double larghezza = scanner.nextDouble();
        System.out.println("Perimetro del rettangolo: " + perimetroRettangolo(lunghezza, larghezza));

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        System.out.println("Il numero è " + (pariDispari(numero) == 0 ? "pari" : "dispari"));

        System.out.print("Inserisci il lato a del triangolo: ");
        double a = scanner.nextDouble();
        System.out.print("Inserisci il lato b del triangolo: ");
        double b = scanner.nextDouble();
        System.out.print("Inserisci il lato c del triangolo: ");
        double c = scanner.nextDouble();
        System.out.println("Area del triangolo: " + areaTriangolo(a, b, c));
    }

    public static void main(String[] args) {
        // Esercizio 1
        int prodotto = moltiplica (3, 4);
        System.out.println("prodotto: " + prodotto);

        String concatenata = concatena("Numero: " , 5);
        System.out.println("Concatenazione: " + concatenata);

        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        String[] nuovoArray= inserisciInArray(array, "tre e mezzo");
        System.out.println("nuovo Array: " + String.join(", ", nuovoArray));

        // Esercizio 2
        System.out.println("\nEsercizio 2:");
        esercizio2();

        // Esercizio 3
        System.out.println("\nEsercizio 3:");
        esercizio3();
    }
}