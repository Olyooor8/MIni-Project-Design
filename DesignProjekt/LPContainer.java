import java.util.ArrayList;

public class LPContainer
{
    private static LPContainer uniqueInstance;
    private ArrayList<LP>ListLPs;
    
    private LPContainer(){
        ListLPs = new ArrayList<>();
    }
    
    public void addLP(LP l){
        ListLPs.add(l);
    }
    
    public static LPContainer getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new LPContainer();
        }
        return uniqueInstance;
    }
    
    public Copy findCopy(String serialNumber){
        
        Copy foundLP = null;
        
        for(LP lp : ListLPs){
            Copy currentLP = lp.getCopySerial(serialNumber);
            if(currentLP != null){
                foundLP = currentLP;
                break;
            }
        }
        
        return foundLP;
    }
    
}
