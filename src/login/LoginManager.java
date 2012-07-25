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
                findUsernameSucceced(customer, i);
            }
            else if(i == customerlist.usernames.length){
                System.out.println("login failed! wrong username!");
            }
        }
    }

    private void findUsernameSucceced(Customer customer, int i) {
        if (customer.getPassword().equals(customerlist.passwords[i])){
            findPasswordSucceced(customer);
        }
        else {
            System.out.println("login failed! wrong password!");
        }
    }

    private void findPasswordSucceced(Customer customer) {
        customer.setLoggedIn(true);
        System.out.println("login succeced!");
    }
}
