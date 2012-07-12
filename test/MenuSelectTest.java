import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-12
 * Time: обнГ8:48
 * To change this template use File | Settings | File Templates.
 */
public class MenuSelectTest {

    @Test
    public void test_menu_select(){

        Customers customers = new Customers();
        assertEquals(true,customers.select_menu(1));
        assertEquals(true,customers.select_menu(2));
        assertEquals(true,customers.select_menu(3));
        assertEquals(false,customers.select_menu(4));
        assertEquals(false,customers.select_menu(0));
    }
}
