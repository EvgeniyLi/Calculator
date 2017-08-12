package com.service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCalculator {
    private Pattern patternCommands=Pattern.compile("[+]||[-]||[*]||[/]");

    public Boolean checkInputCommand(String input){
        Matcher matcher=patternCommands.matcher(input);
        return matcher.matches();
    }
}
