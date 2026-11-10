
package cinema_project;

import java.util.Objects;

public abstract class Movie implements Bookable, Comparable<Movie>, Cloneable{
     private String movieName;
     private Integer movieID;
     private double moviePrice;
    private int movieDuration;
    private String movietype;
    private boolean available = true;

    public Movie() {
    }

    public Movie(String movieName, Integer movieID, double moviePrice, int movieDuration, String movietype) {
        this.movieName = movieName;
        this.movieID = movieID;
        this.moviePrice = moviePrice;
        this.movieDuration = movieDuration;
        this.movietype = movietype;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMovietype() {
        return movietype;
    }

    public void setMovietype(String movietype) {
        this.movietype = movietype;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    @Override
    public void bookTicket(){
        available = false;
    }
    
    @Override
    public void cancelTicket(){
        available = true;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movie) {
        return this.movieID.equals(((Movie)obj).movieID);
    }
    return false;
    }
    
    @Override
    public int compareTo(Movie other){
        return this.movieName.compareToIgnoreCase(other.movieName);
    }

    @Override
    public String toString() {
        return "Movie: "+movieName+ " , ID: "+movieID+ " , Price: "+moviePrice+ " , Duration: "+movieDuration+ " , type: "+movietype;
    }
  
    public abstract void displayDetails();
    
    @Override
    public Movie clone(){
        try{
            return (Movie) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
