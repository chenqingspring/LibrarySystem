package login;

import customer.Customer;
import customer.Customerlist;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-19
 * Time: обнГ7:05
 * To change this template use File | Settings | File Templates.
 */
public class LoginManager {
    Customerlist customerlist = new Customerlist();

    public void userLogin(Customer customer) {

        for(int i=0;i < customerlist.usernames.length; i++){
            if (customer.getUsername().equals(customerlist.usernames[i])){
                if (customer.getPassword().equals(customerlist.passwords[i])){
                    customer.setLoggedIn(true);
                }
                else {
                    System.out.println("login failed! wrong password!");
                }
            }
            else if(i==customerlist.usernames.length){
                System.out.println("login failed! wrong username!");
            }
        }
    }
}
