package co.istad.system.movies;

import java.util.ArrayList; // Added import
import java.util.List;
import java.util.UUID;

public class MovieDatabase {
    private List<Movie> dataset;
    public MovieDatabase(){
        Movie spiderman = new Movie(UUID.randomUUID(),"Eddington","Jul 18,2025","Western","2h 28m",new Director("Ari Aster"),new MainCast("Joaquin Phoenix"));
        Movie avatar2 = new Movie(UUID.randomUUID(),"Eddington","Jul 18,2025","Western","2h 28m",new Director("Ari Aster"),new MainCast("Joaquin Phoenix"));







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
        newMovie.setMvId(UUID.randomUUID());
        dataset.add(newMovie);
    }
    public void delete(String id){
        dataset.removeIf(movie -> movie.getMvId().equals(id);
    }
    public void update (String id, Movie newMovie){
        dataset = dataset
                .stream()
                .peek(movie -> {
                    if (movie.getMvId().equals(id)){
                        movie.setTitle(newMovie.getTitle());
                        movie.setReleaseDate(newMovie.getReleaseDate());
                        movie.setGrenre(newMovie.getGrenre());
                        movie.setDuration(newMovie.getDuration());
                        movie.setDirector(newMovie.getDirector());
                        movie.setMainCasts(newMovie.getMainCasts());
                    }
                });

    }

}