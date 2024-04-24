package model;
import java.time.LocalDate;

public class Reservation {
    protected LocalDate dateReservation;

    public Reservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    @Override
    public String toString() {
        return "Le " + dateReservation.getDayOfMonth() + "/" + dateReservation.getMonthValue();
    }
}
