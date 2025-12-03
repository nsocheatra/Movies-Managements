package co.istad.system.movies.service;

import co.istad.system.movies.model.Movie;

import java.util.List;

public interface MovieService {

    void addNew(Movie newMovie);

    void updateById(String id, Movie newMove);

    void deleteById(String id);

    void deleteByTitle(String title);

    Movie getMovie(String mvId);

    List<Movie> findAll();

}