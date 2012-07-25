import org.jmock.Mock;
import org.jmock.MockObjectTestCase;
import output.Bibloitica;
import output.BibloiticaInterface;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-25
 * Time: ����9:08
 * To change this template use File | Settings | File Templates.
 */
public class MockSayWelcomeTest extends MockObjectTestCase {
    public void test() {
        //����һ��Mock����
        Mock  mockBibloitica = new Mock(BibloiticaInterface.class);
        //����Ҫִ�еĲ���
        mockBibloitica.expects(once()).method("sayWelcome").will(returnValue(true));
        //����Mock�����ȡһ��BibloiticaInterface����
        BibloiticaInterface bibloiticaInterface = (BibloiticaInterface) mockBibloitica.proxy();
        //���Ե��ý��
        assertTrue(bibloiticaInterface.sayWelcome());
    }
}
