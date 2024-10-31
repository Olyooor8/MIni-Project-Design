

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class bn.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class bn
{
    private LenderController lenderCo1;
    private CopyController copyCont1;
    private LoanUI loanUI1;

    
    
    
    
    
    
    
    

    /**
     * Default constructor for test class bn
     */
    public bn()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        lenderCo1 = new LenderController();
        copyCont1 = new CopyController();
        lenderCo1.addLender("Bo", "500", "52", "32", "03203290");
        copyCont1.addLP("420", "High", "and stuff", "2024");
        copyCont1.addCopyToLP("420", "100", "good", 100, "2024");
        loanUI1 = new LoanUI();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
