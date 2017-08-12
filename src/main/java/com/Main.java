package com;

import com.constants.Constants;
import com.commandscontainer.CommandContainer;
import com.interfaces.CommandImpl;
import com.service.RegexCalculator;

import java.util.Scanner;
public class Main {

    private static Scanner in = new Scanner(System.in);
    private static RegexCalculator regexCalculator = new RegexCalculator();
    private static Scanner scNumbers = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println(Constants.ENTER_THE_FIRST_NUMBER);
            double firstNumber = scNumbers.nextDouble();
            System.out.println(Constants.ENTER_THE_SECOND_NUMBER);
            double secondNumber = scNumbers.nextDouble();
            System.out.println(Constants.ENTER_THE_THIRD_NUMBER);
            double thirdNumber = scNumbers.nextDouble();
            System.out.println(Constants.ENTER_THE_FOURTH_NUMBER);
            double fourthNumber = scNumbers.nextDouble();

            CommandContainer commandContainer = new CommandContainer();

            System.out.println(Constants.HOW_TO_EXIT_FROM_PROGRAM + "\n" + Constants.HOW_ADDITION_NUMBERS + "\n" + Constants.HOW_DEDUCT_NUMBERS + "\n" +
                    Constants.HOW_MULTIPLY_NUMBERS + "\n" + Constants.HOW_DIVISION_NUMBERS);

            String choseCommand = in.nextLine();
            if (regexCalculator.checkInputCommand(choseCommand)) {
                CommandImpl command = (CommandImpl) commandContainer.getCommand(choseCommand);
                command.execute(firstNumber, secondNumber, thirdNumber, fourthNumber);
            } else {
                System.out.println(Constants.INVALID_INPUT);
            }
        }
    }
}
