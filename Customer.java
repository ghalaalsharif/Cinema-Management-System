
package cinema_project;

import java.util.ArrayList;
public class Customer implements Comparable<Customer>{
    private String CustomerName;
     private Integer CustomerID;
     private ArrayList<Movie>bookedMovies = new ArrayList<>();

    public Customer() {
    }

    public Customer(String CustomerName, Integer CustomerID) {
        this.CustomerName = CustomerName;
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(Integer CustomerID) {
        this.CustomerID = CustomerID;
    }

    public ArrayList<Movie> getBookedMovies() {
        return bookedMovies;
    }

    public void setBookedMovies(ArrayList<Movie> bookedMovies) {
        this.bookedMovies = bookedMovies;
    }
     
     
     public void addMovie(Movie  m){
         bookedMovies.add(m);
     }
     
     
     public void removeMovie(Movie m){
         bookedMovies.remove(m);
     }
     
     
     public void listMovies(){
         for(Movie m : bookedMovies)
           System.out.println(m); 
     }
     
     
     @Override
     public int compareTo(Customer other){
         return this.CustomerName.compareToIgnoreCase(other.CustomerName);
     }
}
