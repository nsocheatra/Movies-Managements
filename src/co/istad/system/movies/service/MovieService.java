package co.istad.system.movies.service;

import co.istad.system.movies.model.Movie;

import java.util.List; // Import List for the return type

public interface MovieService {

    void updateById(String id, Movie newMove);
    void deleteById(String id);
    void deleteByTitle(String title);
    void addMovie (Movie nmovie);

    List<Movie> findAll();
}