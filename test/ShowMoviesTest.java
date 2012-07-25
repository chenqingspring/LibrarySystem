import movie.MovieList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
        movielist = new MovieList();
        movielist.init();//gaven
        printer = new FakePrintStream("a");
    }
    @Test
    public void show_movie_1_when_start_movie_menu() throws FileNotFoundException {
        int movieNum = 1;
        int index = movieNum -1;
        movielist.list.get(index).setPrinterForMovie1(printer);
        assertEquals("1.The Dark Knight Rises----Christopher Nolan----8.0",printer.getMsg());
    }
    @Test
    public void show_movie_5_when_start_movie_menu() throws FileNotFoundException {
        int movieNum = 5;
        int index = movieNum - 1;
        movielist.list.get(index).setPrinterForMovie1(printer);
        assertEquals("5.Ice Age: Continental Drift----Steve Martino----6.9",printer.getMsg());
    }
    @Test
    public void show_movie_10_when_start_movie_menu() throws FileNotFoundException {
        int movieNum = 10;
        int index = movieNum - 1;
        movielist.list.get(index).setPrinterForMovie1(printer);
        assertEquals("10.Magic Mike----Steven Soderbergh----6.5",printer.getMsg());
    }
    @Test
    public void show_movie_15_when_start_movie_menu() throws FileNotFoundException {
        int movieNum = 15;
        int index = movieNum -1;
        movielist.list.get(index).setPrinterForMovie1(printer);
        assertEquals("15.The Watch----Akiva Schaffer----N/A",printer.getMsg());
    }
    @After
    public void tearDown() throws Exception {
        movielist = null;
        printer = null;
    }
}
