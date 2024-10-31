import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class LPUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPUI
{
    
    public void start(){
        writeLPMenu();
    }
    
    private int writeLPMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Lender menu ***");
        System.out.println(" (1) Add LP");
        System.out.println(" (2) Read LP");
        System.out.println(" (3) Update LP");
        System.out.println(" (4) Delete LP");
        System.out.println(" (0) Return to Main Menu");
        System.out.print("\n Please select an action: ");
  
        while (!keyboard.hasNextInt()){
          keyboard.nextLine();//need to read the newline          
          System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
}
