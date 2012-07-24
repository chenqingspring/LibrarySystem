package customer;

import book.Booklist;
import menu.Menu;
import menu.MenuList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:33
 * To change this template use File | Settings | File Templates.
 */
public class Customer {

    private String username;
    private String password;
    private boolean isLoggedIn = false;

    public Customer(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
    }

    public   MenuList menulist = new MenuList();
    public   Booklist booklist = new Booklist();

    public int selectMenu(int num) {
        int index = num - 1;
        menulist.init();
        menulist.list.get(index).show();
        return num;
  }
    public int selectBook(int num) {
        booklist.init();
        int index = num - 1;
        int actualBookSize = booklist.list.size() - 1;
        select(index, actualBookSize);
        return  num;
    }

    private void select(int index, int actualBookSize) {
        if(index>=0 && index <actualBookSize )
            selectBookInList(index);
        else
            selectBookOutOfList(actualBookSize);
    }

    private void selectBookOutOfList(int actualBookSize) {
        menulist.init();
        menulist.list.get(1).show_after_reserved_failed();
        booklist.list.get(actualBookSize).setBookStatement(false);
    }

    private void selectBookInList(int index) {
        menulist.init();
        menulist.list.get(1).show_after_reserved_a_book();
        booklist.list.get(index).setBookStatement(true);
    }
}
