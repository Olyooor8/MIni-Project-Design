
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
    private LoanContainer loanContainer;

    /**
     * Constructor for objects of class LoanController
     * @param copy The CopyController
     */
    public LoanController(CopyController copy, LenderController lender)
    {
        assignedCopyController = copy;
        assignedLenderController = lender;
        loanContainer = LoanContainer.getUniqueInstance();
    }

    public void startLoan(int loanDuration, String loanNumber)
    {
        currentLoan = new Loan(loanDuration, loanNumber);
    }
    
    public Lender findLenderName(String name){
        Lender foundLender = assignedLenderController.findLenderByName(name);
        currentLoan.setLender(foundLender);
        return foundLender;
    }
    
    public Lender findLenderNumber(String number){
        Lender foundLender = assignedLenderController.findLenderByNumber(number);
        currentLoan.setLender(foundLender);
        return foundLender;
    }
    
    public Copy findCopy(String serialNumber){
        Copy foundCopy = assignedCopyController.findCopyBySerial(serialNumber);
        currentLoan.setCopy(foundCopy);
        return foundCopy;
    }
    
    public void confirm(){
        loanContainer.addLoan(currentLoan);
        currentLoan = null;
    }
    
}
