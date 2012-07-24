package menu;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-24
 * Time: ÏÂÎç6:58
 * To change this template use File | Settings | File Templates.
 */
public class CheckMenu extends Menu{
    public CheckMenu(int menuNum, String menuName, boolean isSelected) {
        super(menuNum, menuName, isSelected);
    }

    @Override
    public void show() {
        if(customer.getUsername().equals("1111-111")){
            cop.println(" you are the librarian!" + "\t", Color.yellow , Color.black);
        }
        else{
            cop.println("Please talk to Librarian. Thank you!" + "\t", Color.yellow , Color.black);
        }
        setStatement(true);//To change body of implemented methods use File | Settings | File Templates.
    }
    public void afterShow(){
        showMenu();
        customer.selectMenu(readString());
    }
}
