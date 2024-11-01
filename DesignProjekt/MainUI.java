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
                case 1:
                  lenderUI.start();
                  break;  
                  
                case 2:
                  lpUI.start();
                  break;
                  
                case 3:
                  loanUI.start();
                  break;
                
                case 4:
                  createTestData();
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
    
    private void createTestData(){
        LenderController lenderCo = new LenderController();
        CopyController copyCont = new CopyController();
        lenderCo.addLender("Bo", "Sofien", "9000", "Randers", "03203290");
        copyCont.addLP("1", "High", "Hest", "2024");
        copyCont.addCopyToLP("1", "4356789", "good", 100, "20/10");
        
        lenderCo.addLender("Oliver", "Torn", "9200", "Aal", "12345678");
        copyCont.addLP("2", "Level", "Jack", "2000");
        copyCont.addCopyToLP("2", "r6t7689", "bad", 200, "21/9");
        copyCont.addCopyToLP("2", "r6ft7g8y", "good", 350, "7/9");
        
        lenderCo.addLender("Jesper", "Dalvej", "8000", "Aal", "56756722");
        copyCont.addLP("3", "Løven", "Lasse", "2002");
        copyCont.addCopyToLP("3", "9yih", "nice", 300, "18/1");
        
        lenderCo.addLender("Jens", "Vejenvej", "8500", "Aarhus", "57687911");
        copyCont.addLP("4", "Woaw", "Magnus", "1600");
        copyCont.addCopyToLP("4", "crfttyvg", "bad", 5000, "21/10");
        
    }
    
    
}
