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
        int inputNum = 1;
        int index = inputNum - 1;
        customer.selectBook(inputNum);
        assertEquals(true, customer.booklist.list.get(index).getBookStatememt());
    }

    @Test
    public void if_book_2_isSelected() {
        int inputNum = 2;
        int index = inputNum - 1;
        customer.selectBook(inputNum);
        assertEquals(true, customer.booklist.list.get(index).getBookStatememt());
    }

    @Test
    public void if_book_3_isSelected() {
        int inputNum = 3;
        int index = inputNum - 1;
        customer.selectBook(inputNum);
        assertEquals(true, customer.booklist.list.get(index).getBookStatememt());
    }

    @Test
    public void if_book_4_isSelected() {

        int inputNum = 4;
        int index = inputNum - 1;
        customer.selectBook(inputNum);
        assertEquals(true, customer.booklist.list.get(index).getBookStatememt());
    }

    @Test
    public void if_no_book_isSelected() {
        int inputNum = 5;
        int index = inputNum - 1;
        customer.selectBook(inputNum);
        assertEquals(false, customer.booklist.list.get(index).getBookStatememt());
    }

    @After
    public void tearDown(){
        customer = null;
    }
}
