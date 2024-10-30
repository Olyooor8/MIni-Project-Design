import java.util.ArrayList;

public class LP
{
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copylist;
    
    public LP (String barcode, String title, String artist, String publicationDate){
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copylist = new ArrayList<>();
    }
    
    public void addCopy(Copy c){
        copylist.add(c);
    }
    
    public String getBarcode(){
        return barcode;
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
