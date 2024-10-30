

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
    private Copy copy1;
    private Copy copy2;
    private Copy copy3;
    private Copy copy4;
    private LP lP1;
    private LP lP2;
    private LPContainer lPContai1;
    private CopyController copyCont1;

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
        copy1 = new Copy("5", "06490", 500, "good");
        copy2 = new Copy("6", "968498", 600, "Okay");
        copy3 = new Copy("2", "689547", 500, "good");
        copy4 = new Copy("1", "098764", 600, "Okay");
        lP1 = new LP("5093", "High", "TIde", "89649");
        lP1.addCopy(copy2);
        lP1.addCopy(copy1);
        lP2 = new LP("5403", "low", "TIde", "97859");
        lP2.addCopy(copy4);
        lP2.addCopy(copy3);
        lPContai1 = LPContainer.getUniqueInstance();
        lPContai1.addLP(lP1);
        lPContai1.addLP(lP2);
        copyCont1 = new CopyController();
        copyCont1.findCopyBySerial("4");
        copyCont1.findCopyBySerial("5");
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
