/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    
    public static ColorOutput cop = new ColorOutput();
    public static Booklist bl = new Booklist();
    public static Menu m = new Menu();
    public static Customers customers = new Customers();
    
    
      public static void main(String args[]){

        System.out.println("#####################" + "\t");
        System.out.println("Welcome to the Bangalore"+"\n"
                           +" Public Library System!" + "\t");
        System.out.println("#####################" + "\t");

        m.showMenu();
        int menuInput = customers.select_menu(customers.readString());
        switch (menuInput) {
            case 1:
                customers.menu_select(customers.readString());
                break;
            case 2:
                after_input_book_number();
                break;
            case 3:
                m.showMenu();
                customers.select_menu(customers.readString());
                break;
            
        }

    }

    public static void after_input_book_number(){
        int bookNumInput = customers.select_book(customers.readString());
        switch (bookNumInput) {
            case 1:
                m.showMenu();
                customers.select_menu(customers.readString());
                break;
            case 2:
                m.showMenu();
                customers.select_menu(customers.readString());
                break;
            case 3:
                m.showMenu();
                customers.select_menu(customers.readString());
                break;
            case 4:
                m.showMenu();
                customers.select_menu(customers.readString());
                break;
            default:
                customers.select_book(customers.readString());

        }
    }

}
