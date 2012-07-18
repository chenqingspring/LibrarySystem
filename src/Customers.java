import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: 下午4:33
 * To change this template use File | Settings | File Templates.
 */
public class Customers {

    public  MenuList menulist = new MenuList();
    public  Menu menu = new Menu(0,"a",false);
    public  Booklist booklist = new Booklist();
    public int select_menu(int num) {

             if (num>=1 && num<=3) {
                switch (num) {

                    case 1:
                        menulist.menu1.show_all_books();
                        menulist.menu1.setStatement(true);
                        break;
                    case 2:
                        menulist.menu2.input_the_book_number();
                        menulist.menu2.setStatement(true);
                        break;
                    case 3:
                        menulist.menu3.show_check_library_number();
                        menulist.menu3.setStatement(true);
                        break;
                }
                return  num;
            } else {
                 menulist.menu1.show_select_valid_option();
                 noMenuSelected();//this.select_menu(readString());
                return num;
            }

          //To change body of created methods use File | Settings | File Templates.
    }



    public void menu_select(int num) {
        if (num == 0 ) {
            menu.back_to_menu();

        } else {
            menu.only_view_book();
            menu_select(readString());
            //this.select_menu(readString());
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
                menu.please_input_number();

                num = readString();
            }
        } catch (IOException e) {
            menu.please_input_number();
            num = readString();
        }
        num = Integer.parseInt(str);
        return num;
    }


    public int select_book(int num) {
        if (num>=1 && num<=4) {
            switch (num) {
                case 1:
                    menu.show_after_reserved_a_book();
                    booklist.book1.setBookStatement(true);
                    break;
                case 2:
                    menu.show_after_reserved_a_book();
                    booklist.book2.setBookStatement(true);
                    break;
                case 3:
                    menu.show_after_reserved_a_book();
                    booklist.book3.setBookStatement(true);
                    break;
                case 4:
                    menu.show_after_reserved_a_book();
                    booklist.book4.setBookStatement(true);
                    break;
            }
            return  num;
        } else {
            menu.show_after_reserved_failed();
            noBookSelected();//this.select_book(readString());
            return  num;
        }
    }

    public String noBookSelected() {
        return "Sorry we don't have that book yet.";  //To change body of created methods use File | Settings | File Templates.
    }
    public String noMenuSelected() {
        return "Select a valid option!!";  //To change body of created methods use File | Settings | File Templates.
    }
}
