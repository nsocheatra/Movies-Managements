package co.istad.system.movies.database;

import co.istad.system.movies.model.Movie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MovieDatabase {

    private List<Movie> dataset;
    public MovieDatabase(){
        Movie blackBag = new Movie();
        blackBag.setMvId(UUID.randomUUID().toString());
        blackBag.setTitle("Black Bag");
        blackBag.setReleaseDate(LocalDate.of(2025,3,14));
        blackBag.setGenre("Thriller");
        blackBag.setDuration(LocalTime.of(1,33));
        blackBag.setDirector("Steven Soderbergh");
        blackBag.setMainCast("Cate Blanchett, Michael Fassbender, Marisa Abela");

        Movie theAmateur = new Movie();
        theAmateur.setMvId(UUID.randomUUID().toString());
        theAmateur.setTitle("The Amateur");
        theAmateur.setReleaseDate(LocalDate.of(2025,4,11));
        theAmateur.setGenre("Thriller");
        theAmateur.setDuration(LocalTime.of(2,2));
        theAmateur.setDirector("James Hawes");
        theAmateur.setMainCast("Rami Malek, Rechel Brosnahan, Laurence Fishburne");

        Movie warfare = new Movie();
        warfare.setMvId(UUID.randomUUID().toString());
        warfare.setTitle("Warfare");
        warfare.setReleaseDate(LocalDate.of(2025,4,11));
        warfare.setGenre("War");
        warfare.setDuration(LocalTime.of(1,35));
        warfare.setDirector("Ray Mendoza");
        warfare.setMainCast("D'Pharaoh Woon-A-Tai, Will Poulter, Cosmo Jarvis");

        Movie finalDestinationBloodlines = new Movie();
        finalDestinationBloodlines.setMvId(UUID.randomUUID().toString());
        finalDestinationBloodlines.setTitle("Final Destination BloodLines");
        finalDestinationBloodlines.setReleaseDate(LocalDate.of(2025,5,16));
        finalDestinationBloodlines.setGenre("Horror");
        finalDestinationBloodlines.setDuration(LocalTime.of(1,50));
        finalDestinationBloodlines.setDirector("Adam B Stein");
        finalDestinationBloodlines.setMainCast("Kaitlyn Santa Juana, Tony Todd, Brec Bassinger");

        Movie karateKidLegends = new Movie();
        karateKidLegends.setMvId(UUID.randomUUID().toString());
        karateKidLegends.setTitle("Karate Kid: Legends");
        karateKidLegends.setReleaseDate(LocalDate.of(2025,5,30));
        karateKidLegends.setGenre("Martial Arts");
        karateKidLegends.setDuration(LocalTime.of(1,34));
        karateKidLegends.setDirector("Jonathan Entwistle");
        karateKidLegends.setMainCast("Ralph Macchio, Jackie Chan, Ben Wang");

        Movie bringHerBack = new Movie();
        bringHerBack.setMvId(UUID.randomUUID().toString());
        bringHerBack.setTitle("Bring Her Back");
        bringHerBack.setReleaseDate(LocalDate.of(2025,5,30));
        bringHerBack.setGenre("Thriller");
        bringHerBack.setDuration(LocalTime.of(1,44));
        bringHerBack.setDirector("Danny Philippou");
        bringHerBack.setMainCast("Sally Hawkins, Billy Barratt, Sora Wong");

        Movie headsOfState = new Movie();
        headsOfState.setMvId(UUID.randomUUID().toString());
        headsOfState.setTitle("Heads of State");
        headsOfState.setReleaseDate(LocalDate.of(2025,7,2));
        headsOfState.setGenre("Comedy");
        headsOfState.setDuration(LocalTime.of(1,53));
        headsOfState.setDirector("Ilya Naishuller");
        headsOfState.setMainCast("Idris Elba, John Cena, Priyanka Chopra Jonas");

        Movie superman = new Movie();
        superman.setMvId(UUID.randomUUID().toString());
        superman.setTitle("Superman");
        superman.setReleaseDate(LocalDate.of(2025,7,11));
        superman.setGenre("Science Fiction");
        superman.setDuration(LocalTime.of(2,9));
        superman.setDirector("James Gunn");
        superman.setMainCast("David Corenswet, Rachel Brosnahan, Nicholas Hoult");

        Movie eddington = new Movie();
        eddington.setMvId(UUID.randomUUID().toString());
        eddington.setTitle("Eddington");
        eddington.setReleaseDate(LocalDate.of(2025,7,18));
        eddington.setGenre("Western");
        eddington.setDuration(LocalTime.of(2,28));
        eddington.setDirector("Ari Aster");
        eddington.setMainCast("Joaquin Phoenix");

        Movie happyGilmore2 = new Movie();
        happyGilmore2.setMvId(UUID.randomUUID().toString());
        happyGilmore2.setTitle("Happy Gilmore 2");
        happyGilmore2.setReleaseDate(LocalDate.of(2025,7,25));
        happyGilmore2.setGenre("Comedy");
        happyGilmore2.setDuration(LocalTime.of(1,54));
        happyGilmore2.setDirector("Kyle Newacheck");
        happyGilmore2.setMainCast("Adam Sandler, Julie Bowen, Christopher McDonald");


        Movie theNakedGun = new Movie();
        theNakedGun.setMvId(UUID.randomUUID().toString());
        theNakedGun.setTitle("The Naked Gun");
        theNakedGun.setReleaseDate(LocalDate.of(2025,8,1));
        theNakedGun.setGenre("Comedy");
        theNakedGun.setDuration(LocalTime.of(1,25));
        theNakedGun.setDirector("Akiva");
        theNakedGun.setMainCast("Liam Neeson, Pamela Anderson, Paul Walter Hauser");

        Movie nobody2 = new Movie();
        nobody2.setMvId(UUID.randomUUID().toString());
        nobody2.setTitle("Nobody 2");
        nobody2.setReleaseDate(LocalDate.of(2025,8,15));
        nobody2.setGenre("Comedy");
        nobody2.setDuration(LocalTime.of(1,29));
        nobody2.setDirector("Timo Tjahjanto");
        nobody2.setMainCast("Bob Odenkirk, Connie Nielsen, John Ortiz");

        Movie eden = new Movie();
        eden.setMvId(UUID.randomUUID().toString());
        eden.setTitle("Eden");
        eden.setReleaseDate(LocalDate.of(2025,8,22));
        eden.setGenre("Thriller");
        eden.setDuration(LocalTime.of(2,9));
        eden.setDirector("Ron Howard");
        eden.setMainCast("Jude Law, Ana de Armas, Vanessa Kirby");

        Movie theThursdayMurderClub = new Movie();
        theThursdayMurderClub.setMvId(UUID.randomUUID().toString());
        theThursdayMurderClub.setTitle("The Thursday Murder Club");
        theThursdayMurderClub.setReleaseDate(LocalDate.of(2025,8,28));
        theThursdayMurderClub.setGenre("Mystery");
        theThursdayMurderClub.setDuration(LocalTime.of(1,58));
        theThursdayMurderClub.setDirector("Chris Columbus");
        theThursdayMurderClub.setMainCast("Helen Mirren, Pierce Brosnan, Ben Kingsley");

        Movie theRoses = new Movie();
        theRoses.setMvId(UUID.randomUUID().toString());
        theRoses.setTitle("The Roses");
        theRoses.setReleaseDate(LocalDate.of(2025,8,29));
        theRoses.setGenre("Dark Comedy");
        theRoses.setDuration(LocalTime.of(1,45));
        theRoses.setDirector("Jay Roach");
        theRoses.setMainCast("Benedict Cumberbatch, Olivia Colman, Andy Samberg");

        Movie theConjuringLastRites = new Movie();
        theConjuringLastRites.setMvId(UUID.randomUUID().toString());
        theConjuringLastRites.setTitle("The Conjuring: Last Rites");
        theConjuringLastRites.setReleaseDate(LocalDate.of(2025,9,5));
        theConjuringLastRites.setGenre("Thriller");
        theConjuringLastRites.setDuration(LocalTime.of(2,15));
        theConjuringLastRites.setDirector("Michael Chaves");
        theConjuringLastRites.setMainCast("Patrick Wilson, Vera Farmiga, Mia Tomlinson");

        Movie demonSlayer = new Movie();
        demonSlayer.setMvId(UUID.randomUUID().toString());
        demonSlayer.setTitle("Demon Slayer");
        demonSlayer.setReleaseDate(LocalDate.of(2025,9,12));
        demonSlayer.setGenre("Animated");
        demonSlayer.setDuration(LocalTime.of(2,35));
        demonSlayer.setDirector("Haruo Sotozaki");
        demonSlayer.setMainCast("Natsuki Hanae");

        Movie theLongWalk = new Movie();
        theLongWalk.setMvId(UUID.randomUUID().toString());
        theLongWalk.setTitle("The Long Walk");
        theLongWalk.setReleaseDate(LocalDate.of(2025,9,12));
        theLongWalk.setGenre("Thriller");
        theLongWalk.setDuration(LocalTime.of(1,48));
        theLongWalk.setDirector("Francis Lawrence");
        theLongWalk.setMainCast("Cooper Hoffman, David Jonsson, Garrett Wareing");



        Movie blackPhone2 = new Movie();
        blackPhone2.setMvId(UUID.randomUUID().toString());
        blackPhone2.setTitle("Black Phone 2");
        blackPhone2.setReleaseDate(LocalDate.of(2025,10,17));
        blackPhone2.setGenre("Thriller");
        blackPhone2.setDuration(LocalTime.of(1,54));
        blackPhone2.setDirector("Scott Derrickson");
        blackPhone2.setMainCast("Ethan Hawke, Mason Thames, Madekeline McGraw");

        Movie frankenstein = new Movie();
        frankenstein.setMvId(UUID.randomUUID().toString());
        frankenstein.setTitle("Frankenstein");
        frankenstein.setReleaseDate(LocalDate.of(2025,10,17));
        frankenstein.setGenre("Horror");
        frankenstein.setDuration(LocalTime.of(2,29));
        frankenstein.setDirector("Guillermo del Toro");
        frankenstein.setMainCast("Oscar Isaac, Jacob Elordi, Mia Goth");

        Movie trainDreams = new Movie();
        trainDreams.setMvId(UUID.randomUUID().toString());
        trainDreams.setTitle("Train Dreams");
        trainDreams.setReleaseDate(LocalDate.of(2025,11,7));
        trainDreams.setGenre("Drama");
        trainDreams.setDuration(LocalTime.of(1,42));
        trainDreams.setDirector("Clint Bentley");
        trainDreams.setMainCast("Joel Edgerton, Clifton Collins Jr, Felicity Jones");

        Movie predatorBadlands = new Movie();
        predatorBadlands.setMvId(UUID.randomUUID().toString());
        predatorBadlands.setTitle("Predator: Badlands");
        predatorBadlands.setReleaseDate(LocalDate.of(2025,11,7));
        predatorBadlands.setGenre("Science Fiction");
        predatorBadlands.setDuration(LocalTime.of(1,47));
        predatorBadlands.setDirector("Dan Trachtenberg");
        predatorBadlands.setMainCast("Elle Fanning, Dimitrius Schuster Koloamatangi");

        Movie nuremberg = new Movie();
        nuremberg.setMvId(UUID.randomUUID().toString());
        nuremberg.setTitle("Nuremberg");
        nuremberg.setReleaseDate(LocalDate.of(2025,11,7));
        nuremberg.setGenre("Historical Drama");
        nuremberg.setDuration(LocalTime.of(2,28));
        nuremberg.setDirector("James Vanderbilt");
        nuremberg.setMainCast("Russell Crowe, Rami Malek, Leo Woodall");

        Movie wicked = new Movie();
        wicked.setMvId(UUID.randomUUID().toString());
        wicked.setTitle("Wicked: For Good");
        wicked.setReleaseDate(LocalDate.of(2025,11,21));
        wicked.setGenre("Musical");
        wicked.setDuration(LocalTime.of(2,18));
        wicked.setDirector("Jon M. Chu");
        wicked.setMainCast("Ariana Grande");

        Movie theFamilyPlan2 = new Movie();
        theFamilyPlan2.setMvId(UUID.randomUUID().toString());
        theFamilyPlan2.setTitle("The Family Plan 2");
        theFamilyPlan2.setReleaseDate(LocalDate.of(2025,11,21));
        theFamilyPlan2.setGenre("Comedy");
        theFamilyPlan2.setDuration(LocalTime.of(1,46));
        theFamilyPlan2.setDirector("Simon Cellan Jones");
        theFamilyPlan2.setMainCast("Mark Wahlberg, Michelle Monaghan, Zow Colletti");

        Movie sisuRoadToRevenge = new Movie();
        sisuRoadToRevenge.setMvId(UUID.randomUUID().toString());
        sisuRoadToRevenge.setTitle("Sisu: Road to Revenge");
        sisuRoadToRevenge.setReleaseDate(LocalDate.of(2025,11,21));
        sisuRoadToRevenge.setGenre("Action");
        sisuRoadToRevenge.setDuration(LocalTime.of(1,29));
        sisuRoadToRevenge.setDirector("Jalmari Helander");
        sisuRoadToRevenge.setMainCast("Jorma Tommila, Stephen Lang, Richard Brake");

        Movie theGreatEscaper = new Movie();
        theGreatEscaper.setMvId(UUID.randomUUID().toString());
        theGreatEscaper.setTitle("The Great Escaper");
        theGreatEscaper.setReleaseDate(LocalDate.of(2025,11,23));
        theGreatEscaper.setGenre("Drama");
        theGreatEscaper.setDuration(LocalTime.of(1,36));
        theGreatEscaper.setDirector("Oliver Parker");
        theGreatEscaper.setMainCast("Michael Caine, Glenda Jackson, Danielle Vitalis");


        dataset=new ArrayList<>();
        dataset.add(blackBag);
        dataset.add(theAmateur);
        dataset.add(warfare);
        dataset.add(finalDestinationBloodlines);
        dataset.add(karateKidLegends);
        dataset.add(bringHerBack);
        dataset.add(headsOfState);
        dataset.add(superman);
        dataset.add(eddington);
        dataset.add(happyGilmore2);
        dataset.add(theNakedGun);
        dataset.add(nobody2);
        dataset.add(eden);
        dataset.add(theThursdayMurderClub);
        dataset.add(theRoses);
        dataset.add(theConjuringLastRites);
        dataset.add(demonSlayer);
        dataset.add(theLongWalk);
        dataset.add(blackPhone2);
        dataset.add(frankenstein);
        dataset.add(trainDreams);
        dataset.add(predatorBadlands);
        dataset.add(nuremberg);
        dataset.add(wicked);
        dataset.add(theFamilyPlan2);
        dataset.add(sisuRoadToRevenge);
        dataset.add(theGreatEscaper);

    }

    public List<Movie> getDataset() {
        return dataset;
    }
    public void insert(Movie newMovie) {
        newMovie.setMvId(UUID.randomUUID().toString());
        dataset.add(newMovie);
    }
    public void updateById(String id, Movie newMovie) {
        dataset = dataset
                .stream()
                .peek(movie -> {
                    if (movie.getMvId().equals(id)) {
                        movie.setTitle(newMovie.getTitle());
                        movie.setReleaseDate(newMovie.getReleaseDate());
                        movie.setGenre(newMovie.getGenre());
                        movie.setDuration(newMovie.getDuration());
                        movie.setDirector(newMovie.getDirector());
                        movie.setMainCast(newMovie.getMainCast());
                    }
                })
                .collect(Collectors.toList());
    }

    public void deleteById(String id) {
        dataset.removeIf(movie -> movie.getMvId().equals(id));
    }

    public void deleteByTitle(String title){
        dataset.removeIf(movie -> movie.getTitle().equals(title));
    }



//    public void updateByTitle(String title, Movie newMovie) {
//        dataset = dataset
//                .stream()
//                .peek(movie -> {
//                    if (movie.getTitle().equals(title)) {
//                        movie.setTitle(newMovie.getTitle());
//                        movie.setReleaseDate(newMovie.getReleaseDate());
//                        movie.setGenre(newMovie.getGenre());
//                        movie.setDuration(newMovie.getDuration());
//                        movie.setDirector(newMovie.getDirector());
//                        movie.setMainCasts(newMovie.getMainCasts());
//                    }
//                })
//                .collect(Collectors.toList());
//    }



}