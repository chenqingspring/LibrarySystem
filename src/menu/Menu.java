package menu;

import book.Booklist;
import customer.Customer;
import output.ColorOutput;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç4:32
 * To change this template use File | Settings | File Templates.
 */
public  class Menu {
    
    public String menuName = "";
    public int menuNum = 0;
    public boolean isSelected = false ;
    
     public Menu(int menuNum, String menuName, boolean isSelected){
         this.menuNum = menuNum;
         this.menuName = menuName;
         this.isSelected  = isSelected;
     }
    public Menu(){

    }
    
    public void setStatement(boolean isSelected){
        
        this.isSelected = isSelected ;
        
    }
    public boolean showStatement(){
        return isSelected ;
    }
    
    static ColorOutput cop = new ColorOutput();
    Booklist booklist = new Booklist();

    public  void show(){

    }
    public  void afterShow(){

    }
    public void show_after_reserved_a_book(){
        cop.println("Thank You! Enjoy the book!" + "\t", Color.yellow, Color.black);

    }
    public void show_after_reserved_failed(){
        cop.println("Sorry we don't have that book yet!"+ "\t", Color.red , Color.black);
    }
    public  void showMenu(){
        Customer customer = new Customer("","");
        System.out.println("#####################" + "\t");
        System.out.println("1.View all the books" + "\t");
        System.out.println("2.Reserve a book" + "\t");
        System.out.println("3.Check Library Number" + "\t");
        System.out.println("4.View all the movies");
        System.out.println("#####################" + "\t");
        cop.println("please select a menu option£º" + "\t", Color.yellow , Color.black);
        inputMenuNumber(customer.selectMenu(readString()));
    }
   public void pleaseInputNumber() {
        cop.println("sorry,please input a number!", Color.red , Color.black);

    }

   public  int inputMenuNumber(int menuInput){
        MenuList menulist = new MenuList();
        int index = menuInput - 1;
        menulist.init();
        menulist.list.get(index).afterShow();
        return  menuInput;
    }
    public  int inputBookNumber(int bookNumInput){
        int index = bookNumInput - 1;
        showResult(bookNumInput, index);
        return bookNumInput;
    }

    private void showResult(int bookNumInput, int index) {
        Customer customer = new Customer();
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
            str = readInputStream(str);
        } catch (IOException e) {

            num = inputNumberAgain();
        }
        num = Integer.parseInt(str);
        return num;
    }

    private int inputNumberAgain() {
        int num;
        pleaseInputNumber();
        num = readString();
        return  num;
    }

    private String readInputStream(String str) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        str = br.readLine();
        try {
        } catch (NumberFormatException n) {
            inputNumberAgain();
        }
        return str;
    }
}
