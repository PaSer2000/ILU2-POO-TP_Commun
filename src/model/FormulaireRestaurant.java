package model;

import java.time.LocalDate;

public class FormulaireRestaurant extends Formulaire {
    private int nombrePersonnes;
    private int numeroService;

    public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numeroService) {
        super(LocalDate.of(LocalDate.now().getYear(), mois, jour), 0);
        this.nombrePersonnes = nombrePersonnes;
        this.numeroService = numeroService;
    }

    public int getNombrePersonnes() {
        return nombrePersonnes;
    }

    public int getNumService() {
        return numeroService;
    }

    public int getJour() {
        return getDateReservation().getDayOfMonth();
    }

    public int getMois() {
        return getDateReservation().getMonthValue();
    }

    public void setIdentificationEntite(int identification) {
        this.numeroEntite = identification;
    }

    public int getIdentificationEntite() {
        return numeroEntite;
    }
}
