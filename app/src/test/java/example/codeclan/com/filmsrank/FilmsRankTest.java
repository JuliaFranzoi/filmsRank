package example.codeclan.com.filmsrank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 16/01/2017.
 */

public class FilmsRankTest {
    Movie movie;


    @Before
    public void before() {
        movie = new Movie("Her", "Drama");
    }

    @Test
    public void canGetTitleTest() {
        assertEquals("Her", movie.getTitle());

    }

    @Test
    public void canGetGenreTest(){
        assertEquals("Drama", movie.getGenre());
    }
}
