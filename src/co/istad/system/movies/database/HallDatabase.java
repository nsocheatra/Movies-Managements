package co.istad.system.movies.database;

import co.istad.system.movies.model.Hall;
import co.istad.system.movies.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HallDatabase {
    private List<Hall> dataset;

    public HallDatabase(){
        Hall ponluePkay = new Hall(UUID.randomUUID().toString(),"Ponlue Pkay");
        Hall sobinMeas = new Hall(UUID.randomUUID().toString(),"Sobin Meas");
        Hall pkaKolap = new Hall(UUID.randomUUID().toString(),"Pka Kolap");
        Hall pkaySomnang = new Hall(UUID.randomUUID().toString(),"Pkay Somnang");
        Hall pkaChan = new Hall(UUID.randomUUID().toString(),"Pka Chan");

        dataset = new ArrayList<>();
        dataset.add(ponluePkay);
        dataset.add(sobinMeas);
        dataset.add(pkaKolap);
        dataset.add(pkaySomnang);
        dataset.add(pkaChan);

    }
    public List<Hall> getDataset() {
        return dataset;
    }


}
