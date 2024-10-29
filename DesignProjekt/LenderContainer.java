import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class LenderContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LenderContainer
{
    private static LenderContainer uniqueInstance;
    private ArrayList<Lender> listLenders;

    /**
     * Constructor for objects of class LenderContainer
     */
    public LenderContainer()
    {
        listLenders = new ArrayList<>();
    }

    public void addLender(Lender l)
    {
        listLenders.add(l);
    }
    
    public static LenderContainer getUniqueInstance()
    {
        if(uniqueInstance == null){
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
