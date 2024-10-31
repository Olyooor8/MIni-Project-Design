
/**
 * This class is the base copy of a given vinyl CD. Within the class is the
 * basic information about a copy of an LP.
 *
 * @author Gruppe5
 * @version (a version number or a date)
 */
public class Copy
{
    private String serialNumber;
    private String purchaseDate;
    private int purchasePrice;
    private String condition;

    /**
     * Constructor for objects of class Copy
     * @param serialNumber The serial number of the Copy
     * @param purchaseDate The date that the copy was bought by the owner
     * @param purchasePrice The price that the copy was sold to the owner for
     * @param condition The approximate condition that the copy is in
     */
    public Copy(String serialNumber, String purchaseDate, int purchasePrice, String condition)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.condition = condition;
    }
    
    /**
     * A Getter to return the serial number of the copy
     */
    public String getCopySerial()
    {
        return serialNumber;
    }
}
