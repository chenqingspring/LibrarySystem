package menu;

import book.Booklist;
import customer.Customer;
import movie.MovieList;
import output.ColorOutput;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: 下午4:32
 * To change this template use File | Settings | File Templates.
 */
public abstract class Menu {
    
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
    
    ColorOutput cop = new ColorOutput();
    Customer customer = new Customer("000-0000","111111");
    Booklist booklist = new Booklist();

    public abstract void show();
    public abstract void afterShow();


    public void show_after_reserved_a_book(){
        cop.println("Thank You! Enjoy the book!" + "\t", Color.yellow, Color.black);

    }
    public void show_after_reserved_failed(){
        cop.println("Sorry we don't have that book yet!"+ "\t", Color.red , Color.black);
    }
    public  void showMenu(){
        System.out.println("#####################" + "\t");
        System.out.println("1.View all the books" + "\t");
        System.out.println("2.Reserve a book" + "\t");
        System.out.println("3.Check Library Number" + "\t");
        System.out.println("4.View all the movies");
        System.out.println("#####################" + "\t");
        cop.println("please select a menu option：" + "\t", Color.yellow , Color.black);

    }
   public void please_input_number() {
        cop.println("sorry,please input a number!", Color.red , Color.black);

    }

    public  int afterInputMenuNumber(int menuInput){
        int index = menuInput - 1;
        customer.menulist.init();
        customer.menulist.list.get(index).afterShow();
        return  menuInput;
    }
    public  int afterInputBookNumber(int bookNumInput){
        int index = bookNumInput - 1;
        showResult(bookNumInput, index);
        return bookNumInput;
    }

    private void showResult(int bookNumInput, int index) {
        booklist.init();
        int actualBookNumber = booklist.list.size()-1;
        if(bookNumInput>0&&bookNumInput<actualBookNumber){
            booklist.list.get(index).toSelect();
            customer.selectBook(readString());
        }else {
            customer.selectBook(readString());
        }
    }


    public  int readString() {
        String str = null;
        int num = 0;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            // 声明一个isr的缓冲区
            BufferedReader br = new BufferedReader(isr);
            str = br.readLine();
            try {
                int totalMoney = Integer.parseInt(str);
            } catch (NumberFormatException n) {
                please_input_number();
                num = readString();
            }
        } catch (IOException e) {
            please_input_number();
            num = readString();
        }
        num = Integer.parseInt(str);
        return num;
    }
}
