/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: ����11:50
 * To change this template use File | Settings | File Templates.
 */
public class Bibloitica {
    private String str = "Welcome to the Bangalore Public Library System!";
    public void welcome() {
        System.out.println(str);
    }
    public void setPrinter(FakePrintStream printer) {
         printer.println(str);  //����ע����������ô��printer�ܷ�ֱ���õ�ϵͳ������������趨str
    }
}
