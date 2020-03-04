package blake.acp;
/*******************************************************************
 *  MultiplicationHandler class
 *  Description: This version of the Handler class multiplies two
 *  user integers together and displays them to the screen
 *  I used ideas and layout from "Doing More With Java"
 *******************************************************************/

// Imported Libraries
import java.util.HashMap;
import java.util.Scanner;

public class MultiplicationHandler implements Handler{

    @Override
    public void viewHandler(HashMap<String, Object> data){
        try{
            System.out.println("\nYou selected 'c'.\n\nThis option calculates the product of two numbers.");
            // Ask for user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter the first number: ");
            Integer firstInt = scanner.nextInt();
            System.out.print("\nEnter the second number: ");
            Integer secondInt = scanner.nextInt();
            scanner.close();
            Integer prodResult = firstInt * secondInt;
            // Display results
            System.out.println("\nThe product is: " + prodResult);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
