package blake.acp;
/*******************************************************************
 *  AdditionHandler class
 *  Description: This version of the Handler class adds two
 *  user integers together and displays them to the screen
 *  I used ideas and layout from "Doing More With Java"
 *******************************************************************/

// Imported Libraries
import java.util.HashMap;
import java.util.Scanner;

public class AdditionHandler implements Handler{

    @Override
    public void viewHandler(HashMap<String, Object> data){
        try{
            System.out.println("\nYou selected 'a'.\n\nThis option calculates the sum of two numbers.");
            // Ask for user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter the first number: ");
            Integer firstInt = scanner.nextInt();
            System.out.print("\nEnter the second number: ");
            Integer secondInt = scanner.nextInt();
            scanner.close();
            Integer sumResult = firstInt + secondInt;
            // Display results
            System.out.println("\nThe sum is: " + sumResult);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
