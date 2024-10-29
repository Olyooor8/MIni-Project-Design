import java.util.ArrayList;

/**
 * Write a description of class CopyController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyController
{
    private Copy selectedCopy;
    private LPContainer listOfLPs;
    
    
    public Copy findCopyBySerial(String serialNumber){
        LPContainer instance = LPContainer.getUniqueInstance();
        
        selectedCopy = instance.findLP(serialNumber);
        
        return selectedCopy;
    }
}
