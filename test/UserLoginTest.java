import customer.Customer;
import login.LoginManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-19
 * Time: ÏÂÎç6:55
 * To change this template use File | Settings | File Templates.
 */
public class UserLoginTest {
    @Test
    public void if_common_user_login_succeced(){
        Customer customer = new Customer("111-1112","112"); //²»ÇåÎú
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(true, customer.isLoggedIn());

        
    }
    @Test 
    public void if_librarian_login_succeced(){
        Customer customer = new Customer("111-1111","111");
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(true, customer.isLoggedIn());
    }
    @Test
    public void if_user_login_failed_in_condition_username_is_right(){
        Customer customer = new Customer("111-1111","118");
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(false, customer.isLoggedIn());
    }
    @Test
    public void if_user_login_failed_in_condition_username_is_wrong(){
        Customer customer = new Customer("111-1123","118");
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(false, customer.isLoggedIn());
    }
}
