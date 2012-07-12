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

    public static Menu m = new Menu();

    public boolean select_menu(int num) {

             if (num>=1 && num<=3) {
                switch (num) {

                  case 1:
                        m.show_all_books();
                      
                        break;
                    case 2:

                        break;

                    case 3:
                        m.show_check_library_number();
                        break;
                }
                return  true;
            } else {
                m.show_select_valid_option();
                //this.select_menu(readString());
                return false;
            }
          //To change body of created methods use File | Settings | File Templates.
    }



    public  int readString() {
        System.out.println("please select a menu option：");
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
                System.out.println("sorry,please input a number!");
                num = readString();
            }
        } catch (IOException e) {
            System.out.println("sorry,please input number!");
            num = readString();
        }
        num = Integer.parseInt(str);
        return num;
    }

    public boolean select_book(int num) {
        if (num>=0 && num<=4) {
            switch (num) {
                case 0:
                    m.back_to_menu();
                    break;
                case 1:
                    m.show_after_reserved_a_book();
                    break;
                case 2:
                    m.show_after_reserved_a_book();
                    break;
                case 3:
                    m.show_after_reserved_a_book();
                    break;
                case 4:
                    m.show_after_reserved_a_book();
                    break;
            }
            return  true;
        } else {
            m.show_after_reserved_failed();
            //this.select_menu(readString());
            return false;
        }

    }
}
