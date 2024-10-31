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
    
    private LoanContainer loanContainer;
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void start(){
        loanContainer = LoanContainer.getUniqueInstance();
        loanMenuFunc();
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
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
                    
                case 2:
                    removeLoanFunc();
                    break;

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
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void createLoanFunc(){
        boolean exit = false;
        while(!exit) {
            int choice = createLoanMenu();
            switch (choice) {
                case 0:
                    System.out.println("Tak for i dag.");
                    exit = true;
                    break;
                
                case 1: //create course
                    Loan newLoan1 = createNewLoan();
                    Lender l1 = findLenderName();
                    newLoan1.setLender(l1);
                    if(l1 == null){
                        System.out.println("Lender not found.");
                    } else{
                        Copy c1 = findCopySerial();
                        newLoan1.setCopy(c1);
                        loanContainer.addLoan(newLoan1);
                    }
                    break; 
                    
                case 2: //find course
                    //TODO add this when controller and model are implementedCourse course = findCourse();
                    Loan newLoan2 = createNewLoan();
                    Lender l2 = findLenderNumber();
                    newLoan2.setLender(l2);
                    if(l2 == null){
                        System.out.println("Lender not found.");
                    } else{
                        Copy c2 = findCopySerial();
                        newLoan2.setCopy(c2);
                        loanContainer.addLoan(newLoan2);
                    }
                    break;
                    //TODO add additional use cases 

                default:
                    System.out.println("Input Invalid, try again.");
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
    
    ////////////////////////////////////////////////////////////////////////////////
    
    private String inputLoanName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Assign a Lender ***");
        System.out.println("*** Search By Name ***");
        System.out.println("Please type the name you wish to assign");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private Loan createNewLoan(){
        String loanNumber = inputLoanIdentifier();
        int loanDuration = inputLoanDuration();
        Loan newLoan = new Loan(loanDuration, loanNumber);
        return newLoan;
    }
    
    private int inputLoanDuration() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Create a Loan ***");
        System.out.println("*** Assign a Duration (Days) ***");
        System.out.println("Please type the length of loan in days.");
        while (!keyboard.hasNextInt()){
            keyboard.nextLine();//need to read the newline          
            System.out.println("Type a number, try again");
        }
        int choice = keyboard.nextInt();
        return choice;
    }
    
    private String inputLoanIdentifier() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Create a Loan ***");
        System.out.println("*** Assign an Identifier ***");
        System.out.println("Please type the number you wish to assign");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private Lender findLenderName(){
        String name = inputLoanName();
        LenderController lenCon = new LenderController();
        Lender result = lenCon.findLenderByName(name);
        return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private String inputLoanNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Assign a Lender ***");
        System.out.println("*** Search By Number ***");
        System.out.println("Please type the phone number to specify lender");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private Lender findLenderNumber(){
        String number = inputLoanNumber();
        LenderController lenCon = new LenderController();
        Lender result = lenCon.findLenderByNumber(number);
        return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private String inputLoanSerialNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Assign a Copy ***");
        System.out.println("*** Find by Serial Number ***");
        System.out.println("Please type the serial number you wish to assign");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private Copy findCopySerial(){
        String serialNumber = inputLoanSerialNumber();
        CopyController coCon = new CopyController();
        Copy result = coCon.findCopyBySerial(serialNumber);
        return result;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private String inputSelectLoan() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Please Select Loan to Remove ***");
        System.out.println("*** Loans -- Loan Numbers -- Loan Start -- Loan End ***");
        loanContainer.displayLoans();
        System.out.println("Please type the loan number you wish to select (Exit to leave)");
        String choice = keyboard.nextLine();
        return choice;
    }
    
    private void removeLoanFunc(){
        boolean exit = false;
        while(!exit){
            String chosenLoanNumber = inputSelectLoan();
            if(chosenLoanNumber.equals("Exit") || chosenLoanNumber.equals("exit")){
                exit = true;
                break;
            }
            Loan foundLoan = null;
            foundLoan = loanContainer.findLoanNumber(chosenLoanNumber);
            if(foundLoan == null){
                System.out.println("No loan found with written number.");
            } else{
                System.out.println("Loan found and deleted.");
                loanContainer.removeLoan(foundLoan);
            }
        }
    }
}