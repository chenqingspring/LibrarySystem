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
 * Date: 12-7-18
 * Time: ÏÂÎç11:31
 * To change this template use File | Settings | File Templates.
 */
public class ListOfOptionsTest {
    Bibloitica bibloitica = null;
    FakePrintStream printer = null;
    @Before
    public void setUp() throws Exception {
        bibloitica = new Bibloitica(); //gaven
        printer = new FakePrintStream("a");
    }
     @Test
    public void should_show_a_list_of_options_1_when_start_up() throws FileNotFoundException {
        bibloitica.setPrinterForMenu1(printer);
        assertEquals("1.View all the books",printer.getMsg());
    }
    @Test
    public void should_show_a_list_of_options_2_when_start_up() throws FileNotFoundException {
        bibloitica.setPrinterForMenu2(printer);
        assertEquals("2.Reserve a book",printer.getMsg());
    }
    @Test
    public void should_show_a_list_of_options_3_when_start_up() throws FileNotFoundException {
        bibloitica.setPrinterForMenu3(printer);
        assertEquals("3.Check Library Number",printer.getMsg());
    }
    @After
    public void tearDown() throws Exception {
        bibloitica = null;
        printer = null;
    }
}
