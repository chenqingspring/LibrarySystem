import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-17
 * Time: обнГ11:52
 * To change this template use File | Settings | File Templates.
 */
public class FakePrintStream extends PrintStream{
    private String msg;
    public FakePrintStream(String s) throws FileNotFoundException {
        super(s);
    } 
    public void println(String msg){
        this.msg =  msg;        
    }
    public String getMsg(){
        return msg;
    }
}
