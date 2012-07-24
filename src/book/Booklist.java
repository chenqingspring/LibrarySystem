package book;

import java.util.ArrayList;


/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: ÏÂÎç9:53
 * To change this template use File | Settings | File Templates.
 */
public class Booklist {

    public  ArrayList<Book> list = new ArrayList<Book>();

    public void add(Book book){
        list.add(book);
    }
    public void setList(ArrayList<Book> list){
        this.list = list;
    }

    public ArrayList<Book> getList(){
        return list;
    }

    public void init() {
        list.add(new Book(1, "Clean Code", "Robert C.Maitin", false));
        list.add(new Book(2, "Refactoring:improving the Design of existing code", "Martin Fowler", false));
        list.add(new Book(3, "The Art of Agile Development", "Jame Shore", false));
        list.add(new Book(4, "Extreme Programming Explained", "Kent Beck", false));
        list.add(new Book(0, "N/A", "N/A", false));
    }
}
      