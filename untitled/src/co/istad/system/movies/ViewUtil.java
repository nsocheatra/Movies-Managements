package co.istad.system.movies;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

public class ViewUtil {

    public static void print(String text, boolean isNewLine) {
        if (isNewLine)
            System.out.println(text);
        else
            System.out.print(text);
    }

    public static void printMessage(String text) {
        Table table = new Table(1, BorderStyle.ASTERISKS);
        table.setColumnWidth(0,50,80);
        table.addCell(text);
        print(table.render(),true);
    }

    public  static void printAppName(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0,50,80);
        table.addCell("Movie Management System",cellStyle);
        print(table.render(),true);
    }

    public static void printAppMenu(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_HEAVY_BORDER_WIDE);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0,50,80);
        table.addCell("Application Menu",cellStyle);
        table.addCell("(1)Show Movies     (2)Search Movie     (3)Add New Movies     (4)Update Movies",cellStyle);
        table.addCell("(5)Delete Movies     (0)Exit",cellStyle);
        print(table.render(),true);
    }

    public static void printPressEnter(){

    }

    public static void printActor(){

    }

}
