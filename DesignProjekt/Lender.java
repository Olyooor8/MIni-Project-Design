
/**
 * Write a description of class Lender here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lender
{
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String phone;
    
    public Lender(String name, String address, String postalCode, String city, String phone){
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
    }
    
    public String getLenderName(){
        return name;
    }
    
}
