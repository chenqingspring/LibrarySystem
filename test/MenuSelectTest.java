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
        assertEquals(1,customers.select_menu(1));
        assertEquals(2,customers.select_menu(2));
        assertEquals(3,customers.select_menu(3));
        assertEquals(4,customers.select_menu(4));
        assertEquals(0,customers.select_menu(0));
    }
}
