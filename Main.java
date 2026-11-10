/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cinema_project;

/**
 *
 * @author admin1446
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("****** Starting the cinema management system ******");
        System.out.println("_____________________________________\n");
        
        Cinema royalCinema = new Cinema();
        
        System.out.println("**** Add movies to the catalog ****");
        
        ActionMovie movie1 = new ActionMovie("Harry Potter",101,55.0,10,"Action","director Lana");
        ActionMovie movie2 = new ActionMovie("Frozen",102,60.0,10,"thriller","Nolan");

        royalCinema.addMovie(movie1);
        royalCinema.addMovie(movie2);
        
        movie1.displayDetails();
        movie2.displayDetails();
        System.out.println("_____________________________________\n");
        
        System.out.println("\n****** Movie catalog organized alphabetically ******");
        royalCinema.printCatalogSorted();
        System.out.println("_____________________________________\n");
        
        System.out.println("****** Customer Registration ******");
        Customer cust1 = new Customer("Maha",2006);
        Customer cust2 = new Customer("Raghad",2008);
        royalCinema.registerCustomer(cust1);
        royalCinema.registerCustomer(cust2);
        
        
     
        try{
            System.out.println("Maha books a movie (Harry Potter _ 101)");
            royalCinema.bookAMovie(cust1, 101);
            
            System.out.println("Raghad books a movie (Frozen _ 102)");
            royalCinema.bookAMovie(cust2, 102);
            
            System.out.println("_____________________________________\n");
            System.out.println("*****Booking and cancellation process******");
            System.out.println("Done Recorded: "+cust1.getCustomerName()+ " And " + cust2.getCustomerName());
            System.out.println("\nRaghad is trying to book 101, but it is reserved!");
            royalCinema.bookAMovie(cust2, 102);
            
        }catch(MovieNotFoundException e){
            System.out.println("System error: "+e.getMessage());
        }
        
        System.out.println("_____________________________________\n");
        System.out.println("******Reserved movies for each customer******");
        System.out.println("Movies: "+cust1.getCustomerName()+ " : " ); cust1.listMovies();
        System.out.println("\n");
        System.out.println("Movies: "+cust2.getCustomerName()+ " : " ); cust2.listMovies();
        System.out.println("\n");
        
        System.out.println("_____________________________________\n");
        
        System.out.println("******Copy test (Cloning) for the ticket******");
        Ticket originalTicket = new Ticket(500,cust2,movie2);
        Ticket clonedTicket = originalTicket.clone();
        
        
        
        System.out.println("The ticket is original: "+originalTicket);
        System.out.println("The copied ticket: "+clonedTicket);
        
        
        
        System.out.println("_____________________________________\n");
        System.out.println("The experiment has ended !!");
        
        }
      
    }
    
    
    
    
   
   
   
   
   
    

