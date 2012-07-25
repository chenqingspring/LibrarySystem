import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import output.Bibloitica;
import output.BibloiticaInterface;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-25
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
public class MockSayWelcomeTest extends MockObjectTestCase {
    public void test() {
        //构造一个Mock对象
        Mock  mockBibloitica = new Mock(BibloiticaInterface.class);
        //设置要执行的操作
        mockBibloitica.expects(once()).method("sayWelcome").will(returnValue(true));
        //根据Mock对象获取一个BibloiticaInterface对象
        BibloiticaInterface bibloiticaInterface = (BibloiticaInterface) mockBibloitica.proxy();
        //断言调用结果
        assertTrue(bibloiticaInterface.sayWelcome());
    }
}
