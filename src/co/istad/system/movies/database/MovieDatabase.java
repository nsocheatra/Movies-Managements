package co.istad.system.movies.database;

import co.istad.system.movies.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MovieDatabase {
    private List<Movie> dataset;

    public MovieDatabase() {
        Movie BlackBag = new Movie(UUID.randomUUID().toString(), "Black Bag", "Mar 14,2025", "Thriller", "1h 33m", "Steven Soderbergh", "Cate Blanchett, Michael Fassbender, Marisa Abela");
        Movie TheAmateur = new Movie(UUID.randomUUID().toString(), "The Amateur", "Apr 11,2025", "Thriller", "2h 2m", "James Hawes", "Rami Malek, Rechel Brosnahan, Laurence Fishburne");
        Movie Warfare = new Movie(UUID.randomUUID().toString(), "Warfare", "Apr 11,2025", "War", "1h 35m", "Ray Mendoza", "D'Pharaoh Woon-A-Tai, Will Poulter, Cosmo Jarvis");
        Movie FinalDestinationBloodlines = new Movie(UUID.randomUUID().toString(), "Final Destination BloodLines", "May 16,2025", "Horror", "1h 50m", "Adam B Stein", "Kaitlyn Santa juana, Tony Todd, Brec Bassinger");
        Movie KarateKidLegends = new Movie(UUID.randomUUID().toString(), "Karate Kid: Legends", "May 30,2025", "Martial Arts", "1h 34m", "Jonathan Entwistle", "Ralph Macchio, Jackie Chan, Ben Wang");
        Movie BringHerBack = new Movie(UUID.randomUUID().toString(), "Bring Her Back", "May 30,2025", "Thriller", "1h 44m", "Danny Philippou", "Sally Hawkins, Billy Barratt, Sora Wong");
        Movie HeadsOfState = new Movie(UUID.randomUUID().toString(), "Heads of State", "Jul 2,2025", "Comedy", "1h 53m", "Ilya Naishuller", "Idris Elba, John Cena, Priyanka Chopra Jonas");
        Movie Superman = new Movie(UUID.randomUUID().toString(), "Superman", "Jul 11,2025", "Science Fiction", "2h 9m", "James Gunn", "David Corenswet, Rachel Brosnahan, Nicholas Hoult");
        Movie Eddington = new Movie(UUID.randomUUID().toString(), "Eddington", "Jul 18,2025", "Western", "2h 28m", "Ari Aster", "Joaquin Phoenix");
        Movie HappyGilmore2 = new Movie(UUID.randomUUID().toString(), "Happy Gilmore2", "Jul 25,2025", "Comedy", "1h 54m", "Kyle Newacheck", "Adam Sandler, Julie Bowen, Christopher McDonald");
        Movie TheFantasticFourFirstSteps = new Movie(UUID.randomUUID().toString(), "The Fantastic Four: First Steps", "Jul 25,2025", "Science Fiction", "1h 54m", "Matt Shakman", "Pedro Pascal, Vanessa Kirby, Ebon Moss-Bachrach");
        Movie TheNakedGun = new Movie(UUID.randomUUID().toString(), "The Naked Gun", "Aug 1,2025", "Comedy", "1h 25m", "Akiva", "Liam Neeson, Pamela Anderson, Paul Walter Hauser");
        Movie Nobody2 = new Movie(UUID.randomUUID().toString(), "Nobody 2", "Aug 15,2025", "Comedy", "1h 29m", "Timo Tjahjanto", "Bob Odenkirk, Connie Nielsen, John Ortiz");
        Movie Eden = new Movie(UUID.randomUUID().toString(), "Eden", "Aug 22,2025", "Thriller", "2h 9m", "Ron Howard", "Jude Law, Ana de Armas, Vanessa Kirby");
        Movie TheThursdayMurderClub = new Movie(UUID.randomUUID().toString(), "The Thursday Murder Club", "Aug 28,2025", "Mystery", "1h 58m", "Chris Columbus", "Helen Mirren, Pierce Brosnan, Ben Kingsley");
        Movie TheRoses = new Movie(UUID.randomUUID().toString(), "The Roses", "Aug 29,2025", "Dark Comedy", "1h 45m", "Jay Roach", "Benedict Cumberbatch, Olivia Colman, Andy Samberg");
        Movie TheConjuringLastRites = new Movie(UUID.randomUUID().toString(), "The Conjuring: Last Rites", "Sep 5,2025", "Thriller", "2h 15m", "Michael Chaves", "Patrick Wilson, Vera Farmiga, Mia Tomlinson");
        Movie DemonSlayer = new Movie(UUID.randomUUID().toString(), "Demon Slayer", "Sep 12,2025", "Animated", "2h 35m", "Haruo Sotozaki", "Natsuki Hanae");
        Movie TheLongWalk = new Movie(UUID.randomUUID().toString(), "The Long Walk", "Sep 12,2025", "Thriller", "1h 48m", "Francis Lawrence", "Cooper Hoffman, David Jonsson, Garrett Wareing");
        Movie AHouseofDynamite = new Movie(UUID.randomUUID().toString(), "A House of Dynamite", "Oct 10,2025", "Thriller", "1h 52m", "Kathryn Bigelow", "Idris Elba, Rebecca Ferguson, Gabriel Basso");
        Movie BlackPhone2 = new Movie(UUID.randomUUID().toString(), "Black Phone 2", "Oct 17,2025", "Thriller", "1h 54m", "Scott Derrickson", "Ethan Hawke, Mason Thames, Madekeline McGraw");
        Movie Frankenstein = new Movie(UUID.randomUUID().toString(), "Frankenstein", "Oct 17,2025", "Horror", "2h 29m", "Guillermo del Toro", "Oscar Isaac, Jacob Elordi, Mia Goth");
        Movie TrainDreams = new Movie(UUID.randomUUID().toString(), "Train Dreams", "Nov 7,2025", "Drama", "1h 42m", "Clint Bentley", "Joel Edgerton, Clifton Collins Jr, Felicity Jones");
        Movie PredatorBadlands = new Movie(UUID.randomUUID().toString(), "Predator: Badlands", "Nov 7,2025", "Science Fiction", "1h 47m", "Dan Trachtenberg", "Elle Fanning, Dimitrius ,Schuster Koloamatangi");
        Movie Nuremberg = new Movie(UUID.randomUUID().toString(), "Nuremberg", "Nov 7,2025", "Historical Drama", "2h 28m", "James Vanderbilt", "Russell Crowe, Rami Malek, Leo Woodall");
        Movie Wicked = new Movie(UUID.randomUUID().toString(), "Wicked: For Good", "Nov 21,2025", "Musical", "2h 18m", "Jon M.Chu", "Ariana Grande");
        Movie TheFamlilyPlan2 = new Movie(UUID.randomUUID().toString(), "The Family Plan2", "Nov 21,2025", "Comedy", "1h 46m", "Simon Cellan Jones", "Mark Wahlberg, Michelle Monaghan, Zow Colletti");
        Movie SisuRoadToRevenge = new Movie(UUID.randomUUID().toString(), "Sisu: Road to Revenge", "Nov 21,2025", "Action", "1h 29m", "Jalmari Helander", "Jorma Tommila, Stephen Lang, Richard Brake");
        Movie TheGreatEscaper = new Movie(UUID.randomUUID().toString(), "The Great Escaper", "Nov 23,2025", "Drama", "1h 36m", "Oliver Parker", "Michael Caine, Glenda Jackson, Danielle Vitalis");


        dataset = new ArrayList<>();
        dataset.add(BlackBag);
        dataset.add(TheAmateur);
        dataset.add(Warfare);
        dataset.add(FinalDestinationBloodlines);
        dataset.add(KarateKidLegends);
        dataset.add(BringHerBack);
        dataset.add(HeadsOfState);
        dataset.add(Superman);
        dataset.add(Eddington);
        dataset.add(HappyGilmore2);
        dataset.add(TheFantasticFourFirstSteps);
        dataset.add(TheNakedGun);
        dataset.add(Nobody2);
        dataset.add(Eden);
        dataset.add(TheThursdayMurderClub);
        dataset.add(TheRoses);
        dataset.add(TheConjuringLastRites);
        dataset.add(DemonSlayer);
        dataset.add(TheLongWalk);
        dataset.add(AHouseofDynamite);
        dataset.add(BlackPhone2);
        dataset.add(Frankenstein);
        dataset.add(TrainDreams);
        dataset.add(PredatorBadlands);
        dataset.add(Nuremberg);
        dataset.add(Wicked);
        dataset.add(TheFamlilyPlan2);
        dataset.add(SisuRoadToRevenge);
        dataset.add(TheGreatEscaper);
    }


    public List<Movie> getDataset() {
        return dataset;
    }

    public void setDataset(List<Movie> dataset) {
        this.dataset = dataset;
    }

    public void insert(Movie newMovie) {
        newMovie.setMvId(UUID.randomUUID().toString());
        dataset.add(newMovie);
    }

    public void delete(String id) {
        dataset.removeIf(movie -> movie.getMvId().equals(id));
    }


    public void update(String id, Movie newMovie) {
        dataset = dataset
                .stream()
                .peek(movie -> {
                    if (movie.getMvId().equals(id)) {
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