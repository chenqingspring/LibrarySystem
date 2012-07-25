package output;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-25
 * Time: обнГ11:46
 * To change this template use File | Settings | File Templates.
 */
public interface BibloiticaInterface {
    public abstract boolean sayWelcome();
    public abstract void setPrinterForWelcome(FakePrintStream printer);
}

