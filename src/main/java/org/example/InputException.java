package org.example;

public class InputException extends java.lang.Exception {
    String exceptionMessage;

    public InputException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
        System.out.println(exceptionMessage);
    }
}
