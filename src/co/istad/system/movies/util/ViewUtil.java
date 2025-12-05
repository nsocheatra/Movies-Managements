package co.istad.system.movies.util;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;
import co.istad.system.movies.model.ShowBooking;
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
    public static void printMessageNoTable(String text){
        System.out.println(text);
    }

    public static void printAppName() {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 65, 100);
        table.addCell(Color.BLUE + "Movie Management System", cellStyle);
        print(table.render(), true);
    }

    public static void printAppMenu(String title,String textLineOne, String textLineTwo) {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 50, 80);
        table.addCell(Color.BLUE + title,cellStyle);
      table.addCell(Color.GREEN + textLineOne, cellStyle);
        table.addCell(Color.GREEN + textLineTwo+Color.RED+"(0)Exit", cellStyle);
        print(table.render(), true);
    }
    public static void printOptionMenu(String title, String textLineOne){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 50, 80);
        table.addCell(Color.BLUE + title,cellStyle);
        table.addCell(Color.GREEN + textLineOne+Color.RED+"(0)Exit", cellStyle);
        print(table.render(), true);
    }

    public static void printMovieList(List<Movie> movieList) {
        int pageSize = 10;
        int currentPage = 0;
        int totalPages = (int) Math.ceil((double) movieList.size() / pageSize);

        while (true) {
            int startIndex = currentPage * pageSize;
            int endIndex = Math.min(startIndex + pageSize, movieList.size());

            Table table = new Table(7, BorderStyle.UNICODE_ROUND_BOX_WIDE);
            CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
            table.addCell(Color.BLUE + "ID (UUID)", cellStyle);
            table.addCell(Color.BLUE + "Title", cellStyle);
            table.addCell(Color.BLUE + "Release Date", cellStyle);
            table.addCell(Color.BLUE + "Genre", cellStyle);
            table.addCell(Color.BLUE + "Duration", cellStyle);
            table.addCell(Color.BLUE + "Director", cellStyle);
            table.addCell(Color.BLUE + "Main Cast", cellStyle);

            for (int i = startIndex; i < endIndex; i++) {
                Movie mv = movieList.get(i);
                table.addCell(Color.GREEN + mv.getMvId());
                table.addCell(Color.GREEN + mv.getTitle());
                table.addCell(Color.GREEN + mv.getReleaseDate(), cellStyle);
                table.addCell(Color.GREEN + mv.getGenre());
                table.addCell(Color.GREEN + mv.getDuration(), cellStyle);
                table.addCell(Color.GREEN + mv.getDirector());
                table.addCell(Color.GREEN + mv.getMainCast());
            }
            print(table.render(), true);
            ViewUtil.printMessageNoTable(Color.YELLOW+ "\nPage "+(currentPage+1) +" of " + totalPages);
            ViewUtil.printMessageNoTable("Showing " +startIndex +"-"+(endIndex -1) + " of " + movieList.size()+ "movies");

            String choice = InputUtil.getText(Color.YELLOW+"[B]ack   |  [N]ext   |  [P]revious"+Color.RESET).trim().toLowerCase();
             if (choice.equals("n") && currentPage < totalPages - 1)
            {
                currentPage++;
            } else if (choice.equals("p") && currentPage > 0) {
                currentPage--;
             }    else if (choice.equals("b")) {
                 break;
            } else {
                ViewUtil.printMessageNoTable(Color.RED+"Invalid option or no more pages in that direction!"+Color.RESET);
            }
        }
    }

    public static void printBookList(List<Movie> movieList) {
        int pageSize = 10;
        int currentPage = 0;
        int totalPages = (int) Math.ceil((double) movieList.size() / pageSize);

        while (true) {
            int startIndex = currentPage * pageSize;
            int endIndex = Math.min(startIndex + pageSize, movieList.size());

            Table table = new Table(7, BorderStyle.UNICODE_ROUND_BOX_WIDE);
            CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
            table.addCell(Color.BLUE + "ID (UUID)", cellStyle);
            table.addCell(Color.BLUE + "Title", cellStyle);
            table.addCell(Color.BLUE + "Release Date", cellStyle);
            table.addCell(Color.BLUE + "Genre", cellStyle);
            table.addCell(Color.BLUE + "Duration", cellStyle);
            table.addCell(Color.BLUE + "Director", cellStyle);
            table.addCell(Color.BLUE + "Main Cast", cellStyle);

            for (int i = startIndex; i < endIndex; i++) {
                Movie mv = movieList.get(i);
                table.addCell(Color.GREEN + mv.getMvId());
                table.addCell(Color.GREEN + mv.getTitle());
                table.addCell(Color.GREEN + mv.getReleaseDate(), cellStyle);
                table.addCell(Color.GREEN + mv.getGenre());
                table.addCell(Color.GREEN + mv.getDuration(), cellStyle);
                table.addCell(Color.GREEN + mv.getDirector());
                table.addCell(Color.GREEN + mv.getMainCast());
            }
            print(table.render(), true);
            ViewUtil.printMessageNoTable(Color.YELLOW+ "\nPage "+(currentPage+1) +" of " + totalPages);
            ViewUtil.printMessageNoTable("Showing " +startIndex +"-"+(endIndex -1) + " of " + movieList.size()+ "movies");

            String choice = InputUtil.getText(Color.YELLOW+"[B]ooking   |  [N]ext   |  [P]revious  |  [Q]uit"+Color.RESET).trim().toLowerCase();
            if (choice.equals("b")){
                break;
            }
            else if (choice.equals("n") && currentPage < totalPages - 1)
            {
                currentPage++;
            } else if (choice.equals("p") && currentPage > 0) {
                currentPage--;
            }    else if (choice.equals("q")) {
                return;
            } else {
                ViewUtil.printMessageNoTable(Color.RED+"Invalid option or no more pages in that direction!"+Color.RESET);
            }
        }
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

    public static void printChecking(List<ShowBooking> showBookingList){
        Table table = new Table(5,BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.addCell(Color.BLUE+ "ID Movie");
        table.addCell(Color.BLUE+"Title Movie");
        table.addCell(Color.BLUE+"ID Hall");
        table.addCell(Color.BLUE+"Name Hall");
        table.addCell(Color.BLUE+ "Status");

        for(ShowBooking booked : showBookingList){
            if (booked.getStatus()) {
                table.addCell(Color.GREEN + booked.getMovie().getMvId());
                table.addCell(Color.GREEN + booked.getMovie().getTitle());
                table.addCell(Color.GREEN + booked.getHall().gethId());
                table.addCell(Color.GREEN + booked.getHall().gethName());
                table.addCell(Color.GREEN + "Booked");
                break;
            }
        }

        print(table.render(),true);
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