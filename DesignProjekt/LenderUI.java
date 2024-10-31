import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class LenderUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LenderUI
{
    
    public void start(){
        lenderMenu();
    }
    
    public void lenderMenu(){
        boolean exit = false;
        while(!exit) {
            int choice = writeLenderMenu();
            switch (choice) {
                case 0:
                    System.out.println("Tak for i dag.");
                    exit = true;
                    break;
                case 1: 
                  createNewLender();
                  break;  
                case 2: 
                  printAllLenders();
                  break;
                
                case 3:
                  System.out.println(findLenderName());
                  break;
                
                case 4:
                    updateLenderFunc();
                    break;
                    
                case 5:
                    deleteLenderFunc();
                    break;
                    
                default:
                  System.out.println("Tak for i dag.");
                  exit = true;
                  break;
            }         

        }
    }
    
    private int writeLenderMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Lender menu ***");
        System.out.println(" (1) Add Lender");
        System.out.println(" (2) Read all lenders");
        System.out.println(" (3) Find lender");
        System.out.println(" (4) Update Lender");
        System.out.println(" (5) Delete Lender");
        System.out.println(" (0) Return to Main Menu");
        System.out.print("\n Please select an action: ");
  
        while (!keyboard.hasNextInt()){
          keyboard.nextLine();//need to read the newline          
          System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    private void createNewLender(){
        LenderController lenCon = new LenderController();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Lender not found, please create profile ***");
        System.out.println("Please type the name you wish to assign");
        String name = keyboard.nextLine();
        
        System.out.println("Please type the address you wish to assign");
        String address = keyboard.nextLine();
        
        System.out.println("Please type the postal code you wish to assign");
        String postalCode = keyboard.nextLine();
        
        System.out.println("Please type the city you wish to assign");
        String city = keyboard.nextLine();
        
        System.out.println("Please type the phone number you wish to assign");
        String phone = keyboard.nextLine();
        
        lenCon.addLender(name, address, postalCode, city, phone);
        System.out.println("Lender Profile successfully created.");
    }
    
    private void printAllLenders() {
        LenderController lenCon = new LenderController();
        lenCon.printAllLenders();
    }
    
    private void updateLenderFunc() {
        boolean exit = false;
        
        Lender foundLender = findLenderName();
        
        while(!exit) {
            int choice = updateLenderMenu();
            switch (choice) {
                case 0:
                    System.out.println("Tak for i dag.");
                    exit = true;
                    break;
                
                case 1: 
                    System.out.println("Please type the new name");
                    String newName = input();
                    foundLender.setName(newName);
                    break; 
                    
                case 2: 
                    System.out.println("Please type the new phone");
                    String newPhone = input();
                    foundLender.setPhone(newPhone);
                    break;
                    
                case 3: 
                    System.out.println("Please type the new address");
                    String newAddress = input();
                    foundLender.setAddress(newAddress);
                    break;   
                case 4: 
                    System.out.println("Please type the new postalcode");
                    String newPostalcode = input();
                    foundLender.setPostalCode(newPostalcode);
                    break;
                    
                case 5: 
                    System.out.println("Please type the new city");
                    String newCity = input();
                    foundLender.setCity(newCity);
                    break;
                    
                default:
                    System.out.println("Input Invalid, try again.");
            }         
        }
    }
    
    private int updateLenderMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Update menu ***");
        System.out.println(" (1) Change name");
        System.out.println(" (2) Change phone");
        System.out.println(" (3) Change address");
        System.out.println(" (4) Change postal code");
        System.out.println(" (5) Change city");
        System.out.println(" (0) Return to Main Menu");
        System.out.print("\n Please select an action: ");
  
        while (!keyboard.hasNextInt()){
          keyboard.nextLine();//need to read the newline          
          System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    private String input() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private Lender findLenderName(){
        String name = inputLenderName();
        LenderController lenCon = new LenderController();
        Lender result = lenCon.findLenderByName(name);
        return result;
    }
    
    private String inputLenderName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the name you wish to find");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    public void deleteLenderFunc() {
        LenderController lenCon = new LenderController();
        
        Lender foundLender = findLenderName();
        
        lenCon.removeLender(foundLender);
    }
    
}
