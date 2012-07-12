/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-11
 * Time: обнГ4:32
 * To change this template use File | Settings | File Templates.
 */
public class Book {

    int  id   = 0;
    String name  = null;
    String author = null;
    boolean isAvailble = true;

    public Book(int id, String name, String author, boolean isAvailble){
        this.id = id;
        this.name = name;
        this.author = author;
        this.isAvailble = isAvailble;

    }

     public void showBooks(){

         System.out.println(id + ". "+ name +"  "+ author + "\t");
     }

}
