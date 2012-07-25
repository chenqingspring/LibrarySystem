package menu;

import book.Booklist;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-24
 * Time: обнГ6:30
 * To change this template use File | Settings | File Templates.
 */
public class ViewBookMenu extends Menu{
    public ViewBookMenu(int menuNum, String menuName, boolean isSelected) {
        super(menuNum, menuName, isSelected);
    }
    public void show(){
        Booklist booklist = new Booklist();
        booklist.init();
        System.out.println("#####################" + "\t");
        for(int i = 0;i<booklist.list.size()-1;i++){
            booklist.list.get(i).showBooks();
        }
        System.out.println("#####################" + "\t");
        setStatement(true);
    }
    public void afterShow(){
        showMenu();
    }
}
