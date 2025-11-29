package co.istad.system.movies;

import java.util.List;

public class Movie {
    private String title;
    private String releaseDate;
    private String genre;
    private String duration;
    private String rating;
    private Director director;
    private List<MainCast> mainCast;

    public Movie() {
    }

    public Movie(String title, String releaseDate, String genre, String duration, String rating, Director director, List<MainCast> mainCast) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        this.director = director;
        this.mainCast = mainCast;
    }

    public String getTitle() {

    }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<MainCast> getMainCast() {
        return mainCast;
    }

    public void setMainCast(List<MainCast> mainCast) {
        this.mainCast = mainCast;
    }
@Override
public String toString() {
    return "Movie {" +
            "\n  Title = '" + title + '\'' +
            ",\n  Release Date = '" + releaseDate + '\'' +
            ",\n  Genre = '" + genre + '\'' +
            ",\n  Duration = '" + duration + '\'' +
            ",\n  Rating = '" + rating + '\'' +
            ",\n  Director = " + director +
            ",\n  Main Cast = " + mainCast +
            "\n}";
}
}