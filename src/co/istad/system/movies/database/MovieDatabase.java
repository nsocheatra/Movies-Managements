package co.istad.system.movies.database;

import co.istad.system.movies.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MovieDatabase {
    private List<Movie> dataset;

    public MovieDatabase(){
        Movie spiderman = new Movie(UUID.randomUUID().toString(),"Eddington","Jul 18,2025","Western","2h 28m","Ari Aster","Joaquin Phoenix");
        Movie avatar2 = new Movie(UUID.randomUUID().toString(),"Eddington","Jul 18,2025","Western","2h 28m","Ari Aster","Joaquin Phoenix");

        dataset = new ArrayList<>();
        dataset.add(spiderman);
        dataset.add(avatar2);
    }


    public List<Movie> getDataset() {
        return dataset;
    }
    public void setDataset(List<Movie> dataset) {
        this.dataset = dataset;
    }
    public void insert(Movie newMovie){
        newMovie.setMvId(UUID.randomUUID().toString());
        dataset.add(newMovie);
    }
    public void delete(String id){
        dataset.removeIf(movie -> movie.getMvId().equals(id));
    }


    public void update(String id, Movie newMovie){
        dataset =dataset
                .stream()
                .peek(movie -> {
                    if (movie.getMvId().equals(id)){
                        movie.setTitle(newMovie.getTitle());
                        movie.setReleaseDate(newMovie.getReleaseDate());
                        movie.setGenre(newMovie.getGenre());
                        movie.setDuration(newMovie.getDuration());
                        movie.setDirector(newMovie.getDirector());
                        movie.setMainCasts(newMovie.getMainCasts());
                    }
                })
                .collect(Collectors.toList());
    }
//    private void updateById(){
//        ViewUtil.printMessage("Update Movie by ID");
//        String id= InputUtil.getText("Enter ID to update");
//        String title = InputUtil.getText("Enter Title");
//        String releaseDate = InputUtil.getText("Enter Release Date");
//        String genre = InputUtil.getText("Enter Genre");
//        String duration = InputUtil.getText("Enter Duration");
//        String director = InputUtil.getText("Enter Director");
//        String mainCasts = InputUtil.getText("Enter Casts");
//        Movie newMove = new Movie(title,releaseDate,genre,duration,director,mainCasts);
//        ViewUtil.printMessage("Movie updated successfully!");
//
//
//    }
}