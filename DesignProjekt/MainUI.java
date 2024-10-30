import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class MainUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainUI
{
    private LenderUI lenderUI;
    private LoanUI loanUI;
    private LPUI lpUI;
    
    public MainUI(){
        lenderUI = new LenderUI();
        loanUI = new LoanUI();
        lpUI = new LPUI();
    }
    
    public void mainMenu(){
        boolean exit = false;
        while(!exit) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1: //create course
                  lenderUI.start();
                  break;  
                case 2: //find course
                  //TODO add this when controller and model are implementedCourse course = findCourse();
                  lpUI.start();
                  break;
                //TODO add additional use cases 
                case 3:
                  loanUI.start();
                  break;
                
                default:
                  System.out.println("Tak for i dag.");
                  exit = true;
                  break;
            }         

        }
    }

    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Main Menu ***");
        System.out.println(" (1) Loaner Menu");
        System.out.println(" (2) LP Menu");
        System.out.println(" (3) Loan Menu");
        System.out.println(" (4) Generate Test Data");
        System.out.println(" (0) Exit the System");
        System.out.print("\n Please select a menu: ");
  
        while (!keyboard.hasNextInt()){
          keyboard.nextLine();//need to read the newline          
          System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
}
