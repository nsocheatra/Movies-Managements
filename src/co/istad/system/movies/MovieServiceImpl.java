package co.istad.system.movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieServiceImpl implements MovieService {
    private final MovieDatabase movieDatabase;

    public MovieServiceImpl() {
        List<Movie> initialMovieList = new ArrayList<>();
        Scanner consoleScanner = new Scanner(System.in);
        this.movieDatabase = new MovieDatabase();
    }

    @Override
    public void addMovie(Movie movie) {
        movieDatabase.addMovie(movie);
    }

    @Override
    public void displayMovie() {

    }

    @Override
    public void searchByTitle(String titles) {

    }


}