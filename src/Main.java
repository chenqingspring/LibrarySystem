import customer.Customer;
import login.LoginManager;
import menu.Menu;
import output.Bibloitica;
import output.ColorOutput;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ����4:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static Customer customer = new Customer();
    public static Menu menu = new Menu();
    public static Bibloitica bibloitica = new Bibloitica();
    public static LoginManager loginManager = new LoginManager();
    public static ColorOutput  cop = new ColorOutput();

    public static void main(String args[]) throws IOException {
        welcome();
        userLogin();
        start();
    }

    private static void start() throws IOException {
        while(true){
            if (customer.isLoggedIn())
                loginSucceced();
            else
                loginFailed();
         }
    }
    private static void loginFailed() throws IOException {
        System.out.println("you input a wrong username or password! insert them again!");
        userLogin();
    }

    private static void loginSucceced() {
        menu.showMenu();
        while (true){
        menu.inputMenuNumber(customer.selectMenu(menu.readString()));
        }
    }

    private static void welcome() {
        cop.println("#####################" + "\t", Color.white,Color.black);
        bibloitica.sayWelcome();
        System.out.println("#####################" + "\t");
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
