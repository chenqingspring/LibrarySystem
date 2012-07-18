/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: 下午11:50
 * To change this template use File | Settings | File Templates.
 */
public class Bibloitica {
    private String str = "Welcome to the Bangalore Public Library System!";
    public void welcome() {
        System.out.println(str);
    }
    public void setPrinter(FakePrintStream printer) {
         printer.println(str);  //依赖注入是这样用么？printer能否直接拿到系统输出？而不用设定str
    }
}
