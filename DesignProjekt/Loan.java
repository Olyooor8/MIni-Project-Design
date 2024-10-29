import java.time.LocalDate;

/**
 * @Magnus Rasmussen
 * @version (a version number or a date)
 */

public class Loan {
    private String loanNumber;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private boolean state;
    private Lender lender;
    private Copy copy;
    
    public Loan(int loanDuration, String loanNumber) {
        this.loanNumber = loanNumber;
        this.periodStart = LocalDate.now();
        this.periodEnd = periodStart.plusDays(loanDuration);
        this.state = true;
        this.lender = null;
        this.copy = null;
    }
    
    public void setCopy(Copy copy) {
        this.copy = copy;
    }
    
    public void setLender(Lender lender) {
        this.lender = lender;
    }
}
