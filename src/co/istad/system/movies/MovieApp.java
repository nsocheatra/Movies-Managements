package co.istad.system.movies;

import co.istad.system.movies.model.Movie;
import co.istad.system.movies.service.*;
import co.istad.system.movies.util.BookingUtil;
import co.istad.system.movies.util.InputUtil;
import co.istad.system.movies.util.ViewUtil;

import java.time.LocalDate;
import java.time.LocalTime;


public class MovieApp {
    private final MovieService movieService;
    private final HallService hallService;


    public MovieApp() {
        movieService = new MovieServiceImpl();
        hallService = new HallServiceImpl();
    }

    public static void main(String[] args) {
        MovieApp system = new MovieApp();
        system.start();
    }

    private void start() {
        ViewUtil.printAppName();
        do {
            ViewUtil.printAppMenu("Application Menu", "(1)Display Movies     (2)Add & Update Movies     (3)Booking Movie  ",
                    "(4)Check Booking   (5)Delete Movie   ");
            int menuOption = InputUtil.getInteger("Enter menu option");
            switch (menuOption) {
                case 1 -> displayAllMovie();
                case 2 -> addUpdate();
                case 3 -> viewBookings();
                case 4 -> ShowBooking();
                case 5 -> deleteMenu();
                case 0 -> System.exit(0);
            }
        } while (true);
    }


    private void viewBookings() {

        BookingUtil.handleBooking(hallService, movieService);


    }


    private void displayAllMovie() {
        ViewUtil.printMessage("Display All Movies".toUpperCase());
        ViewUtil.printMovieList(movieService.findAll().reversed());
    }

    private void ShowBooking() {
        ViewUtil.printMessage("Display All Booked".toUpperCase());
        BookingUtil.CheckBooking(hallService);


    }


    private void addUpdate() {
        do {
            ViewUtil.printOptionMenu("Add & Update Movie Menu", "(1)Add New Movie    (2)Update By ID  (3)Check List     (4)Back Menu   ");
            int addUpdateMenu = InputUtil.getInteger("Enter menu option");
            switch (addUpdateMenu) {
                case 1 -> addNew();
                case 2 -> updateById();
                case 3 -> displayAllMovie();
                case 4 -> start();
                case 0 -> System.exit(0);
            }
        } while (true);
    }

    private void addNew() {
        ViewUtil.printMessage("Add New Movie");
        String title = InputUtil.getText("Enter Title");
        LocalDate releaseDate = InputUtil.getDate("Enter Release Date");
        String genre = InputUtil.getText("Enter Genre");
        LocalTime duration = InputUtil.getTime("Enter Duration");
        String director = InputUtil.getText("Enter Director");
        String mainCast = InputUtil.getText("Enter Caster");
        Movie newMovie = new Movie(title, releaseDate, genre, duration, director, mainCast);
        movieService.addNew(newMovie);
        ViewUtil.printMessage("Add movies successfully!");

    }

    private void updateById() {
        ViewUtil.printMessage("Update Movie by ID");
        ViewUtil.printMovieList(movieService.findAll().reversed());
        while (true) {
            String id = InputUtil.getText(InputUtil.Color.RED + "(X | x) for cancel update" + InputUtil.Color.CYAN + "\nEnter Id to update" + InputUtil.Color.RESET);
            if (id.equalsIgnoreCase("x")) {
                ViewUtil.printMessage(InputUtil.Color.BLUE + "Update cancelled.");
                return;
            }
            Movie oldMovies = movieService.findAll()
                    .stream()
                    .filter(movie -> movie != null && movie.getMvId().trim().equals(id))
                    .findFirst()
                    .orElse(null);
            if (oldMovies == null) {
                System.out.println("Movie with ID " + id + " not found!");
                continue;
            }
            String title = InputUtil.getTextCanSkip("Enter Title Movie");
            LocalDate releaseDate = InputUtil.getDateCanSkip("Enter Release Date");
            String genre = InputUtil.getTextCanSkip("Enter Genre Movie");
            LocalTime duration = InputUtil.getTimeCanSkip("Enter Duration");
            String director = InputUtil.getTextCanSkip("Enter Name Director");
            String mainCast = InputUtil.getTextCanSkip("Enter Name  Cast");
            if (title == null || title.isEmpty()) title = oldMovies.getTitle();
            if (releaseDate == null) releaseDate = oldMovies.getReleaseDate();
            if (genre == null || genre.isEmpty()) genre = oldMovies.getGenre();
            if (duration == null) duration = oldMovies.getDuration();
            if (director == null || director.isEmpty()) director = oldMovies.getDirector();
            if (mainCast == null || mainCast.isEmpty()) mainCast = oldMovies.getMainCast();
            Movie newMovie = new Movie(title, releaseDate, genre, duration, director, mainCast);
            movieService.updateById(id, newMovie);
            break;
        }
    }

