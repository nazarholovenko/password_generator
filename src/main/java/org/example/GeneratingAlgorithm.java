package org.example;

import java.util.Scanner;

public class GeneratingAlgorithm {
    private int passwordLength;
    private final int minimumLength = 3;
    private final int maximumLength = 15;
    private static final String INPUT_MESSAGE = "Set length to your password: ";
    private static final String WARNING_MESSAGE = "Password length should be in range from 3 to 15!";
    public void userInputPasswordLength() throws InputException {
        Scanner userInput = new Scanner(System.in);
        System.out.println(INPUT_MESSAGE);
        int passwordLength = userInput.nextInt();
        if (passwordLength < maximumLength && passwordLength > minimumLength) {
            this.passwordLength = passwordLength;
        }
        else {
            throw new InputException(WARNING_MESSAGE);
        }
    }
}
