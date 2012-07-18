import org.junit.Test;

import java.io.FileNotFoundException;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: ����11:44
 * To change this template use File | Settings | File Templates.
 */
public class SayWelcomeTest {
    @Test
    public void should_say_welcome_when_start_up() throws FileNotFoundException {
      Bibloitica bibloitica = new Bibloitica(); //gaven
      FakePrintStream printer = new FakePrintStream("a");
      bibloitica.setPrinter(printer);
      //bibloitica.welcome(); //���printer�����õ�ϵͳ��������������ִ�д˾�Ҳ����ɲ��ԡ�
      assertEquals("Welcome to the Bangalore Public Library System!",printer.getMsg());
      //printer�̳���PrintStream����Ӿ��з���ֵ��getMsg����������Ŀ�������ڲ��ԡ�
    }
}
