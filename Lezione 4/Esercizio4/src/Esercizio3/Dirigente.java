package Esercizio3;

public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(String nome, String matricola, double stipendio, String dipartimento, double bonus) {
        super(nome, matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + bonus; // Stipendio più bonus
    }

    @Override
    public String getRuolo() {
        return "Dirigente";
    }
}
