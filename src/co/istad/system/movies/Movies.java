package co.istad.system.movies;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movies {
    private String movieId;
    private String title;
    private String genre;
    private LocalDate releaseYear;
    private LocalDateTime duration;

    public Movies(){};

    public Movies(String movieId, String title, String genre, LocalDate releaseYear, LocalDateTime duration) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    public LocalDateTime getDuration() {
        return duration;
    }

    public void setDuration(LocalDateTime duration) {
        this.duration = duration;
    }
}
