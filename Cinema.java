
package cinema_project;
import java.util.ArrayList;
import java.util.TreeSet;

public class Cinema {
    private ArrayList<Movie> catalog = new ArrayList<>();
    private TreeSet<Customer> customers = new TreeSet<>();
    
    public void addMovie(Movie  m){
         catalog.add(m);
     }
    
    
    public void registerCustomer(Customer c){
        customers.add(c);
    }
    
    
      
  public Movie findMovie(Integer id)throws MovieNotFoundException{
        for(Movie m : catalog){
            if(m.getMovieID().equals(id))
                return m;
        }
  
        throw new MovieNotFoundException ("Movie not found in system!");
    }  
    
    
    
    public void bookAMovie(Customer c, Integer movieID) throws MovieNotFoundException{
        Movie m = findMovie(movieID);
        if(!m.isAvailable()){
            System.out.println("Movie already booked!");
            return;
        }
        m.bookTicket();
        c.addMovie(m);
    }
    
    
    
    
    public void cancelAMovie(Customer c, Integer movieID) throws MovieNotFoundException{
       Movie m = findMovie(movieID);
       m.cancelTicket();
       c.removeMovie(m);
    }
    
    
    
    public void printCatalogSorted(){
        catalog.sort(null);
        for (Movie m : catalog) System.out.println(m);    
    }
    
    
    
    
    
    
    
    
}
