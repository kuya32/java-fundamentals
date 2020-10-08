package inheritance;

import java.util.ArrayList;

public class Theater {
    public static String name;
    public static ArrayList<String> movieList = new ArrayList<>();

    public Theater(String name) {
        Theater.name = name;
    };

    public String getName() {
        return name;
    }

    public void addMovie(String movie) {
        movieList.add(movie);
    }

    public void removeMovie(String movie) {
        movieList.remove(movie);
    }

    public String toString() {
        return "Theater: " + this.getName() + "\nMovie List: " + movieList;
    }

    public static ArrayList<String> getMovieList() {
        return movieList;
    }
}
