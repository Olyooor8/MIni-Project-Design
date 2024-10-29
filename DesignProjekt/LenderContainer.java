import java.util.ArrayList;

/**
 * @Magnus Rasmussen
 * @version (a version number or a date)
 */

public class LenderContainer {
    private LenderContainer uniqueInstance;
    private ArrayList<Lender> listMembers;
    
    public LenderContainer() {
        this.listMembers = new ArrayList<>();
    }
    
    public void addLender(Lender lender) {
        this.listMembers.add(lender);
    }
    
    public LenderContainer getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LenderContainer();
        }
        return uniqueInstance;
    }
}
