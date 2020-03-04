package blake.acp;
/*******************************************************************
 *  ApplicationController class
 *  Description: Controller for the various handler views
 *  I used ideas and layout from "Doing More With Java"
 *******************************************************************/

// Imported Libraries
import java.util.HashMap;

public class ApplicationController {
    // Hashmap object
    private HashMap<String,Handler> handlerMap = new HashMap();
    // Hashmap handle view request
    public void handleRequest(String command, HashMap<String, Object> data){
        Handler commandHandler =handlerMap.get(command);
        if (commandHandler!=null){
            commandHandler.viewHandler(data);
        }
    }
    // Hashmap selection mapper
    public void mapSelection(String mySelection, Handler myHandler){
        handlerMap.put(mySelection, myHandler);
    }

}
