package co.istad.system.movies;

import co.istad.system.movies.service.MovieService;
import co.istad.system.movies.service.MovieServiceImpl;
import co.istad.system.movies.util.InputUtil;
import co.istad.system.movies.util.ViewUtil;

import java.util.List;

public class MovieApp {
    private final MovieService movieService;

    public MovieApp(){
        movieService = new MovieServiceImpl();
    }

    public static void main(String[] args) {
        MovieApp system = new MovieApp();
        system.start();
    }
    private void start(){
        ViewUtil.printAppName();
        do{
            ViewUtil.printAppMenu();
            int menuOption = InputUtil.getInteger("Enter menu option");
            switch (menuOption){
                case 1 -> displayAllMovie();
                case 2 -> ViewUtil.print("Search", true);
            }
        }while (true);
    }
    public void displayAllMovie(){
        ViewUtil.printMessage("Display All Movies");

    }
}