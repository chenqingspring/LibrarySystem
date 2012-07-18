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


    @Test
    public void if_menu_1_selected(){

        Customers customers = new Customers();
        customers.select_menu(1);
        assertEquals(true, customers.menulist.menu1.showStatement());
    }
    public void if_menu_2_selected(){

        Customers customers = new Customers();
        customers.select_menu(2);
        assertEquals(true ,customers.menulist.menu2.showStatement());
    }
    public void if_menu_3_selected(){

        Customers customers = new Customers();
        customers.select_menu(3);
        assertEquals(true ,customers.menulist.menu3.showStatement());

    }
    public void if_no_menu_selected(){
        Customers customers = new Customers();
        customers.select_menu(0);
        assertEquals("Select a valid option!!" ,customers.noMenuSelected());
    }
}
