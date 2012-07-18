import org.junit.Test;

import java.io.FileNotFoundException;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: 下午11:44
 * To change this template use File | Settings | File Templates.
 */
public class SayWelcomeTest {
    @Test
    public void should_say_welcome_when_start_up() throws FileNotFoundException {
      Bibloitica bibloitica = new Bibloitica(); //gaven
      FakePrintStream printer = new FakePrintStream("a");
      bibloitica.setPrinter(printer);
      //bibloitica.welcome(); //如果printer不能拿到系统的输出结果，不用执行此句也可完成测试。
      assertEquals("Welcome to the Bangalore Public Library System!",printer.getMsg());
      //printer继承了PrintStream，添加具有返回值的getMsg（）方法，目的是用于测试。
    }
}
