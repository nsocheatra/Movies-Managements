package co.istad.system.movies;

public class MainCast {
    private String name;

    public MainCast() {
    }

    public MainCast(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
