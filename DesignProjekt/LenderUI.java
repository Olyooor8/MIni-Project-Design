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
        writeLenderMenu();
    }
    
    private int writeLenderMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Lender menu ***");
        System.out.println(" (1) Add Lender");
        System.out.println(" (2) Read Lender");
        System.out.println(" (3) Update Lender");
        System.out.println(" (4) Delete Lender");
        System.out.println(" (0) Return to Main Menu");
        System.out.print("\n Please select an action: ");
  
        while (!keyboard.hasNextInt()){
          keyboard.nextLine();//need to read the newline          
          System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    private Lender createNewLender(){
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
    }
}
