
package cinema_project;


public class Ticket implements Cloneable{
    private Integer TicketID;
    private Customer customer;
    private Movie movie;

    public Ticket() {
    }
    

    public Ticket(Integer TicketID, Customer customer, Movie movie) {
        this.TicketID = TicketID;
        this.customer = customer;
        this.movie = movie;
    }

    public Integer getTicketID() {
        return TicketID;
    }

    public void setTicketID(Integer TicketID) {
        this.TicketID = TicketID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Ticket: "+TicketID+ " | " +movie.getMovieName()+ " | Customer: " + customer.getCustomerName();
    }
    
    
     @Override
     public Ticket clone(){
         try{
             return(Ticket) super.clone();
         }catch (CloneNotSupportedException e){
             return null;
         }
     }
    
    
}
