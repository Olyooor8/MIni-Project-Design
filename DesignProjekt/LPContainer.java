import java.util.ArrayList;

public class LPContainer
{
    private static LPContainer uniqueInstance;
    private ArrayList<LP>ListLPs;
    
    public LPContainer(){
        ListLPs = new ArrayList<>();
    }
    
    public void addLP(LP l){
        ListLPs.add(l);
    }
    
    public void addCopy(String barcode, String serialNumber, String condition, int purchasePrice, String purchaseDate){
        Copy newCopy = new Copy(serialNumber, condition, purchasePrice, purchaseDate);
        LP foundLP = null;
        for(LP lp : ListLPs){
            LP currentLP = lp;
            String currentBarcode = lp.getBarcode();
            if(barcode.equals(currentBarcode)){
                foundLP = currentLP;
                break;
            }
        }
        foundLP.addCopy(newCopy);
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
