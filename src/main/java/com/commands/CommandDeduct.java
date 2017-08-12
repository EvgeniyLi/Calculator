package com.commands;
import com.constants.Constants;
import com.interfaces.CommandImpl;

public class CommandDeduct implements CommandImpl {
    public void execute(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
        System.out.println(Constants.OPERATION_DEDUCT);
        double deduct=firstNumber-secondNumber-thirdNumber-fourthNumber;
        System.out.println("--------------Your result is: "+deduct);
    }
}
