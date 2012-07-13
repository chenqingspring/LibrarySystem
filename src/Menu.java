import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:32
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
    public static ColorOutput cop = new ColorOutput();
    public static Booklist bl = new Booklist();
    public static Customers customers = new Customers();

        public void show_all_books(){
        System.out.println("#####################" + "\t");
        Booklist.book1.showBooks();
        Booklist.book2.showBooks();
        Booklist.book3.showBooks();
        Booklist.book4.showBooks();
        System.out.println("0.Back to menu"+ "\t");
        System.out.println("#####################" + "\t");
        //customers.menu_select(customers.readString());
    }

    public void show_after_reserved_a_book(){
        cop.println("Thank You! Enjoy the book!" + "\t", Color.yellow, Color.black);

    }
    public void show_after_reserved_failed(){
        cop.println("Sorry we don't have that book yet!"+ "\t", Color.red , Color.black);
    }
    public void show_select_valid_option(){
        cop.println("Select a valid option!" + "\t", Color.red , Color.black);
        
        //System .exit(0);
    }

    public void show_check_library_number(){
        cop.println("Please talk to Librarian. Thank you!" + "\t", Color.yellow , Color.black);
        //showMenu();
        //customers.select_menu(customers.readString());
    }
    public void back_to_menu(){
        showMenu();
        customers.select_menu(customers.readString());
        
    }
    public  void input_the_book_number(){
        cop.println("Please input the number of book:" + "\t", Color.green , Color.black);

         //customers.select_book(customers.readString());
    }
    public void showMenu(){
        System.out.println("#####################" + "\t");
        System.out.println("1.View all the books" + "\t");
        System.out.println("2.Reserve a book" + "\t");
        System.out.println("3.Check Library Number" + "\t");
        System.out.println("#####################" + "\t");
        cop.println("please select a menu option£º" + "\t", Color.yellow , Color.black);

    }

    public void only_view_book() {
        cop.println("sorry,you can only view the books,or go to the menu!", Color.red , Color.black);

    }

    public void please_input_number() {
        cop.println("sorry,please input a number!", Color.red , Color.black);

    }

    public  int after_input_menu_number(int menuInput){
        switch (menuInput) {
            case 1:
                customers.menu_select(customers.readString());
                break;
            case 2:
                after_input_book_number(customers.select_book(customers.readString()));
                break;
            case 3:
                showMenu();
                customers.select_menu(customers.readString());
                break;
            default:
                showMenu();
                customers.select_menu(customers.readString());
                break;
        }
        return  menuInput;
    }
    public  int after_input_book_number(int bookNumInput){
        switch (bookNumInput) {
            case 1:
                showMenu();
                customers.select_menu(customers.readString());
                break;
            case 2:
                showMenu();
                customers.select_menu(customers.readString());
                break;
            case 3:
                showMenu();
                customers.select_menu(customers.readString());
                break;
            case 4:
                showMenu();
                customers.select_menu(customers.readString());
                break;
            default:
                customers.select_book(customers.readString());
        }
        return bookNumInput;
    }
}
