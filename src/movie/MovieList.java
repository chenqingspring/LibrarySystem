package movie;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-19
 * Time: ÏÂÎç3:31
 * To change this template use File | Settings | File Templates.
 */
public class MovieList {
    public ArrayList<Movie> list = new ArrayList<Movie>();
    public void init(){
        list.add(new Movie(1,"The Dark Knight Rises","Christopher Nolan","8.0"));
        list.add(new Movie(2,"The Queen of Versailles","Lauren Greenfield","7.5"));
        list.add(new Movie(3,"Shut Up and Play the Hits","Will Lovelace","5.5"));
        list.add(new Movie(4,"The Well Digger's Daughter","Daniel Auteuil","6.3"));
        list.add(new Movie(5,"Ice Age: Continental Drift","Steve Martino","6.9"));
        list.add(new Movie(6,"The Amazing Spider-Man","Marc Webb","7.6"));
        list.add(new Movie(7,"Ted","Seth MacFarlane","7.7"));
        list.add(new Movie(8,"Brave","Mark Andrews,Brenda Chapman,Steve Purcell","7.7"));
        list.add(new Movie(9,"Savages","Oliver Stone","6.8"));
        list.add(new Movie(10,"Magic Mike","Steven Soderbergh","6.5"));
        list.add(new Movie(11,"Madea's Witness Protection","Tyler Perry","3.2"));
        list.add(new Movie(12,"Katy Perry: Part of Me"," Dan Cutforth","3.9"));
        list.add(new Movie(13,"Moonrise Kingdom","Wes Anderson","8.3"));
        list.add(new Movie(14,"Madagascar 3: Europe's Most Wanted","Eric Darnell","7.2"));
        list.add(new Movie(15,"The Watch","Akiva Schaffer","N/A"));
    }

    public void showMovies() {
        for(int i=0; i< list.size();i++ ){
              list.get(i).show();
        }
    }
}
