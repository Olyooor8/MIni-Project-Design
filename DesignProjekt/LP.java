import java.util.ArrayList;

public class LP
{
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copylist;
    
    /**
     * param@ barcode This is the barcode on the LP to identify it.
     * param@ title This is the title of the LP.
     * param@ artist This is the artist of the song.
     * param@ publicationDate This is when the LP were released.
     */
    public LP (String barcode, String title, String artist, String publicationDate){
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copylist = new ArrayList<>();
    }
    
    /**
     * A method where you add a copy to copylist.
     */
    public void addCopy(Copy c){
        copylist.add(c);
    }
    
    /**
     * A noramal getter method.
     */
    public String getBarcode(){
        return barcode;
    }
    
    /**
     * A getter method to find a copy of a specific LP
     * param@ serialNumber this is a string you use for search.
     */
    public Copy getCopySerial(String serialNumber){
        Copy foundCopy = null;
        boolean found = false;
        int index = 0;
        
        while(!found && index < copylist.size()){
            Copy currentCopy = copylist.get(index);
            String currentnumber = currentCopy.getCopySerial();
            if(currentnumber.equals(serialNumber)){
                foundCopy = foundCopy;
                found = true;
            } 
            else{
                index++;
            }
        }
    
        return foundCopy;
    }
}
