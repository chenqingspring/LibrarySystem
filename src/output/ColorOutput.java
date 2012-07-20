package output;

import enigma.console.TextAttributes;
import enigma.core.Enigma;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 2012-2-15
 * Time: 18:20:44
 * To change this template use File | Settings | File Templates.
 */
public class ColorOutput {


    public  void println( String str,Color fontColor,Color backgroudColor)
    {
        TextAttributes attrs = new TextAttributes(fontColor, backgroudColor);
        s_console.setTextAttributes(attrs);
        System.out.println(str);
        setBackFrontAndBackgroundColor();
    }

    public  void print( String str,Color fontColor,Color backgroudColor)
    {
        TextAttributes attrs = new TextAttributes(fontColor, backgroudColor);
        s_console.setTextAttributes(attrs);
        System.out.print(str);
        setBackFrontAndBackgroundColor();
    }
    private static void setBackFrontAndBackgroundColor(){
        TextAttributes attrs = new TextAttributes(Color.white,Color.black);
        s_console.setTextAttributes(attrs);
        //System.out.print("");
    }
    
    private static final enigma.console.Console s_console;
    static
    {
        s_console = Enigma.getConsole();
    }
    
}
