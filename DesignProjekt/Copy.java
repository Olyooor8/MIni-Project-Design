
/**
 * This class is the base copy of a given vinyl CD. Within the class is the
 * basic information about a copy of an LP.
 *
 * @author (your name)
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
     */
    public Copy(String serialNumber, String purchaseDate, int purchasePrice, String condition)
    {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.condition = condition;
    }

    public String getCopySerial()
    {
        return serialNumber;
    }
}
