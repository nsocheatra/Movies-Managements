package co.istad.system.movies.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.UUID;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getText(String label) {
        do {
            ViewUtil.print(label + " : ", false);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                ViewUtil.print(Color.RED+"Invalid Please Try Again\n"+Color.RESET, false);
                continue;
            }
            return input;
        }while (true);
    }
    public static String getTextCanSkip(String label){
        ViewUtil.print(label+" : ",false);
        return scanner.nextLine();
    }

    public static String  getId(String label) {
        do {
            ViewUtil.print(label + " : ", false);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                ViewUtil.print(Color.RED+"Invalid Please Try Again\n"+Color.RESET, false);
                continue;
            }
            return input;
        }while (true);
    }
    public static String getTitle(String label) {
        do {
            ViewUtil.print(label + " : ", false);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                ViewUtil.print(Color.RED+"Invalid Please Try Again\n"+Color.RESET, false);
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
    public static LocalDate getDateCanSkip(String label) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        do {
            ViewUtil.print(label + " (2022-05-05 or press Enter to skip): ", false);
            try {
                String input = scanner.nextLine();
                if (input == null || input.trim().equals("")) {
                    return null;
                }
                return LocalDate.parse(input, format);
            } catch (DateTimeParseException e) {
                ViewUtil.print(" Invalid date format! Please use yyyy-MM-dd (2022-05-05).\n", true);
            }
        } while (true);
    }
    public static LocalTime getTimeCanSkip(String label) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");

        do {
            ViewUtil.print(label + " (HH:mm or press Enter to skip): ", false);
            try {
                String input = scanner.nextLine();

                // Allow empty input
                if (input == null || input.trim().equals("")) {
                    return null;
                }

                return LocalTime.parse(input, format);
            } catch (DateTimeParseException e) {
                ViewUtil.print(label + " Invalid time format! Please use HH:mm.\n", true);
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