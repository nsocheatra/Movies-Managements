package co.istad.system.movies;

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

                case 2 -> ViewUtil.print("Search", true);
            }
        }while (true);
    }
}
