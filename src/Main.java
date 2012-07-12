/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: обнГ4:02
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    
    public static ColorOutput cop = new ColorOutput();
    public static Booklist bl = new Booklist();
    public static Menu m = new Menu();
    
    
      public static void main(String args[]){
        System.out.println("Welcome to the Bangalore Public Library System!" + "\t");
        m.showMenu();
        System.out.println(Booklist.book1.id + "\t");
        System.out.println(Booklist.book2.id + "\t");
    }
}
