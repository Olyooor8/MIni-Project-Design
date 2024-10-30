import java.util.ArrayList;

/**
 * Write a description of class CopyController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyController
{
    private Copy selectedCopy;
    private LPContainer listOfLPs;
    
    
    public Copy findCopyBySerial(String serialNumber){
        LPContainer instance = LPContainer.getUniqueInstance();
        
        selectedCopy = instance.findCopy(serialNumber);
        
        return selectedCopy;
    }
    
    public void addLP(String barcode, String title, String artist, String publicationDate){
        if(listOfLPs == null){
            listOfLPs = new LPContainer();
        }
        LP newLP = new LP(barcode, title, artist, publicationDate);
        listOfLPs.addLP(newLP);
    }
    
    public void addCopyToLP(String barcode, String serialNumber, String condition, int purchasePrice, String purchaseDate){
        LPContainer instance = LPContainer.getUniqueInstance();
        instance.addCopy(barcode, serialNumber, condition, purchasePrice, purchaseDate);
    }
}
