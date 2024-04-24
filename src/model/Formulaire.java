package model;

import java.time.LocalDate;

public class Formulaire {
    protected LocalDate dateReservation;
    protected int numeroEntite;

    public Formulaire(LocalDate dateReservation, int numeroEntite) {
        this.dateReservation = dateReservation;
        this.numeroEntite = numeroEntite;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public int getNumeroEntite() {
        return numeroEntite;
    }

    public void setNumeroEntite(int numeroEntite) {
        this.numeroEntite = numeroEntite;
    }
}
