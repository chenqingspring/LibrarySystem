import book.Booklist;
import customer.Customer;
import menu.Menu;
import output.ColorOutput;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static Menu m = new Menu(0,"a",false);
    public static Customer customer = new Customer("000-0000","111111");
    
    
      public static void main(String args[]){

        System.out.println("#####################" + "\t");
        System.out.println("Welcome to the Bangalore"+"\n"
                           +" Public Library System!" + "\t");
        System.out.println("#####################" + "\t");

        while (true){
          m.showMenu();
          m.after_input_menu_number(customer.select_menu(customer.readString()));
          m.after_input_book_number(customer.select_book(customer.readString()));
        }

    }
}
