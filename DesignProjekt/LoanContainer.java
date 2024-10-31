import java.util.ArrayList;

/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
   private static LoanContainer uniqueInstance;
   private ArrayList<Loan> listLoans;
   
   /**
    * Method is creating a new list
    */
   private LoanContainer(){
       listLoans = new ArrayList<>();
   }
   
   /**
     * This is where the LPContainer is created, only if there is no container
     */
   public static LoanContainer getUniqueInstance(){
       
       if(uniqueInstance == null){
           uniqueInstance = new LoanContainer();
       }
       return uniqueInstance;
   }
   
   /**
     * Method adds to the list of loans.
     */
   public void addLoan(Loan l){
       listLoans.add(l);
   }
}
