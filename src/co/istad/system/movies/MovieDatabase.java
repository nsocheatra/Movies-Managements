package co.istad.system.movies;
package co.istad.system.movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoviesDatabase {

    private List<Movie> movies;
    private Scanner scanner;

    // Constructor
    public MoviesDatabase() {
        this.movies = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        preloadMovies(); // preload movies when database is created
    }

    // Add a movie to the database
    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added successfully!");
    }

    // Display all movies
    public void displayMovies() {
        if (movies.isEmpty()) {
            System.out.println("មិនមានរឿងទេ។");
            return;
        }
        System.out.println("\n===== All Movies =====");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    // Search movie by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movie found with title: " + title);
        }
    }

    // Preload some movies
    private void preloadMovies() {
        addMovie(new Movie(
                "Wicked: For Good", "Nov 21, 2025", "Musical", "2h 18m", "PG",
                new Director("Jon M. Chu"),
                List.of(new MainCast("Ariana Grande"), new MainCast("Cynthia Erivo"), new MainCast("Jonathan Bailey"))
        ));

        addMovie(new Movie(
                "Eddington", "Jul 18, 2025", "Western", "2h 28m", "R",
                new Director("Ari Aster"),
                List.of(new MainCast("Joaquin Phoenix"), new MainCast("Pedro Pascal"), new MainCast("Luke Grimes"))
        ));

        addMovie(new Movie(
                "Happy Gilmore 2", "Jul 25, 2025", "Comedy", "1h 54m", "PG-13",
                new Director("Kyle Newacheck"),
                List.of(new MainCast("Adam Sandler"), new MainCast("Julie Bowen"), new MainCast("Christopher McDonald"))
        ));

        addMovie(new Movie(
                "Demon Slayer: Infinity Castle", "Sept 12, 2025", "Animated", "2h 35m", "R",
                new Director("Haruo Sotozaki"),
                List.of(new MainCast("Natsuki Hanae"), new MainCast("Akari Kito"), new MainCast("Hiro Shimono"))
        ));

        addMovie(new Movie(
                "Nobody 2", "Aug 15, 2025", "Comedy", "1h 29m", "R",
                new Director("Timo Tjahjanto"),
                List.of(new MainCast("Bob Odenkirk"), new MainCast("Connie Nielsen"), new MainCast("John Ortiz"))
        ));

        addMovie(new Movie(
                "Final Destination Bloodlines", "May 16, 2025", "Horror", "1h 50m", "R",
                new Director("Adam B. Stein"),
                List.of(new MainCast("Kaitlyn Santa Juana"), new MainCast("Tony Todd"), new MainCast("Brec Bassinger"))
        ));

    }
}
