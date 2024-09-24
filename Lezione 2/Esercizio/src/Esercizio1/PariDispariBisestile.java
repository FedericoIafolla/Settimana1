package Esercizio1;

public class PariDispariBisestile {

    // Metodo che verifica se la lunghezza della stringa è pari
    public boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0; // Ritorna true se la lunghezza è pari
    }

    // Metodo che verifica se l'anno è bisestile
    public boolean annoBisestile(int anno) {
        // Controllo per determinare se l'anno è bisestile
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0; // Deve essere divisibile anche per 400
            }
            return true; // Se è divisibile per 4 e non per 100
        }
        return false; // Non è bisestile
    }
}
