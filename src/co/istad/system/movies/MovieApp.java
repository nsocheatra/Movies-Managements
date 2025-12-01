package co.istad.system.movies;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.service.HallService;
import co.istad.system.movies.service.HallServiceImpl;
import co.istad.system.movies.service.MovieService;
import co.istad.system.movies.service.MovieServiceImpl;
import co.istad.system.movies.util.InputUtil;
import co.istad.system.movies.util.ViewUtil;

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
            ViewUtil.printAppMenu();
            int menuOption = InputUtil.getInteger("Enter menu option");
            switch (menuOption) {
                case 1 -> displayAllMovie();
                case 2 -> ViewUtil.print("Search", true);
                case 4 -> addNew();
                case 3 -> BookingHall();
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
                ViewUtil.printMessage(Color.YELLOW+"You has been quite the menu");
                break;
            }
            Hall hall = hallService.getHall(hId);
            if (hall == null) {
                ViewUtil.printMessage(Color.RED + "Invalid ID, try again or enter x to quit");
                continue;
            }
            if (hallService.bookHall(hall)) {
                ViewUtil.printMessage(Color.GREEN + "Booked successfully!");
                ViewUtil.printMessage(Color.CYAN+"Thanks For Booked Our Team");
                break;
            } else {
                ViewUtil.printMessage(Color.YELLOW + "Room already booked! Try again or enter x to quit");
            }

        }
    }


    private void displayAllMovie() {
        ViewUtil.printMessage(Color.BLUE + "Display All Movies".toUpperCase());
        ViewUtil.printMovieList(movieService.findAll().reversed());
    }

    private void addNew() {
        ViewUtil.printMessage("Add New Movie");
        String title = InputUtil.getText("Enter Title");
        String releaseDate = InputUtil.getText("Enter Release Date");
        String genre = InputUtil.getText("Enter Genre");
        String duration = InputUtil.getText("Enter Duration");
        String director = InputUtil.getText("Enter Director");
        String mainCast = InputUtil.getText("Enter Caster");
    }

    private class Color {
        public static final String RESET = "\u001B[0m";
        public static final String BLACK = "\u001B[30m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";
    }

}