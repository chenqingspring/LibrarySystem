/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:32
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
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
    }

    public void show_after_reserved_a_book(){
        System.out.println("Thank You! Enjoy the book" + "\t");
    }
    public void show_after_reserved_failed(){
        System.out.println("Sorry we don't have that book yet" + "\t");

    }
    public void show_select_valid_option(){
        System.out.println("Select a valid option!!" + "\t");
        System .exit(0);
    }

    public void show_check_library_number(){
        System.out.println("Please talk to Librarian. Thank you!"+"\t");
    }
    public void back_to_menu(){
        showMenu();
        customers.select_menu(customers.readString());
    }
    public void showMenu(){
        System.out.println("1.View all the books" + "\t");
        System.out.println("2.Reserve a book" + "\t");
        System.out.println("3.Check Library Number" + "\t");
    }
}
