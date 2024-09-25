package Esercizio2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sim {
    // Classe pubblica Chiamata
    public static class Chiamata {
        private final String numeroChiamato;
        private final int durataMinuti;

        public Chiamata(String numeroChiamato, int durataMinuti) {
            this.numeroChiamato = numeroChiamato;
            this.durataMinuti = durataMinuti;
        }

        public String getNumeroChiamato() {
            return numeroChiamato;
        }

        public int getDurataMinuti() {
            return durataMinuti;
        }
    }

    public static class SIM {
        private final String numeroTelefono;
        private double credito;
        private final Deque<Chiamata> chiamate;

        public SIM(String numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
            this.credito = 0;
            this.chiamate = new ArrayDeque<>(); // Utilizzo di ArrayDeque per gestire le chiamate
        }

        public void aggiungiChiamata(Chiamata chiamata) {
            if (chiamate.size() == 5) {
                chiamate.removeFirst(); // Rimuovi la chiamata più vecchia
            }
            chiamate.addLast(chiamata); // Aggiungi la nuova chiamata
        }

        public void stampaDatiSIM() {
            System.out.println("Dati della SIM:");
            System.out.println("-----------------");
            System.out.println("Numero di telefono: " + numeroTelefono);
            System.out.println("Credito: " + credito + "€");
            System.out.println("Ultime 5 chiamate:");
            for (Chiamata chiamata : chiamate) {
                System.out.println("  - Numero chiamato: " + chiamata.getNumeroChiamato() + ", Durata: " + chiamata.getDurataMinuti() + " minuti");
            }
        }

        public static void main(String[] args) {
            SIM sim = new SIM("1234567890");
            sim.aggiungiChiamata(new Chiamata("0987654321", 10));
            sim.aggiungiChiamata(new Chiamata("1122334455", 5));
            sim.aggiungiChiamata(new Chiamata("1234567890", 8));
            sim.aggiungiChiamata(new Chiamata("9876543210", 12));
            sim.aggiungiChiamata(new Chiamata("5555555555", 6));
            sim.stampaDatiSIM();
        }
    }
}