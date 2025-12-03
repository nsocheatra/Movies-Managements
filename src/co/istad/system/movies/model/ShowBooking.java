package co.istad.system.movies.model;

public class ShowBooking {
    private Movie movie;
    private Hall hall;
    private boolean isBooked;

    public ShowBooking(Movie movie, Hall hall,boolean booked ) {
        this.movie = movie;
        this.hall = hall;
        this.isBooked= booked;
    }

    public Movie getMovie() {
        return movie;
    }

    public Hall getHall() {
        return hall;
    }

    public boolean getStatus() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }
}
