
package cinema_project;


public class ActionMovie extends Movie{
    private String director;

    public ActionMovie() {
    }

    public ActionMovie(String movieName, Integer movieID, double moviePrice, int movieDuration, String movietype,String director) {
        super(movieName, movieID, moviePrice, movieDuration, movietype);
        this.director = director;
    }
    
    @Override
    public void displayDetails(){
        System.out.println("Movie: "+getMovieName());
        System.out.println("ID: "+getMovieID());
        System.out.println("Price: "+getMoviePrice());
        System.out.println("Duration: "+getMovieDuration());
        System.out.println("type: "+getMovietype());
        System.out.println("director: "+director);
        System.out.println("\n");
    }
    
}
