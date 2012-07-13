import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-12
 * Time: ÏÂÎç11:22
 * To change this template use File | Settings | File Templates.
 */
public class BookSelectTest {
    @Test
    public void test_book_select(){
        Menu m = new Menu();
        Customers customers = new Customers();
        assertEquals(1,customers.select_book(1));
        assertEquals(2,customers.select_book(2));
        assertEquals(3,customers.select_book(3));
        assertEquals(4,customers.select_book(4));
        assertEquals(0,customers.select_book(0));
        assertEquals(5,customers.select_book(5));

    }
}