    public void deleteMenu() {
        do {
            ViewUtil.printOptionMenu("Add & Update Movie Menu", "(1)Delete By ID    (2)Delete By Title   (3)Check List  (4)Back Menu   ");
            int addUpdateMenu = InputUtil.getInteger("Enter menu option");
            switch (addUpdateMenu) {
                case 1 -> deleteById();
                case 2 -> deleteByTitle();
                case 3 -> displayAllMovie();
                case 4 -> start();
                case 0 -> System.exit(0);
            }
        } while (true);
    }


    public void deleteById() {
        ViewUtil.printMessage("Delete Movie by ID");
        ViewUtil.printMovieList(movieService.findAll().reversed());

        while (true) {
            String id = InputUtil.getId(InputUtil.Color.RED + "(X | x) for cancel delete" + InputUtil.Color.CYAN + "\nEnter ID to Delete" + InputUtil.Color.RESET);
            if (id.equalsIgnoreCase("x")) {
                ViewUtil.printMessage(InputUtil.Color.BLUE + "Delete by ID has cancelled.");
                return;
            }
            Movie oldMovies = movieService.findAll()
                    .stream()
                    .filter(movie -> movie != null && movie.getMvId().trim().trim().equals(id))
                    .findFirst()
                    .orElse(null);
            if (oldMovies == null) {
                System.out.println("Movie with Title  not found!");
                System.out.println("Please Again!!!");
                continue;
            }
            String confirm = InputUtil.getText(
                    InputUtil.Color.YELLOW + "Are you sure you want to delete this movie \"" + oldMovies.getMvId()
                            + "\" ? (Y/N): " + InputUtil.Color.RESET
            );
            if (!confirm.equalsIgnoreCase("y")) {
                ViewUtil.printMessage(InputUtil.Color.BLUE + "Delete cancelled");
            }

            movieService.deleteByTitle(id);
            ViewUtil.printMessage(InputUtil.Color.PURPLE + "Movie deleted successfully!");
            break;

        }


    }

    public void deleteByTitle() {
        ViewUtil.printMessage("Delete Movie by Title");
        ViewUtil.printMovieList(movieService.findAll().reversed());

        while (true) {
            String title = InputUtil.getTitle(
                    InputUtil.Color.RED + "(X | x) for cancel delete"
                            + InputUtil.Color.CYAN + "\nEnter Title to Delete "
                            + InputUtil.Color.RESET
            ).trim();

            if (title.equalsIgnoreCase("x")) {
                ViewUtil.printMessage(InputUtil.Color.BLUE + "Delete by Title has cancelled.");
                return;
            }

            Movie oldMovie = movieService.findAll()
                    .stream()
                    .filter(movie -> movie != null &&
                            movie.getTitle().trim().equalsIgnoreCase(title))
                    .findFirst()
                    .orElse(null);

            if (oldMovie == null) {
                System.out.println("Movie with this title not found!");
                System.out.println("Please try again!");
                continue;
            }

            String confirm = InputUtil.getText(
                    InputUtil.Color.YELLOW + "Are you sure you want to delete movie \""
                            + oldMovie.getTitle()
                            + "\" ? (Y/N): "
                            + InputUtil.Color.RESET
            );

            if (!confirm.equalsIgnoreCase("y")) {
                ViewUtil.printMessage(InputUtil.Color.BLUE + "Delete cancelled.");
                return;
            }

            movieService.deleteByTitle(oldMovie.getTitle());
            ViewUtil.printMessage(InputUtil.Color.PURPLE + "Movie deleted successfully!");
            break;

        }
    }


}
