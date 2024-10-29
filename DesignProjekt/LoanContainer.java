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
   
   public LoanContainer(){
       listLoans = new ArrayList<>();
   }
   
   private static LoanContainer getUniqueInstance(){
       
       if(uniqueInstance == null){
           uniqueInstance = new LoanContainer();
       }
       return uniqueInstance;
   }
   
   public void addLoan(Loan l){
       listLoans.add(l);
   }
}
