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
   public void displayLoans(){
       for(int index = 0; index < listLoans.size(); index++){
           Loan currentLoan = listLoans.get(index);
           System.out.println("Loan " + index + ": ");
           System.out.print("Loan " + index + ": " + currentLoan.getLoanNumber());
           System.out.print(" " + currentLoan.getPeriodStart() + " " + currentLoan.getPeriodEnd());
       }
       
       if(listLoans.size() == 0){
           System.out.println("No loans are currently registered.");
       }
   }
   
   /**
     * Method adds to the list of loans.
     */
   public void addLoan(Loan l){
       listLoans.add(l);
   }
   
   /**
     * Method remove from the list of loans.
     */
   public void removeLoan(Loan l){
       listLoans.remove(l);
   }
   
   /**
     * A search method to find a Loan using their identifiers
     * @param loanNumber this is a string you use for search.
     */
   public Loan findLoanNumber(String loanNumber){
        Loan foundLoan = null;
        boolean found = false;
        int index = 0;
        
        while(!found && index < listLoans.size()){
            Loan currentLoan = listLoans.get(index);
            String currentnumber = currentLoan.getLoanNumber();
            if(currentnumber.equals(loanNumber)){
                foundLoan = currentLoan;
                found = true;
            } 
            else{
                index++;
            }
        }
    
        return foundLoan;
   }
}
