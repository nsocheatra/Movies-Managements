package co.istad.system.movies.service;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;
import java.util.List;

public interface HallService {
    List<Hall> findAll();
     Hall getHall(String id);
     boolean bookHall(Hall hall);
}