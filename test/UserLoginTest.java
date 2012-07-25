import customer.Customer;
import customer.Customerlist;
import login.LoginManager;
import org.junit.Before;
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
    Customerlist  customerlist = null;
    @Before
    public void setUp(){
        customerlist = new Customerlist();
    }
    @Test
    public void if_librarian_login_succeced(){
        int librarianNum = 1;
        int index = librarianNum - 1;
        String username = customerlist.usernames[index];
        String password = customerlist.passwords[index];
        Customer customer = new Customer(username,password);
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(true, customer.isLoggedIn());
    }
    @Test
    public void if_common_user_2_login_succeced(){
        int commonUserNum = 2;
        int index = commonUserNum - 1;
        String username = customerlist.usernames[index];
        String password = customerlist.passwords[index];
        Customer customer = new Customer(username,password);
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(true, customer.isLoggedIn());
    }
    @Test
    public void if_common_user_3_login_succeced(){
        int commonUserNum = 3;
        int index = commonUserNum - 1;
        String username = customerlist.usernames[index];
        String password = customerlist.passwords[index];
        Customer customer = new Customer(username,password);
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(true, customer.isLoggedIn());
    }

    @Test
    public void if_user_login_failed_in_condition_username_is_right(){
        String rightUserName = customerlist.usernames[3];
        String wrongPassWord = "118";
        Customer customer = new Customer(rightUserName,wrongPassWord);
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(false, customer.isLoggedIn());
    }
    @Test
    public void if_user_login_failed_in_condition_username_is_wrong(){
        String wrongUserName = "111-1124";
        String rightPassWord = customerlist.passwords[4];
        Customer customer = new Customer(wrongUserName,rightPassWord);
        LoginManager loginManager = new LoginManager();
        loginManager.userLogin(customer);
        assertEquals(false, customer.isLoggedIn());
    }
}
