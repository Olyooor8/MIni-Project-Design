import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Magnus Rasmussen
 * @version (a version number or a date)
 */

public class LenderContainer {
    private static LenderContainer uniqueInstance;
    private ArrayList<Lender> listLenders;
    
    private LenderContainer() {
        this.listLenders = new ArrayList<>();
    }
    
    public void addLender(Lender lender) {
        this.listLenders.add(lender);
    }
    
    public static LenderContainer getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LenderContainer();
        }
        return uniqueInstance;
    }
    
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
