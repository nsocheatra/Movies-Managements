package co.istad.system.movies.model;


import java.time.LocalDate;
import java.time.LocalTime;

public class Movie {
    private String mvId;
    private String title;
    private LocalDate releaseDate;
    private String genre;
    private LocalTime duration;
    private String director;
    private String mainCast;



    public boolean isBookMovie(Hall hall) {
        return false;
    }


    public Movie (){

    }
    public Movie(String title, LocalDate releaseDate, String genre, LocalTime duration, String director, String mainCast) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
        this.mainCast = mainCast;
    }

    public Movie(String mvId,String title, LocalDate releaseDate, String genre, LocalTime duration, String director, String mainCast) {
        this.mvId = mvId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
        this.mainCast = mainCast;
    }

    public String getMvId() {
        return mvId;
    }

    public void setMvId(String mvId) {
        this.mvId = mvId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMainCast() {
        return mainCast;
    }

    public void setMainCast(String mainCast) {
        this.mainCast = mainCast;
    }

}
