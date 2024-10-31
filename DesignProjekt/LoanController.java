
/**
 * The main controller of the system, this class contains the systems main methods, creating and building the loans.
 *
 * @author Gruppe5
 */
public class LoanController
{
    // instance variables - replace the example below with your own
    private Loan currentLoan;
    private LoanContainer loanContainer;

    /**
     * Constructor for objects of class LoanController
     * @param copy The CopyController that becomes assigned to the Loan Controller
     * @param lender The LenderController that becomes assigned to the Loan Controller
     */
    public LoanController()
    {
        loanContainer = LoanContainer.getUniqueInstance();
    }
    
    /**
     * Create an instance of Loan and assign it to the Loan Controller.
     * @param loanDuration The duration of the loan in days
     * @param loanNumber The identifying number for the loan
     */
    public void startLoan(int loanDuration, String loanNumber)
    {
        currentLoan = new Loan(loanDuration, loanNumber);
    }
    
    /**
     * Find and assign a lender to the current Loan instance, by searching through names
     * @param name The name that the system should try and find
     */
    public Lender findLenderName(String name){
        LenderController instance = new LenderController();
        Lender foundLender = instance.findLenderByName(name);
        currentLoan.setLender(foundLender);
        return foundLender;
    }
    
    /**
     * Find and assign a lender to the current Loan instance, by searching through numbers
     * @param number The number that the system should try and find
     */
    public Lender findLenderNumber(String number){
        LenderController instance = new LenderController();
        Lender foundLender = instance.findLenderByNumber(number);
        currentLoan.setLender(foundLender);
        return foundLender;
    }
    
    /**
     * Find and assign a copy to the current Loan instance, by searching through serial numbers
     * @param serialNumber The serial number that the system should try and find
     */
    public Copy findCopy(String serialNumber){
        CopyController instance = new CopyController();
        Copy foundCopy = instance.findCopyBySerial(serialNumber);
        currentLoan.setCopy(foundCopy);
        return foundCopy;
    }
    
    /**
     * Confirm and finalize the loan, adding it to the Loan Container list
     */
    public void confirm(){
        loanContainer.addLoan(currentLoan);
        currentLoan = null;
    }
    
}
