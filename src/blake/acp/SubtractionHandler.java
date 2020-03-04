package blake.acp;
/*******************************************************************
 *  SubtractionHandler class
 *  Description: This version of the Handler class subtracts two
 *  user integers together and displays them to the screen
 *  I used ideas and layout from "Doing More With Java"
 *******************************************************************/

// Imported Libraries
import java.util.HashMap;
import java.util.Scanner;

public class SubtractionHandler implements Handler{

    @Override
    public void viewHandler(HashMap<String, Object> data){
        try{
            System.out.println("\nYou selected 'b'.\n\nThis option calculates the difference of two numbers.");
            // Ask for user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter the first number: ");
            Integer firstInt = scanner.nextInt();
            System.out.print("\nEnter the second number: ");
            Integer secondInt = scanner.nextInt();
            scanner.close();
            Integer diffResult = firstInt - secondInt;
            // Display results
            System.out.println("\nThe difference is: " + diffResult);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
