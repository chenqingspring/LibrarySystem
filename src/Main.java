import customer.Customer;
import login.LoginManager;
import menu.MenuList;
import output.ColorOutput;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static Customer customer = new Customer("000-0000","000000");
    public static MenuList  menulist = new MenuList();
    public static LoginManager loginManager = new LoginManager();
    public static ColorOutput  cop = new ColorOutput();
    public static void main(String args[]) throws IOException {

        cop.println("#####################" + "\t", Color.white,Color.black);
        System.out.println("Welcome to the Bangalore"+"\n"
                           +" Public Library System!" + "\t");
        System.out.println("#####################" + "\t");

        menulist.init();
          userLogin();
          while(true){
           if (customer.isLoggedIn()){
           while (true){
           menulist.list.get(1).showMenu();
           menulist.list.get(1).afterInputMenuNumber(customer.selectMenu(menulist.list.get(1).readString()));
             //m.afterInputBookNumber(customer.selectBook(customer.readString()));
           }
         }
        else {
               System.out.println("you input a wrong username or password! insert them again!");
        userLogin();
         }
       }
    }

    private static void userLogin() throws IOException {
        System.out.println("input your username:");
        String userNameInput = userInput();
        customer.setUsername(userNameInput);
        System.out.println("input your Password:");
        String userPasswordInput = userInput();
        customer.setPassword(userPasswordInput);
        loginManager.userLogin(customer);
    }

    private static String userInput() throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        return reader.readLine();
    }
}
