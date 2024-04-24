package model;
import java.time.LocalDate;

public class ReservationRestaurant extends Reservation {
    private int numeroTable;
    private int numeroService;

    public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
        super(LocalDate.of(LocalDate.now().getYear(), mois, jour));
        this.numeroTable = numeroTable;
        this.numeroService = numeroService;
    }

    @Override
    public String toString() {
        String service = (numeroService == 1) ? "premier" : "deuxième";
        return super.toString() + "\nTable " + numeroTable + " pour le " + service + " service.";
    }
}