package utils;

import apps.webbrowser.WebBrowser;

public class WebBrowserActions {

    public static ActionFunction openBrowserAction() {
        return () -> {
            WebBrowser webBrowser = new WebBrowser();
            webBrowser.openBrowser();
        };
    }

    public static ActionFunction displayPageAction() {
        return () -> {
            WebBrowser webBrowser = new WebBrowser();
            webBrowser.displayPage();
        };
    }

    public static ActionFunction addNewTabAction() {
        return () -> {
            WebBrowser webBrowser = new WebBrowser();
            webBrowser.addNewTab();
        };
    }

    public static ActionFunction refreshPageAction() {
        return () -> {
            WebBrowser webBrowser = new WebBrowser();
            webBrowser.refreshPage();
        };
    }

    public static ActionFunction closePageAction() {
        return () -> {
            WebBrowser webBrowser = new WebBrowser();
            webBrowser.closePage();
        };
    }

    public static ActionFunction closeTabAction() {
        return () -> {
            WebBrowser webBrowser = new WebBrowser();
            webBrowser.closeTab();
        };
    }

    public static ActionFunction closeBrowserAction() {
        return () -> {
            WebBrowser webBrowser = new WebBrowser();
            webBrowser.closeBrowser();
        };
    }
}

