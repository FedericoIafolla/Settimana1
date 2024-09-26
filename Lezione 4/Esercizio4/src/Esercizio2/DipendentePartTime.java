package Esercizio2;

public class DipendentePartTime extends Dipendente {
    private double oreLavorate;

    public DipendentePartTime(String matricola, double stipendioOrario, double oreLavorate, String dipartimento) {
        super(matricola, stipendioOrario * oreLavorate, dipartimento); // Calcola stipendio totale
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return getStipendio(); // Salario calcolato nel costruttore
    }

    @Override
    public String getRuolo() {
        return "Dipendente Part-Time"; // Ruolo specifico
    }
}
