
/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    // instance variables - replace the example below with your own
    private Loan currentLoan;
    private CopyController assignedCopyController;
    private LenderController assignedLenderController;

    /**
     * Constructor for objects of class LoanController
     */
    public LoanController(CopyController copy, LenderController lender)
    {
        assignedCopyController = copy;
        assignedLenderController = lender;
    }

    public void startLoan(int loanDuration, String loanNumber)
    {
        currentLoan = new Loan(loanDuration, loanNumber);
    }
    
    public Lender findLenderName(String name){
        
    }
    
    public Lender findLenderNumber(String name){
        
    }
    
    public Copy findCopy(String serialNumber){
        Copy foundCopy = assignedCopyController.findCopyBySerial(serialNumber);
        currentLoan.setCopy(foundCopy);
    }
}
