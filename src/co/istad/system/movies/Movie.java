package co.istad.system.movies;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Movie {
    private UUID mvId;
    private String title;
    private String releaseDate;
    private String grenre;
    private String duration;
    private Director director;
    private MainCast mainCasts;
    public Movie(){
    }

    public Movie(UUID mvId, String title, String releaseDate, String grenre, String duration, Director director, MainCast mainCasts) {
        this.mvId = mvId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.grenre = grenre;
        this.duration = duration;
        this.director = director;
        this.mainCasts = mainCasts;
    }

    public UUID getMvId(UUID mvId) {
        return mvId;
    }

    public void setMvId(UUID mvId) {
        this.mvId = mvId;
    }

    public String getTitle() {
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

    public String getGrenre() {
        return grenre;
    }

    public void setGrenre(String grenre) {
        this.grenre = grenre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public MainCast getMainCasts() {
        return mainCasts;
    }

    public void setMainCasts(MainCast mainCasts) {
        this.mainCasts = mainCasts;
    }
}

