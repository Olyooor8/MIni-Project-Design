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
    private LPContainer lpContainer;
    
    public CopyController(){
        lpContainer = LPContainer.getUniqueInstance();
    }
    
    public Copy findCopyBySerial(String serialNumber){
        selectedCopy = lpContainer.findCopy(serialNumber);
        
        return selectedCopy;
    }
    
    public void addLP(String barcode, String title, String artist, String publicationDate){
        LP newLP = new LP(barcode, title, artist, publicationDate);
        lpContainer.addLP(newLP);
    }
    
    public void addCopyToLP(String barcode, String serialNumber, String condition, int purchasePrice, String purchaseDate){
        lpContainer.addCopy(barcode, serialNumber, condition, purchasePrice, purchaseDate);
    }
}
