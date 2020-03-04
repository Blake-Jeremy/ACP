package blake.acp;
/*******************************************************************
 *  main class
 *  Description: This asks for user selections selections
 *  and is the runnable portion of the program
 *  I used ideas and layout from "Doing More With Java"
 *******************************************************************/

// Imported Libraries
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMain Menu:");
        System.out.println("Enter 'a' for the Addition Calculator");
        System.out.println("Enter 'b' for the Subtraction Calculator");
        System.out.println("Enter 'c' for the Multiplication Calculator");
        System.out.println("Any other key will end the program");
        System.out.print("\nPlease make a selection: ");
        String selection = scanner.next();

        ApplicationController myController = new ApplicationController();
        myController.mapSelection("a", new AdditionHandler());
        myController.mapSelection("b", new SubtractionHandler());
        myController.mapSelection("c", new MultiplicationHandler());

        HashMap selectionMap = new HashMap();
        myController.handleRequest(selection, selectionMap);

        scanner.close();

    }
}
