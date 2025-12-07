package co.istad.system.movies.model;

public class Hall {
    private String hId;
    private String hName;
    private boolean booked;
    private Movie bookedMovie;

    public Hall(String hId, String hName) {
        this.hId = hId;
        this.hName = hName;
    }

    public Hall(String hId, boolean booked, String hName) {
        this.hId = hId;
        this.booked = booked;
        this.hName = hName;
    }

    public String gethId() {
        return hId;
    }

    public void sethId(String hId) {
        this.hId = hId;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public boolean isBooked() {
        return booked;
    }
    public Movie getBookedMovie() {
        return bookedMovie;
    }

    public void setBookedMovie(Movie bookedMovie) {
        this.bookedMovie = bookedMovie;
    }
}
