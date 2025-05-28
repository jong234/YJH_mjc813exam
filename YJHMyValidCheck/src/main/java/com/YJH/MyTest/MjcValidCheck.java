package com.YJH.MyTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MjcValidCheck {

    public boolean isValidPhoneNumber(String text) {
        if (text == null){
            return false;
        }
        String regex = "\\d{3}-\\d{4}-\\d{4}";
        return text.matches(regex);
    }

    public boolean isValidZipNumber(String text) {

        if (text == null){
            return false;
        }
        String regex = "\\d{5}";
        return text.matches(regex);
    }

    public boolean isValidEmail(String text) {
        if (text == null){
            return false;
        }
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$";
        return text.matches(regex);
    }
}
