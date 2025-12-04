package co.istad.system.movies;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;
import co.istad.system.movies.service.HallService;
import co.istad.system.movies.service.HallServiceImpl;
import co.istad.system.movies.service.MovieService;
import co.istad.system.movies.service.MovieServiceImpl;
import co.istad.system.movies.util.InputUtil;
import co.istad.system.movies.util.ViewUtil;
import co.istad.system.movies.util.ViewUtil.Color;

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
            ViewUtil.printAppMenu("Application Menu", "(1)Display Movies     (2)Add & Update Movies     (3)Booking Halls & Movies  ",
                    "(4)Check Booking   (5)Delete Movie   ");
            int menuOption = InputUtil.getInteger("Enter menu option");
            switch (menuOption) {
                case 1 -> displayAllMovie();
                case 2 -> addUpdate();
                case 3 -> BookingHall();
                case 4 -> displayBooking();
                case 5 -> deleteMenu();
                case 0 -> System.exit(0);
            }
        } while (true);
    }

    private void BookingHall() {

        ViewUtil.printHall(hallService.findAll());
        ViewUtil.printMessage(Color.BLUE + "Choose the hall you want to book.");
        ViewUtil.printMessage(Color.BLUE + "(Enter x to quit)");
        while (true) {
            String hId = InputUtil.getText("Enter hall ID");
            if (hId.equalsIgnoreCase("x")) {
                ViewUtil.printMessage(Color.BLUE + "Exit to main menu.");
                ViewUtil.printMessage(Color.YELLOW + "You has been quite the menu");
                break;
            }
            Hall hall = hallService.getHall(hId);
            if (hall == null) {
                ViewUtil.printMessage(Color.RED + "Invalid ID, try again or enter x to quit");
                continue;
            }
            if (hallService.bookHall(hall)) {
                ViewUtil.printMessage(Color.GREEN + "Booked successfully!");
                ViewUtil.printMessage(Color.CYAN + "Thanks For Booked Our Team");
                break;
            } else {
                ViewUtil.printMessage(Color.YELLOW + " Hall already booked! Try again or enter x to quit");
            }

        }

    }


    private void displayAllMovie() {
        ViewUtil.printMessage(Color.BLUE + "Display All Movies".toUpperCase());
        ViewUtil.printMovieList(movieService.findAll().reversed());

    }

    private void displayBooking() {
        ViewUtil.printHall(hallService.findAll());

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
        String id = InputUtil.getText("Enter ID to Update");
        String title = InputUtil.getText("Enter Title Movie");
        LocalDate releaseDate = InputUtil.getDate("Enter Release Date");
        String genre = InputUtil.getText("Enter Genre Movie");
        LocalTime duration = InputUtil.getTime("Enter Duration");
        String director = InputUtil.getText("Enter Name Director");
        String mainCast = InputUtil.getText("Enter Name  Cast");
        Movie newMovie = new Movie(title, releaseDate, genre, duration, director, mainCast);
        movieService.updateById(id, newMovie);
        ViewUtil.printMessage("Updated movies successfully!");
    }

    //    private void updateByTitle(){
//        ViewUtil.printMessage("Update Movie by Title");
//        String title = InputUtil.getText("Enter Title Movie");
//        String titleNew = InputUtil.getText("Enter New Title Movie");
//        String releaseDate = InputUtil.getText("Enter Release Date");
//        String genre = InputUtil.getText("Enter Genre Movie");
//        String duration = InputUtil.getText("Enter Duration");
//        String director = InputUtil.getText("Enter Name Director");
//        String mainCast = InputUtil.getText("Enter Name  Cast");
//        Movie newMovie = new Movie(title,releaseDate,genre,duration,director,mainCast);
//        movieService.updateByTitle(title,newMovie);
//    }
    public void deleteMenu() {
        do {
            ViewUtil.printOptionMenu("Delete Movies", "(1)Delete By ID    (2)Delete By Title   (3)Check List  (4)Back Menu   ");
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
        String id = InputUtil.getText("Enter ID to delete");
        movieService.deleteById(id);
        ViewUtil.printMessage("Movie deleted successfully!");
    }

    public void deleteByTitle() {
        ViewUtil.printMessage("Delete Movie by ID");
        String title = InputUtil.getText("Enter ID to delete");
        movieService.deleteByTitle(title);
        ViewUtil.printMessage("Movie deleted successfully!");
    }


}