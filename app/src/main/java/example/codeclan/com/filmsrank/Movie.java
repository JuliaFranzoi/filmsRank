package example.codeclan.com.filmsrank;

/**
 * Created by user on 16/01/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int currentRanking;


    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.currentRanking = 0;
    }


    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getCurrentRanking() {
        return this.currentRanking;
    }
}
