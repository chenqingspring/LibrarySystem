package output;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: ����11:50
 * To change this template use File | Settings | File Templates.
 */
public class Bibloitica {
    private String welcome = "Welcome to the Bangalore"+"\n"
            +" Public Library System!" + "\t";
    private String menu1 = "1.View all the books";
    private String menu2 = "2.Reserve a book" ;
    private String menu3 = "3.Check Library Number";

    public void sayWelcome() {
        System.out.println(welcome);
    }
    public void showMenu1() {
        System.out.println(menu1);
    }
    public void showMenu2() {
        System.out.println(menu2);
    }
    public void showMenu3() {
        System.out.println(menu3);
    }
    public void setPrinterForWelcome(FakePrintStream printer) {
         printer.println(welcome);  //����ע����������ô��printer�ܷ�ֱ���õ�ϵͳ������������趨str
    }
    public void setPrinterForMenu1(FakePrintStream printer) {
        printer.println(menu1);
    }
    public void setPrinterForMenu2(FakePrintStream printer) {
        printer.println(menu2);
    }
    public void setPrinterForMenu3(FakePrintStream printer) {
        printer.println(menu3);
    }
}
