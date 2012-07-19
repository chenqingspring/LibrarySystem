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
        customer.select_menu(1);
        assertEquals(true, customer.menulist.menu1.showStatement());
    }
    @Test
    public void if_menu_2_selected(){
        customer.select_menu(2);
        assertEquals(true , customer.menulist.menu2.showStatement());
    }
    @Test
    public void if_menu_3_selected(){
        customer.select_menu(3);
        assertEquals(true , customer.menulist.menu3.showStatement());

    }
    @Test
    public void if_no_menu_selected(){
        customer.select_menu(0);
        assertEquals("Select a valid option!!" , customer.noMenuSelected());
    }
    @After
    public void tearDown(){
        customer = null;
    }
}
