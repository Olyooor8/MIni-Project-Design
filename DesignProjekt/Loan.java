import java.time.LocalDate;

/**
 * The Loan class which represents the needed information and methods to complete a loan.
 * 
 * @author Gruppe5 (Magnus)
 */

public class Loan {
    private String loanNumber;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private boolean state;
    private Lender lender;
    private Copy copy;
    
    /**
     * The constructor that creates an instance of Loan
     * @param loanDuration The duration of the loan, how many days will the loan last
     * @param loanNumber The identifier of the loan, the identifying number
     */
    public Loan(int loanDuration, String loanNumber) {
        this.loanNumber = loanNumber;
        this.periodStart = LocalDate.now();
        this.periodEnd = periodStart.plusDays(loanDuration);
        this.state = true;
        this.lender = null;
        this.copy = null;
    }
    
    /**
     * A Setter to assign a Copy to the loan
     * @param copy The copy that becomes assigned to the loan
     */
    public void setCopy(Copy copy) {
        this.copy = copy;
    }
    
    /**
     * A Setter to assign a Lender to the loan
     * @param lender The lender that becomes assigned to the loan
     */
    public void setLender(Lender lender) {
        this.lender = lender;
    }
}
