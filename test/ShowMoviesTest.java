import movie.Movie;
import movie.MovieList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import output.Bibloitica;
import output.FakePrintStream;

import java.io.FileNotFoundException;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-19
 * Time: ÏÂÎç3:13
 * To change this template use File | Settings | File Templates.
 */
public class ShowMoviesTest {
    MovieList movielist = null;
    FakePrintStream printer = null;
    @Before
    public void setUp() throws Exception {
        movielist = new MovieList(); //gaven
        printer = new FakePrintStream("a");
    }
    @Test
    public void show_movie_1_when_start_movie_menu() throws FileNotFoundException {
        movielist.movie1.setPrinterForMovie1(printer);
        assertEquals("1.The Dark Knight Rises----Christopher Nolan----8.0",printer.getMsg());
    }
    @Test
    public void show_movie_5_when_start_movie_menu() throws FileNotFoundException {
        movielist.movie5.setPrinterForMovie1(printer);
        assertEquals("5.Ice Age: Continental Drift----Steve Martino----6.9",printer.getMsg());
    }
    @Test
    public void show_movie_10_when_start_movie_menu() throws FileNotFoundException {
        movielist.movie10.setPrinterForMovie1(printer);
        assertEquals("10.Magic Mike----Steven Soderbergh----6.5",printer.getMsg());
    }
    @Test
    public void show_movie_15_when_start_movie_menu() throws FileNotFoundException {
        movielist.movie15.setPrinterForMovie1(printer);
        assertEquals("15.The Watch----Akiva Schaffer----N/A",printer.getMsg());
    }
    @After
    public void tearDown() throws Exception {
        movielist = null;
        printer = null;
    }
}
