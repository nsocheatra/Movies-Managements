package co.istad.system.movies;

import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getText(String label) {
        ViewUtil.print(label + " : ", false);
        return scanner.nextLine();
    }

    public static Integer getInteger(String label) {
        do {
            ViewUtil.print(label + "-> ", false);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                ViewUtil.print(e.getMessage(), true);
            }
        } while (true);
    }

    public static Year getYear(String label) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy");

        do {
            ViewUtil.print(label + " (yyyy): ", false);

            try {
                String input = scanner.nextLine();
                return Year.parse(input, format);
            } catch (DateTimeParseException e) {
                ViewUtil.print("❌ Invalid year format! Please use yyyy.\n", true);
            }
        } while (true);
    }


    public static LocalTime getTime(String label) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");

        do {
            ViewUtil.print(label + " (HH:mm): ", false);
            try {
                String input = scanner.nextLine();
                return LocalTime.parse(input, format);
            } catch (DateTimeParseException e) {
                ViewUtil.print(label + " ❌ Invalid date-time format! Please use HH:mm.\n", true);
            }
        } while (true);
    }
}