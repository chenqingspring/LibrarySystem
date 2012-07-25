package output;

import menu.MenuList;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: 下午11:50
 * To change this template use File | Settings | File Templates.
 */
public class Bibloitica implements BibloiticaInterface{
    private String welcome = "Welcome to the Bangalore"+"\n"
            +" Public Library System!" + "\t";
    private MenuList menuList = new MenuList();

    public boolean sayWelcome() {
        System.out.println(welcome);
        return true;
    }
    public void setPrinterForWelcome(FakePrintStream printer) {
         printer.println(welcome);  //依赖注入是这样用么？printer能否直接拿到系统输出？而不用设定str
    }
    public void setPrinterForMenu(FakePrintStream printer,int index) {
        int num = index + 1;
        menuList.init();
        printer.println(num +"."+ menuList.list.get(index).menuName);
    }
}
