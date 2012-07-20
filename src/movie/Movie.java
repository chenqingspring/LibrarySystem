package movie;

import output.FakePrintStream;

/**
 * Created by IntelliJ IDEA.
 * User: spring
 * Date: 12-7-19
 * Time: ÏÂÎç3:32
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private int       movieNum = 0;
    private String    movieName = "movieName";
    private String    movieDirector = "movieDirector";
    private String    rate = "0.0";

    public Movie(int movieNum, String movieName, String movieDirector, String rate){
        this.movieNum = movieNum;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.rate = rate;      
    }
    public void show(){
        System.out.println(getMovieInfo());
    }
    public void setPrinterForMovie1(FakePrintStream printer) {
        printer.println(getMovieInfo());
    }

    private String getMovieInfo() {
        return movieNum + "." + movieName + "----"+movieDirector+"----" + rate;
    }
}
