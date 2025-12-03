package co.istad.system.movies.service;

import co.istad.system.movies.model.Movie;
import co.istad.system.movies.database.MovieDatabase;
import java.util.List;

public class MovieServiceImpl implements MovieService {
    private final MovieDatabase movieDb;
    public MovieServiceImpl(){
        movieDb = new MovieDatabase();
    }

//

    @Override
    public void addNew(Movie newMovie) {
        movieDb.insert(newMovie);
    }

    @Override
    public void updateById(String id, Movie newMove) {
        movieDb.updateById(id, newMove);

    }

    @Override
    public void deleteById(String id) {
        movieDb.deleteById(id);

    }

    @Override
    public void deleteByTitle(String title) {
        movieDb.deleteByTitle(title);

    }

    @Override
    public List<Movie> findAll() {
        return movieDb.getDataset();
    }

}
