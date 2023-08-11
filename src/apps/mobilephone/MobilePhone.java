package apps.mobilephone;

import interfaces.MobilePhoneInterface;

public class MobilePhone implements MobilePhoneInterface {

    @Override
    public void call() {
        checkSignal();
        checkBalance(); 
        System.out.println("Calling...");
    }

    @Override
    public void answer() {
        checkSignal();
        System.out.println("Answering call");
    }

    @Override
    public void endCall() {
        System.out.println("Call ended");
    }

    @Override
    public void checkSignal() {
        System.out.println("Checking signal strength");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking account balance");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voicemail");
    }
}
