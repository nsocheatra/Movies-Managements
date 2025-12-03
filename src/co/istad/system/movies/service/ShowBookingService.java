package co.istad.system.movies.service;

import co.istad.system.movies.model.ShowBooking;

import java.util.ArrayList;
import java.util.List;

public class ShowBookingService {
    private static List<ShowBooking> showBookingDb = new ArrayList<>();

    public static List<ShowBooking> findAllBooking() {
        return showBookingDb;
    }
}
