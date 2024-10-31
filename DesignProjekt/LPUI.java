import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class LPUI {
    
    public void start(){
        loanMenuFunc();
    }
    
    public void loanMenuFunc(){
        boolean exit = false;
        while(!exit) {
            int choice = writeLPMenu();
            System.out.println(choice);
            switch (choice) {
                case 0:
                    System.out.println("Tak for i dag.");
                    exit = true;
                    break;
                    
                case 1:
                    createNewLP();
                    break;
                    
                case 2:
                    printAllLPs();
                    break;
                
                case 3:
                    System.out.println(findLPBarcode());
                    break;
                
                case 4:
                    updateLPFunc();
                    break;
                
                case 5:
                    deleteLPFunc();
                    break;

                default:
                    System.out.println("Input Invalid, try again.");
            }         
        }
    }
    
    private int writeLPMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** LP menu ***");
        System.out.println(" (1) Add LP");
        System.out.println(" (2) Read all LP");
        System.out.println(" (3) Find LP");
        System.out.println(" (4) Update LP");
        System.out.println(" (5) Delete LP");
        System.out.println(" (0) Return to Main Menu");
        System.out.print("\n Please select an action: ");
  
        while (!keyboard.hasNext()){
          keyboard.nextLine();//need to read the newline          
          System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    private void createNewLP(){
        CopyController lpCon = new CopyController();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please type the barcode of the LP you wish to assign");
        String barcode = keyboard.nextLine();
        
        if (lpCon.findLPByBarcode(barcode) == null) {
            System.out.println("Please type the title of the LP you wish to assign");
            String title = keyboard.nextLine();
            
            System.out.println("Please type the artist of the LP you wish to assign");
            String artist = keyboard.nextLine();
            
            System.out.println("Please type the publication year of the LP you wish to assign");
            String publicationYear = keyboard.nextLine();
                    
            lpCon.addLP(barcode, title, artist, publicationYear);
            
            System.out.println("LP successfully added.");
        } else {
            System.out.println("LP already exists!");
        }
    }
    
    private String inputLPBarcode() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the code you wish to find");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private LP findLPBarcode(){
        String barcode = inputLPBarcode();
        CopyController copyCon = new CopyController();
        LP result = copyCon.findLPByBarcode(barcode);
        return result;
    }
    
    private void printAllLPs() {
        CopyController copyCon = new CopyController();
        copyCon.printAllLPs();
    }
    
    private String input() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private void updateLPFunc() {
        boolean exit = false;
        
        LP foundLP = findLPBarcode();
        
        while(!exit) {
            int choice = updateLPMenu();
            switch (choice) {
                case 0:
                    System.out.println("Tak for i dag.");
                    exit = true;
                    break;
                
                case 1: 
                    System.out.println("Please type the new title");
                    String newTitle = input();
                    foundLP.setTitle(newTitle);
                    break; 
                    
                case 2: 
                    System.out.println("Please type the new artist");
                    String newArtist = input();
                    foundLP.setArtist(newArtist);
                    break;
                    
                case 3: 
                    System.out.println("Please type the new publication year");
                    String newPublicationYear = input();
                    foundLP.setPublicationYear(newPublicationYear);
                    break;   

                default:
                    System.out.println("Input Invalid, try again.");
            }         
        }
    }
    
    private int updateLPMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Update menu ***");
        System.out.println(" (1) Change title");
        System.out.println(" (2) Change artist");
        System.out.println(" (3) Change publication year");
        System.out.println(" (0) Return to Main Menu");
        System.out.print("\n Please select an action: ");
  
        while (!keyboard.hasNextInt()){
          keyboard.nextLine();//need to read the newline          
          System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    public void deleteLPFunc() {
        CopyController copyCon = new CopyController();
        
        LP foundLP = findLPBarcode();
        
        copyCon.removeLP(foundLP);
    }
}






















