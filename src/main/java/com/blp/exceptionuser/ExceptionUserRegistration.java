package com.blp.exceptionuser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionUserRegistration
{
    public String regex;

    public boolean firstName(String firstName)
    {
        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
