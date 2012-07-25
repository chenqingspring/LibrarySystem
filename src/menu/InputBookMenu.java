package menu;

import customer.Customer;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-24
 * Time: ÏÂÎç6:37
 * To change this template use File | Settings | File Templates.
 */
public class InputBookMenu extends Menu {


    public InputBookMenu(int menuNum, String menuName, boolean isSelected) {
        super(menuNum, menuName, isSelected);
    }

    @Override
    public void show() {
        cop.println("Please input the number of book:" + "\t", Color.green , Color.black);
        setStatement(true);
    }
    public void afterShow(){
        Customer customer = new Customer();
        inputBookNumber(customer.selectBook(readString()));
        showMenu();
    }
}
                                   
