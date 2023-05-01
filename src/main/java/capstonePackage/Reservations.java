package src.main.java.capstonePackage;

import java.time.LocalDate;

public class Reservations {//class beg
    //---------------------------------------------VARIABLE-------------------------------------------


    private int reservationNumber;

    private LocalDate localDate;
    //private Time timeOfReservation;


    //---------------------------------------------CONSTRUCTORS-------------------------------------------

    public Reservations() {
    }

    public Reservations(int reservationNumber, LocalDate localDate) {
        this.reservationNumber = reservationNumber;
        this.localDate = localDate;
    }
//---------------------------------------------BUSINESS LOGIC/METHODS---------------------------------


    //---------------------------------------------GETTER/SETTER-------------------------------------------


    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}//class end

