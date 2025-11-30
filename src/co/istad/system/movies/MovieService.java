package co.istad.system.movies;

public interface MovieService {
    void addMovie (Movie movie);
    void displayMovie();
    void searchByTitle(String titles);
}
