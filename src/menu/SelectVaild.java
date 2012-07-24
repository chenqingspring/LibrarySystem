package menu;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-24
 * Time: обнГ7:06
 * To change this template use File | Settings | File Templates.
 */
public class SelectVaild extends Menu{

    public SelectVaild(int menuNum, String menuName, boolean isSelected) {
        super(menuNum, menuName, isSelected);
    }

    @Override
    public void show() {
        cop.println("Select a valid option!" + "\t", Color.red , Color.black);
        setStatement(false);
    }

    @Override
    public void afterShow(){
        showMenu();
        customer.selectMenu(readString());
    }
}
