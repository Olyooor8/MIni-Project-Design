import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Magnus Rasmussen
 * @version (a version number or a date)
 */

public class LenderContainer {
    private LenderContainer uniqueInstance;
    private ArrayList<Lender> listLenders;
    
    public LenderContainer() {
        this.listLenders = new ArrayList<>();
    }
    
    public void addLender(Lender lender) {
        this.listLenders.add(lender);
    }
    
    public LenderContainer getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LenderContainer();
        }
        return uniqueInstance;
    }
    
        public Lender findLenderByName(String name)
    {
        Lender foundLender = null;
        boolean found = false;
        Iterator<Lender> it = listLenders.iterator();
        while(it.hasNext() && !found){
            Lender currentLender = it.next();
            if(name.equals(currentLender.getLenderName())){
                found = true;
                foundLender = currentLender;
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
