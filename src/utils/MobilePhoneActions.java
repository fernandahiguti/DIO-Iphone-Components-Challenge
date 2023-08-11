package utils;

import apps.mobilephone.MobilePhone;

public class MobilePhoneActions {

    public static ActionFunction callAction() {
        return () -> {
            MobilePhone mobilePhone = new MobilePhone();
            mobilePhone.call();
        };
    }

    public static ActionFunction answerAction() {
        return () -> {
            MobilePhone mobilePhone = new MobilePhone();
            mobilePhone.answer();
        };
    }

    public static ActionFunction endCallAction() {
        return () -> {
            MobilePhone mobilePhone = new MobilePhone();
            mobilePhone.endCall();
        };
    }

    public static ActionFunction startVoiceMailAction() {
        return () -> {
            MobilePhone mobilePhone = new MobilePhone();
            mobilePhone.startVoiceMail();
        };
    }
}
