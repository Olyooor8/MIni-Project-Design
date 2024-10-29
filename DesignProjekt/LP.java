import java.util.ArrayList;

public class LP
{
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copylist;
    
    public LP (String barcode, String title, String artist,String publicatoinDate){

    }
    
    public Copy getCopySerial(String serialnumber){
        Copy foundCopy = null;
        for(Copy c : copylist){
            String currentnumber = c.getCopySerial();
            if(currentnumber.equals(serialnumber)){
                foundCopy = c;
                break;
            }
        }
        
        return foundCopy;
    }
}
