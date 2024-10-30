import java.util.ArrayList;

/**
 * The Copy Controller class controls the LP and copies of the system. This controller creates, distributes and finds the copies.
 *
 * @author Gruppe5
 */
public class CopyController
{
    private Copy selectedCopy;
    private LPContainer lpContainer;
    
    /**
     * The constructor that couples the unique instance of LP Container into the field within Copy Controller
     */
    public CopyController(){
        lpContainer = LPContainer.getUniqueInstance();
    }
    
    /**
     * A call to a search method within the LPContainer, searching for an LP that has given serial number
     * @param serialNumber The serial number that the system should search for within the LPs
     */
    public Copy findCopyBySerial(String serialNumber){
        selectedCopy = lpContainer.findCopy(serialNumber);
        
        return selectedCopy;
    }
    
    /**
     * A method used to add LPs to the LP Container from the Copy Controller
     * @param barcode The identifying code of an LP
     * @param title The title of an LP
     * @param artist The artist of an LP
     * @param publicationDate The date of publication of an LP
     */
    public void addLP(String barcode, String title, String artist, String publicationDate){
        LP newLP = new LP(barcode, title, artist, publicationDate);
        lpContainer.addLP(newLP);
    }
    
    /**
     * A method used to add copies to an LP with given barcode within LP Container
     * @param barcode The identifying code of an LP
     * @param serialNumber The new copy will have given serial number
     * @param condition The new copy will have given condition
     * @param purchasePrice The new copy will have given purchase price
     * @param purchaseDate The new copy will have given purchase date
     */
    public void addCopyToLP(String barcode, String serialNumber, String condition, int purchasePrice, String purchaseDate){
        lpContainer.addCopy(barcode, serialNumber, condition, purchasePrice, purchaseDate);
    }
}
