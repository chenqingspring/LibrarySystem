/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: 下午11:50
 * To change this template use File | Settings | File Templates.
 */
public class Bibloitica {
    private String welcome = "Welcome to the Bangalore Public Library System!"; 
    private String menu1 = "1.View all the books";
    private String menu2 = "2.Reserve a book" ;
    private String menu3 = "3.Check Library Number";

    public void welcome() {
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
         printer.println(welcome);  //依赖注入是这样用么？printer能否直接拿到系统输出？而不用设定str
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
