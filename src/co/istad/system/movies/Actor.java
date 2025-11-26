package co.istad.system.movies;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(){

    };

    public Actor(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
