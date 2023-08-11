package apps.webbrowser;

import interfaces.WebBrowserInterface;

public class WebBrowser implements WebBrowserInterface {


    public void checkInternetSignal() {
        System.out.println("Checking internet signal...");
    }


    public void openBrowser() {
        checkInternetSignal();
        System.out.println("Opening browser...");
    }


    public void displayPage() {
        checkInternetSignal();
        System.out.println("Displaying page...");
    }

  
    public void addNewTab() {
        System.out.println("Adding new tab...");
    }

    
    public void refreshPage() {
        checkInternetSignal();
        System.out.println("Refreshing page...");
    }


    public void closePage() {
        System.out.println("Closing page...");
    }


    public void closeTab() {
        System.out.println("Closing tab...");
    }


    public void closeBrowser() {
        System.out.println("Closing browser...");
    }

}
