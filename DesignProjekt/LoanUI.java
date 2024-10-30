import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Write a description of class LoanUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanUI
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void start(){
        loanMenuFunc();
    }

    public void loanMenuFunc(){
        boolean exit = false;
        while(!exit) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 0:
                    System.out.println("Tak for i dag.");
                    exit = true;
                    break;
                    
                case 1:
                    createLoanFunc();
                    break; 
                    
                // case 2:
                    // //TODO add this when controller and model are implementedCourse course = findCourse();
                    // removeLoanMenu();
                    // break;
                    // //TODO add additional use cases 

                default:
                    System.out.println("Input Invalid, try again.");
            }         
        }
    }

    private int writeLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Loan Menu ***");
        System.out.println(" (1) Create Loan");
        System.out.println(" (2) Delete Loan");
        System.out.println(" (0) Exit the System");
        System.out.print("\n Please select a menu: ");

        while (!keyboard.hasNextInt()){
            keyboard.nextLine();//need to read the newline          
            System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }

    public void createLoanFunc(){
        boolean exit = false;
        while(!exit) {
            int choice = createLoanMenu();
            switch (choice) {
                case 1: //create course
                    Lender l = findLenderName();
                    if(l == null){
                        System.out.println("Lender not found.");
                    } else{
                        findCopy();
                    }
                    break; 
                    
                // case 2: //find course
                    // //TODO add this when controller and model are implementedCourse course = findCourse();
                    // Lender l = findLenderNumber();
                    // if(l == null){
                        // System.out.println("Lender not found.");
                    // } else{
                        // findCopy();
                    // }
                    // break;
                    // //TODO add additional use cases 

                default:
                    System.out.println("Tak for i dag.");
                    exit = true;
                    break;
            }         
        }
    }

    private int createLoanMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Assign a Lender ***");
        System.out.println("*** Define Search Method ***");
        System.out.println(" (1) Search By Name");
        System.out.println(" (2) Search By Number");
        System.out.println(" (0) Return to Main Menu");
        System.out.print("\n Please select an action: ");

        while (!keyboard.hasNextInt()){
            keyboard.nextLine();//need to read the newline          
            System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }

    private String inputLoanName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Assign a Lender ***");
        System.out.println("*** Search By Name ***");
        System.out.println("Please type the name you wish to assign");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private Lender findLenderName(){
        String name = inputLoanName();
        LenderController lenCon = new LenderController();
        Lender result = lenCon.findLenderByName(name);
        return result;
    }
    
    private String inputLoanSerialNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Assign a Copy ***");
        System.out.println("*** Find by Serial Number ***");
        System.out.println("Please type the serial number you wish to assign");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private Copy findCopy(){
        String serialNumber = inputLoanSerialNumber();
        CopyController coCon = new CopyController();
        Copy result = coCon.findCopyBySerial(serialNumber);
        return result;
    }
}