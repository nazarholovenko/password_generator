package org.example;
import java.util.Random;
import java.util.Scanner;

public class GeneratingAlgorithm {
    private String password;
    private int passwordLength;
    private final int minimumLength = 3;
    private final int maximumLength = 15;
    private Random randomArrayIndex = new Random();
    private StringBuilder stringBuilder = new StringBuilder();
    private static final String INPUT_MESSAGE = "Set length to your password: ";
    private static final String WARNING_MESSAGE = "Password length should be in range from 3 to 15!";
    private static final String RESULT_MESSAGE = "New password is: ";



    private void userInputPasswordLength() throws InputException {
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
    private String generatePassword() {
        char temporary;
        String newPassword = "";
        for (int i = 0; i < passwordLength; i++) {
            temporary = LiteralsSource.ENGLISH_LOWERCASE_ALPHABET[randomArrayIndex.nextInt(LiteralsSource.similarLength)];
            newPassword = stringBuilder.append(temporary).toString();
        }
        return this.password = newPassword;
    }
    private void displayResult() {
        System.out.println(RESULT_MESSAGE + this.password);

    }
    public void run() throws InputException {
        userInputPasswordLength();
        generatePassword();
        displayResult();
    }
}
