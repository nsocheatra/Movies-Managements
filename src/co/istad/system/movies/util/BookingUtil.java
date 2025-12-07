package co.istad.system.movies.util;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;
import co.istad.system.movies.service.HallService;
import co.istad.system.movies.service.MovieService;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class BookingUtil {
    public static void handleBooking(HallService hallService, MovieService movieService) {
        ViewUtil.printMessage(Color.BLUE + "MOVIE SELECTION");
        ViewUtil.printBookList(movieService.findAll().reversed());
        ViewUtil.printMessage(Color.RED + "Enter x to back Menu");
        Movie selectedMovie =null;
        while (selectedMovie == null) {
            String movieId = InputUtil.getText(Color.YELLOW+"Enter movie ID");
            if (movieId.equalsIgnoreCase("x")) {
                ViewUtil.printMessageNoTable(Color.RED + "Exit to main menu.");
                ViewUtil.printMessageNoTable(Color.RED + "\nYou have quit the menu"+Color.RESET);
                return;
            }
            selectedMovie = movieService.getMovie(movieId);
            if (selectedMovie == null) {
                ViewUtil.printMessage(Color.RED + "Invalid movie ID, try again or enter x to quit");
            }
        }

        ViewUtil.printMessageNoTable(Color.PURPLE + "Movie selected: " + selectedMovie.getTitle());

        ViewUtil.printMessage(Color.BLUE + "HALL SELECTION");
        ViewUtil.printHall(hallService.findAll());
        ViewUtil.printMessageNoTable(Color.BLUE + "Choose the hall you want to book.");
        ViewUtil.printMessageNoTable(Color.RED + "(Enter x to quit)");

        while (true) {
            String hId = InputUtil.getText(Color.YELLOW+"Enter hall ID");
            if (hId.equalsIgnoreCase("x")) {
                ViewUtil.printMessageNoTable(Color.RED + "Exit to main menu.");

                ViewUtil.printMessageNoTable(Color.RED + "\nYou have quit the menu"+Color.RESET);
                break;
            }

            Hall hall = hallService.getHall(hId);
            if (hall == null) {
                ViewUtil.printMessageNoTable(Color.RED + "\nInvalid hall ID, try again or enter exit to quit"+Color.RESET);
                continue;
            }

            if (hallService.bookHall(hall, selectedMovie)) {
                ViewUtil.printMessageNoTable(Color.GREEN + "\nBooking successful!");
                ViewUtil.printMessageNoTable(Color.CYAN + "Movie: " + selectedMovie.getTitle());
                ViewUtil.printMessageNoTable(Color.CYAN + "Hall: " + hall.gethName());
                ViewUtil.printMessageNoTable(Color.CYAN + "Thanks Have A Nice Time!!"+Color.RESET);
                break;
            } else {
                ViewUtil.printMessageNoTable(Color.RED + "Hall already booked! Try again or enter x to quit"+Color.RESET);
            }
        }
    }

    public static void CheckBooking(HallService hallService) {

        List<Hall> halls = hallService.findAll();
        boolean hasBooking = false;

        // create table: 4 columns, fixed width 15 for simplicity
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE);

        table.addCell(Color.BLUE+"ID Movie");
        table.addCell(Color.BLUE+"Title Movie");
        table.addCell(Color.BLUE+"ID Hall");
        table.addCell(Color.BLUE+"Name Hall");
        table.addCell(Color.BLUE+"Status");

        for (Hall hall : halls) {
            if (hall.getBookedMovie() != null) {
                hasBooking = true;

                table.addCell(Color.GREEN +hall.getBookedMovie().getMvId());
                table.addCell(Color.GREEN +hall.getBookedMovie().getTitle());
                table.addCell(Color.GREEN +hall.gethId());
                table.addCell(Color.GREEN +hall.gethName());
                table.addCell(Color.GREEN +"Booked");
            }
        }

        if (!hasBooking) {
            ViewUtil.printMessageNoTable(Color.RED + "No halls are booked yet!" + Color.RESET);
        } else {
            try {
                System.out.println(table.render());
            } catch (Exception e) {
                ViewUtil.printMessageNoTable(Color.RED + "Failed to render table!" + Color.RESET);            }
        }
    }







    public class Color {
        public static final String RESET = "\u001B[0m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
    }
}
