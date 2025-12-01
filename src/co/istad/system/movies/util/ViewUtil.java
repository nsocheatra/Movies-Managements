package co.istad.system.movies.util;

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
        Table table = new Table(1, BorderStyle.ASTERISKS);
        table.setColumnWidth(0, 50, 80);
        table.addCell(text);
        print(table.render(), true);
    }

    public static void printAppName() {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 77, 80);
        table.addCell("Movie Management System", cellStyle);
        print(table.render(), true);
    }

    public static void printAppMenu() {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 50, 80);
        table.addCell("Application Menu", cellStyle);
        table.addCell("(1)Display Movies     (2)Display Halls     (3)Add & Update Movies ", cellStyle);
        table.addCell("(4)Update Movies     (5)Delete Movies     (0)Exit", cellStyle);
        print(table.render(), true);
    }

    public static void printMovieList(List<Movie> movieList) {
        Table table = new Table(6, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        table.addCell("ID");
        table.addCell("Title");
        table.addCell("Release Date");
        table.addCell("Genre");
        table.addCell("Duration");
        table.addCell("Director");
        table.addCell("Cast");

        for (Movie mv : movieList){
            table.addCell(mv.getMvId());
            table.addCell(mv.getTitle());
            table.addCell(mv.getReleaseDate());
            table.addCell(mv.getGenre());
            table.addCell(mv.getDuration());
            table.addCell(mv.getDirector());
            table.addCell(mv.getMainCasts());
        }
        print(table.render(),true);


    }

    public static void printPressEnter() {

    }

    public static void printActor() {

    }

}