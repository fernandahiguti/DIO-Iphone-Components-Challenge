import utils.ActionFunction;
import utils.MusicPlayerActions;
import utils.MobilePhoneActions;
import utils.WebBrowserActions;

public class Iphone {
    public static void main(String[] args) {
        //you can change selected action here
        ActionFunction selectedAction = WebBrowserActions.openBrowserAction(); 
        
        selectedAction.performAction();

    }
}
