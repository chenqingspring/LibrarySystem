package menu;

import menu.Menu;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-18
 * Time: обнГ9:44
 * To change this template use File | Settings | File Templates.
 */
public class MenuList {
    public  ArrayList<Menu> list = new ArrayList<Menu>();

    public  void init(){
        list.add(new ViewBookMenu(1,"View all the books",false));
        list.add(new InputBookMenu(2,"Reserve a book",false ));
        list.add(new CheckMenu(3,"Check Library Number",false ));
        list.add(new ViewMovieMenu(4,"View all movies",false));
        list.add(new SelectVaild(0,"N/A",false));
    }

}
