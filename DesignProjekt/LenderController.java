
/**
 * Write a description of class LenderController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LenderController
{
    private Lender selectedLender;
    private LenderContainer lenderContainer;
    
    public LenderController(){
        lenderContainer = LenderContainer.getUniqueInstance();
    }
    
    public void addLender(String name, String address, String postalCode, String city, String phone){
        lenderContainer.addLender(name, address, postalCode, city, phone);
    }
    
    public Lender findLenderByName(String name){
        selectedLender = lenderContainer.findLenderByName(name);
        return selectedLender;
    }
    
    public Lender findLenderByNumber(String number){
        selectedLender = lenderContainer.findLenderByNumber(number);
        return selectedLender;
    }
    
}

