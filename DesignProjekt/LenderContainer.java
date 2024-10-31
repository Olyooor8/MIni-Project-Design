import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Magnus Rasmussen
 * @version (a version number or a date)
 */

public class LenderContainer {
    private static LenderContainer uniqueInstance;
    private ArrayList<Lender> listLenders;
    
    /**
     * Method is creating a new list
     */
    private LenderContainer() {
        this.listLenders = new ArrayList<>();
    }
    
    /**
     * Method adds to the list of LPs.
     */
    public void addLender(Lender lender) {
        this.listLenders.add(lender);
    }
    
    /**
     * This is where the LPContainer is created, only if there is no container
     */
    public static LenderContainer getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LenderContainer();
        }
        return uniqueInstance;
    }
    
    /**
     * A method where you add a lender to the list of lenders.
     * param@ name The name of the lender
     * param@ address The address of the lender
     * param@ postalCode The postalCode of the lender
     * param@ city The city of the lender
     * param@ phone The phone number of the lender
     */
    public void addLender(String name, String address, String postalCode, String city, String phone){
        Lender newLender = new Lender(name, address, postalCode, city, phone);
        listLenders.add(newLender);
    }
    
        public Lender findLenderByName(String name)
    {
        Lender foundLender = null;
        boolean found = false;
        Iterator<Lender> it = listLenders.iterator();
        while(it.hasNext() && !found){
            Lender currentLender = it.next();
            if(name.equals(currentLender.getLenderName())){
                foundLender = currentLender;
                found = true;
        
            }
        }
        return foundLender;
    }
    
    public Lender findLenderByNumber(String number)
    {
        Lender foundLender = null;
        boolean found = false;
        Iterator<Lender> it = listLenders.iterator();
        while(it.hasNext() && !found){
            Lender currentLender = it.next();
            if(number.equals(currentLender.getLenderNumber())){
                found = true;
                foundLender = currentLender;
            }
        }
        return foundLender;
    }
}
