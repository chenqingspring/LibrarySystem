import customer.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-12
 * Time: ÏÂÎç8:48
 * To change this template use File | Settings | File Templates.
 */
public class MenuSelectTest {
    Customer customer = null;
    @Before
    public void setUp(){
        customer = new Customer("000-0000","111111");
    }

    @Test
    public void if_menu_1_selected(){
        int inputNum = 1;
        int index = inputNum - 1;
        customer.selectMenu(inputNum);
        assertEquals(true, customer.menulist.list.get(index).showStatement());
    }
    @Test
    public void if_menu_2_selected(){
        int inputNum = 2;
        int index = inputNum - 1;
        customer.selectMenu(inputNum);
        assertEquals(true, customer.menulist.list.get(index).showStatement());
    }
    @Test
    public void if_menu_3_selected(){
        int inputNum = 3;
        int index = inputNum - 1;
        customer.selectMenu(inputNum);
        assertEquals(true, customer.menulist.list.get(index).showStatement());
    }
    @Test
    public void if_menu_4_selected(){
        int inputNum = 4;
        int index = inputNum - 1;
        customer.selectMenu(inputNum);
        assertEquals(true, customer.menulist.list.get(index).showStatement());
    }
    @Test
    public void if_no_menu_selected(){
        int inputNum = 5;
        int index = inputNum - 1;
        customer.selectMenu(inputNum);
        assertEquals(false, customer.menulist.list.get(index).showStatement());    }
    @After
    public void tearDown(){
        customer = null;
    }
}
