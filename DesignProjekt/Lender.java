
/**
 * The Lender class represents the person who wants to loan an LP from the owner.
 *
 * @author Gruppe5
 */
public class Lender
{
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String phone;
    
    /**
     * The constructor that creates an instance of Lender
     * @param name The name of the Lender
     * @param address The address of the Lender
     * @param postalCode The postalCode of the Lender
     * @param city The city, which the Lender lives
     * @param phone The phone number of the Lender
     */
    public Lender(String name, String address, String postalCode, String city, String phone){
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
    }
    
    /**
     * A getter to return the name of the lender
     */
    public String getName(){
        return name;
    }
    
    /**
     * A getter to return the address of the lender
     */
    public String getAddress(){
        return address;
    }
    
    /**
     * A getter to return the postal code of the lender
     */
    public String getPostalCode(){
        return postalCode;
    }
    
    /**
     * A getter to return the home city of the lender
     */
    public String getCity(){
        return city;
    }
    
    /**
     * A getter to return the number of the lender
     */
    public String getNumber(){
        return phone;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPostalCode(String postalcode){
        this.postalCode = postalCode;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPostalcode: " + postalCode + "\nCity: " + city + "\nPhone Number: " + phone;
    }
    
}
