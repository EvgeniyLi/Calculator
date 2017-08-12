package com.commands;
import com.constants.Constants;
import com.interfaces.CommandImpl;

public class CommandAddition   implements CommandImpl {
    public void execute(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
        System.out.println(Constants.OPERATION_ADDITION);
        double sum=firstNumber+secondNumber+thirdNumber+fourthNumber;
        System.out.println("--------------Your result is: "+sum);
    }

}
