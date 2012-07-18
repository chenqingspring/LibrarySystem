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
    public void if_book_1_isSelected() {
        Customers customers = new Customers();
        customers.select_book(1);
        assertEquals(true, customers.booklist.book1.showBookStatememt());
    }

    @Test
    public void if_book_2_isSelected() {
        Customers customers = new Customers();
        customers.select_book(2);
        assertEquals(true, customers.booklist.book2.showBookStatememt());
    }

    @Test
    public void if_book_3_isSelected() {
        Customers customers = new Customers();
        Booklist booklist = new Booklist();
        customers.select_book(3);
        assertEquals(true, customers.booklist.book3.showBookStatememt());
    }

    @Test
    public void if_book_4_isSelected() {
        Customers customers = new Customers();
        Booklist booklist = new Booklist();
        customers.select_book(4);
        assertEquals(true,customers.booklist.book4.showBookStatememt());
    }

    @Test
    public void if_no_book_isSelected() {
        Customers customers = new Customers();
        Booklist booklist = new Booklist();
        customers.select_book(5);
        assertEquals("Sorry we don't have that book yet.", customers.noBookSelected());
    }
}
