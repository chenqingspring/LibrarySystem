/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: обнГ4:32
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
    public static Booklist bl = new Booklist();

    public void view_all_books(){

        Booklist.book1.showBooks();
        Booklist.book2.showBooks();
        Booklist.book3.showBooks();
        Booklist.book4.showBooks();
        
           }

    public void showMenu(){
        System.out.println("1.View all the books" + "\t");
        System.out.println("2.Reserve a book" + "\t");
        System.out.println("3.Check Library Number" + "\t");
    }
}
