
/**
 * Write a description of class LenderController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LenderController
{
    private Lender selectedLender;
    
    public Lender findLenderByName(String name){
        LenderContainer instance = LenderContainer.getUniqueInstance();
        
        selectedLender = instance.findLenderByName(name);
        
        
        return selectedLender;
    }
    
    public Lender findLenderByNumber(String number){
        LenderContainer instance = LenderContainer.getUniqueInstance();
        
        selectedLender = instance.findLenderByNumber(number);
        
        
        return selectedLender;
    }
    
}

