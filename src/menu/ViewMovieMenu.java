package menu;

import movie.MovieList;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-24
 * Time: обнГ7:04
 * To change this template use File | Settings | File Templates.
 */
public class ViewMovieMenu extends Menu{


    public ViewMovieMenu(int menuNum, String menuName, boolean isSelected) {
        super(menuNum, menuName, isSelected);
    }

    @Override
    public void show() {

        setStatement(true);    //To change body of implemented methods use File | Settings | File Templates.
    }
    public void afterShow(){
        MovieList movieList = new MovieList();
        movieList.showMovies();
    }
}
