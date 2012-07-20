package menu;

import book.Booklist;
import customer.Customer;
import movie.MovieList;
import output.ColorOutput;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:32
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
    
    public String menuName = "";
    public int menuNum = 0;
    public boolean isSelected = false ;
    
     public Menu(int menuNum, String menuName, boolean isSelected){
         this.menuNum = menuNum;
         this.menuName = menuName;
         this.isSelected  = isSelected;
     }
    
    public void setStatement(boolean isSelected){
        
        this.isSelected = isSelected ;
        
    }
    public boolean showStatement(){
        return isSelected ;
    }
    
    private  ColorOutput cop = new ColorOutput();
    private static Customer customer = new Customer("000-0000","111111");
    private  MovieList movieList = new MovieList();
    private  Booklist booklist = new Booklist();

        public void show_all_books(){
        System.out.println("#####################" + "\t");
        booklist.book1.showBooks();
        booklist.book2.showBooks();
        booklist.book3.showBooks();
        booklist.book4.showBooks();
        System.out.println("0.Back to menu"+ "\t");
        System.out.println("#####################" + "\t");
        //customer.if_menu_selected(customer.readString());
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
        if(customer.getUsername().equals("1111-111")){
            cop.println(" you are the librarian!" + "\t", Color.yellow , Color.black);
        }
        else
            cop.println("Please talk to Librarian. Thank you!" + "\t", Color.yellow , Color.black);
    }
    public void back_to_menu(){
        showMenu();
        customer.select_menu(customer.readString());
        
    }
    public  void input_the_book_number(){
        cop.println("Please input the number of book:" + "\t", Color.green , Color.black);

         //customer.select_book(customer.readString());
    }
    public void showMenu(){
        System.out.println("#####################" + "\t");
        System.out.println("1.View all the books" + "\t");
        System.out.println("2.Reserve a book" + "\t");
        System.out.println("3.Check Library Number" + "\t");
        System.out.println("4.View all the movies");
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
                customer.if_menu_selected(customer.readString());
                break;
            case 2:
                after_input_book_number(customer.select_book(customer.readString()));
                break;
            case 3:
                showMenu();
                customer.select_menu(customer.readString());
                break;
            case 4:
                movieList.showMovies();
                break;
            default:
                showMenu();
                customer.select_menu(customer.readString());
                break;
        }
        return  menuInput;
    }
    public  int after_input_book_number(int bookNumInput){
        switch (bookNumInput) {
            case 1:
                showMenu();
                customer.select_menu(customer.readString());
                break;
            case 2:
                showMenu();
                customer.select_menu(customer.readString());
                break;
            case 3:
                showMenu();
                customer.select_menu(customer.readString());
                break;
            case 4:
                showMenu();
                customer.select_menu(customer.readString());
                break;
            default:
                customer.select_book(customer.readString());
        }
        return bookNumInput;
    }
}
