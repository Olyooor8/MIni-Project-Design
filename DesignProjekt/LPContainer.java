import java.util.ArrayList;

public class LPContainer
{
    private static LPContainer uniqueInstance;
    private ArrayList<LP>listLPs;
    
    /**
     * Method is creating a new list
     */
    private LPContainer(){
        listLPs = new ArrayList<>();
    }
    
    /**
     * Method adds to the list of LPs.
     */
    public void addLP(LP l){
        listLPs.add(l);
    }
    
    /**
     * A method to add copy under a specefic LP.
     * param@ barcode This is the barcode on the LP to identify it.
     * param@ serialNumber This is the serial number of the LP.
     * param@ condition This is the condition of the LP.
     * param@ purchasePrice This is the price of the LP.
     * param@ purchaseDate This is when the LP where purchased.
     */
    public void addCopy(String barcode, String serialNumber, String condition, int purchasePrice, String purchaseDate){
        Copy newCopy = new Copy(serialNumber, condition, purchasePrice, purchaseDate);
        LP foundLP = null;
        int index = 0;
        boolean found = false;
        while(!found && index < listLPs.size()){
            LP currentLP = listLPs.get(index);
            String currentBarcode = currentLP.getBarcode();
            if(barcode.equals(currentBarcode)){
                found = true;
            }
            else{
                index++;
            }
        }
        if(found){
            foundLP = listLPs.get(index);
            foundLP.addCopy(newCopy);
        }
    }
    
    /**
     * This is where the LPContainer is created, only if there is no container
     */
    public static LPContainer getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new LPContainer();
        }
        return uniqueInstance;
    }
    
    /**
     * This method is for looking a specific copy under the list of LPs.
     * param@ serialNumber This is the serial number which is different on every LP.
     */
    public Copy findCopy(String serialNumber){
        Copy foundLP = null;
        boolean found = false;
        int index = 0;
        
        while(!found && index < listLPs.size()){
            LP currentLPIndex = listLPs.get(index);
            Copy currentLP = currentLPIndex.getCopySerial(serialNumber);
            if(currentLP != null){
                foundLP = currentLP;
                found = true;
            }
            else {
                index++;
            }
        }
        
        return foundLP;
    }
    
    public LP findLPBarcode(String barcode){
        LP foundLP = null;
        boolean found = false;
        int index = 0;
        
        while(!found && index < listLPs.size()){
            LP currentLP = listLPs.get(index);
            if(currentLP.getBarcode().equals(barcode)){
                foundLP = currentLP;
                found = true;
            }
            else {
                index++;
            }
        }
        
        return foundLP;
    }
    
    private int findLPBarcodeIndex(LP lp) {
        boolean found = false;
        int index = 0;
        
        while(!found && index < listLPs.size()){
            LP currentLP = listLPs.get(index);
            if(currentLP.getBarcode().equals(lp.getBarcode())){
                found = true;
            }
            else {
                index++;
            }
        }  
        
        return index;
    }
        
    public void printAllLPs() {
        for (LP lp : this.listLPs) {
            System.out.println(lp);
            System.out.println();
        }
    }
    
    public void removeLP(LP lpToRemove) {
        this.listLPs.remove(findLPBarcodeIndex(lpToRemove));
    }
    
}
