package co.istad.system.movies.service;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;
import java.util.List;

public interface HallService {
    // Returning a List<Movie> here is a simplification for the demo
    List<Hall> findAll();
}