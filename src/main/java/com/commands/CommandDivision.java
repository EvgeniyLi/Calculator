package com.commands;

import com.interfaces.CommandImpl;
import static com.constants.Constants.OPERATION_DIVISION;

public class CommandDivision implements CommandImpl {
    public void execute(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
        System.out.println(OPERATION_DIVISION);
        double deduct = (firstNumber / secondNumber)/(thirdNumber/fourthNumber);
        System.out.println("--------------Your result is: " + deduct);
    }
}
