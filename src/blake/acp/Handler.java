package blake.acp;
/*******************************************************************
 *  Handler class
 *  Description: This is the main Handler class that each of the
 *  handler subclasses inherit from
 *  I used ideas and layout from "Doing More With Java"
 *******************************************************************/

// Imported Libraries
import java.util.HashMap;

public interface Handler {
    public void viewHandler(HashMap<String, Object> data);
}
