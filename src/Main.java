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
    public static Menu m = new Menu(0,"a",false);
    public static Customers customers = new Customers();
    
    
      public static void main(String args[]){

        System.out.println("#####################" + "\t");
        System.out.println("Welcome to the Bangalore"+"\n"
                           +" Public Library System!" + "\t");
        System.out.println("#####################" + "\t");

        while (true){
          m.showMenu();
          m.after_input_menu_number(customers.select_menu(customers.readString()));
          m.after_input_book_number(customers.select_book(customers.readString()));
        }

    }
}
