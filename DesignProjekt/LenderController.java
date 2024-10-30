
/**
 * The Lender Controller class issues commands to the lender side of the system, controlling the Lender Container and Lender classes.
 *
 * @author Gruppe5
 */
public class LenderController
{
    private Lender selectedLender;
    private LenderContainer lenderContainer;
    
    /**
     * The constructor that couples the unique instance of LP Container into the field within Lender Controller
     */
    public LenderController(){
        lenderContainer = LenderContainer.getUniqueInstance();
    }
    
    /**
     * A method used to add lenders to the list of lenders within the Lender Container
     * @param name The name of the new lender
     * @param address The address of the new lender
     * @param postalCode The postal code of the new lender
     * @param city The city which the lender lives in
     * @param phone The phone number of the lender
     */
    public void addLender(String name, String address, String postalCode, String city, String phone){
        lenderContainer.addLender(name, address, postalCode, city, phone);
    }
    
    /**
     * A method used to search the list of lenders by name
     * @param name The name that is wished to be searched for
     */
    public Lender findLenderByName(String name){
        selectedLender = lenderContainer.findLenderByName(name);
        return selectedLender;
    }
    
    /**
     * A method used to search the list of lenders by number
     * @param number The number that is wished to be searched for
     */
    public Lender findLenderByNumber(String number){
        selectedLender = lenderContainer.findLenderByNumber(number);
        return selectedLender;
    }
    
}

