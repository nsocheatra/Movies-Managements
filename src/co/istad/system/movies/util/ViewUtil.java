package co.istad.system.movies.util;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class ViewUtil {

    public static void print(String text, boolean isNewLine) {
        if (isNewLine)
            System.out.println(text);
        else
            System.out.print(text);
    }

    public static void printMessage(String text) {
        Table table = new Table(1, BorderStyle.DOTS);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 50, 80);
        table.addCell(Color.YELLOW + text, cellStyle);
        print(table.render(), true);
    }

    public static void printAppName() {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 65, 100);
        table.addCell(Color.BLUE + "Movie Management System", cellStyle);
        print(table.render(), true);
    }

    public static void printAppMenu() {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 50, 80);
        table.addCell(Color.BLUE + "Application Menu", cellStyle);
        table.addCell(Color.GREEN + "(1)Display Movies     (2)Add Movies     (3)Booking Movies & Hall ", cellStyle);
        table.addCell(Color.GREEN + "(4)Delete Movies"+Color.RED+"     (0)Exit", cellStyle);
        print(table.render(), true);
    }

    public static void printMovieList(List<Movie> movieList) {
        Table table = new Table(7, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        table.addCell(Color.BLUE + "ID");
        table.addCell(Color.BLUE + "Title");
        table.addCell(Color.BLUE + "Release Date");
        table.addCell(Color.BLUE + "Genre");
        table.addCell(Color.BLUE + "Duration");
        table.addCell(Color.BLUE + "Director");
        table.addCell(Color.BLUE + "Cast");

        for (Movie mv : movieList) {
            table.addCell(Color.GREEN + mv.getMvId());
            table.addCell(Color.GREEN + mv.getTitle());
            table.addCell(Color.GREEN + mv.getReleaseDate());
            table.addCell(Color.GREEN + mv.getGenre());
            table.addCell(Color.GREEN + mv.getDuration());
            table.addCell(Color.GREEN + mv.getDirector());
            table.addCell(Color.GREEN + mv.getMainCasts());
        }
        print(table.render(), true);


    }
    public static void printHall(List<Hall> hallList){
        Table table = new Table(3,BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.addCell(Color.BLUE+ "ID");
        table.addCell(Color.BLUE+"Hall Name");
        table.addCell(Color.BLUE+ "Status");
        for(Hall hall : hallList){
            String status = hall.isBooked() ? "YES" : "NO";
            table.addCell(Color.GREEN+ hall.gethId());
            table.addCell(Color.GREEN+ hall.gethName());
            table.addCell(Color.GREEN + status);
        }
        print(table.render(),true);
    }

    public static void printPressEnter() {

    }

    public static void printActor() {

    }

    public class Color {
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