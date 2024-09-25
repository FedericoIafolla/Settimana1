package Esercizio3;

import java.util.Date;

public class Cliente {
    private final String codiceCliente;
    private final String nome;
    private final String cognome;
    private final String email;
    private final Date dataIscrizione;

    public Cliente(String codiceCliente, String nome, String cognome, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }
}