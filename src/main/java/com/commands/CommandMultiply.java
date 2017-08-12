package com.commands;

import com.interfaces.CommandImpl;
import static com.constants.Constants.*;

public class CommandMultiply implements CommandImpl {
    public void execute(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
        System.out.println(OPERATION_MULTIPLY);
        double deduct = firstNumber *secondNumber *thirdNumber *fourthNumber;
        System.out.println("--------------Your result is: " + deduct);
    }
}
