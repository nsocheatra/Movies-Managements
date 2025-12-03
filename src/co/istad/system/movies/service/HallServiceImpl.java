package co.istad.system.movies.service;

import co.istad.system.movies.database.HallDatabase;
import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;

import java.util.List;

public class HallServiceImpl implements HallService {
    private final HallDatabase hallDatabase;

    public HallServiceImpl() {
        hallDatabase = new HallDatabase();
    }

    @Override
    public List<Hall> findAll() {
        return hallDatabase.getDataset();
    }

    public void listHall() {
        System.out.println("===== Room List =====");
        hallDatabase.getDataset().forEach(r -> {
            System.out.println(r.gethId() + " - " + r.gethName() +
                    " | Booked: " + (r.isBooked() ? "YES" : "NO"));
        });
    }

    @Override
    public Hall getHall(String id) {
        return hallDatabase.getDataset()
                .stream()
                .filter(r -> r.gethId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean bookHall(Hall hall) {

        if (!hall.isBooked()) {
            hall.setBooked(true);
            return true;
        }
        return false;

    }



}
