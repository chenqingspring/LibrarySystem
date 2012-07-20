import customer.Customer;
import org.junit.After;
import org.junit.Before;
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
    Customer customer = null;
    @Before
    public void setUp(){
        customer = new Customer("000-0000","111111");
    }

    @Test
    public void if_book_1_isSelected() {
        customer.select_book(1);
        assertEquals(true, customer.booklist.book1.getBookStatememt());
    }

    @Test
    public void if_book_2_isSelected() {
        customer.select_book(2);
        assertEquals(true, customer.booklist.book2.getBookStatememt());
    }

    @Test
    public void if_book_3_isSelected() {
        customer.select_book(3);
        assertEquals(true, customer.booklist.book3.getBookStatememt());
    }

    @Test
    public void if_book_4_isSelected() {
        customer.select_book(4);
        assertEquals(true, customer.booklist.book4.getBookStatememt());
    }

    @Test
    public void if_no_book_isSelected() {
        customer.select_book(5);
        assertEquals(false, customer.booklist.otherBooks.getBookStatememt());
    }

    @After
    public void tearDown(){
        customer = null;
    }
}
