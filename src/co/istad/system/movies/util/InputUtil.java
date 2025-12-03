package co.istad.system.movies.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getText(String label) {
        do {
            ViewUtil.print(label + " : ", false);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                ViewUtil.print(Color.RED+"Invalid Please Try Again\n", false);
                continue;
            }
            return input;
        }while (true);
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

    public static LocalDate getDate(String label) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        do {
            ViewUtil.print(label + " (2022-05-05): ", false);
            try {
                String input = scanner.nextLine();
                return LocalDate.parse(input, format);
            } catch (DateTimeParseException e) {
                ViewUtil.print(" Invalid date format! Please use yyyy-MM-dd (2022-05-05).\n", true);
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
                ViewUtil.print(label + "  Invalid date-time format! Please use HH:mm.\n", true);
            }
        } while (true);
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