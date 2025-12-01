package co.istad.system.movies.model;



public class Movie {
    private String mvId;
    private String title;
    private String releaseDate;
    private String genre;
    private String duration;
    private String director;
    private String mainCasts;

    public Movie(String mvId, String title, String releaseDate, String genre, String duration, String director, String mainCasts) {
        this.mvId = mvId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
        this.mainCasts = mainCasts;
    }

    public Movie(String title, String releaseDate, String genre, String duration, String director, String mainCasts) {
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMainCasts() {
        return mainCasts;
    }

    public void setMainCasts(String mainCasts) {
        this.mainCasts = mainCasts;
    }



}

