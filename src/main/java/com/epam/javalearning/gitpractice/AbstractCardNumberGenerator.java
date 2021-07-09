package com.epam.javalearning.gitpractice;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractCardNumberGenerator {

    public static final long CARD_NUMBER_LIMIT = 99_999_999_999L;
    private static final int EVEN_NUMBERS_MULTIPLIER = 2;
    private static final int MAXIMUM_DECIMAL_DIGIT = 9;
    private static final int BASIS_OF_DECIMAL_SYSTEM = 10;

    public int getCardNumberSuffix(String cardNumber) {

        var sum = 0;

        for (var i = 0; i < cardNumber.length(); i++) {

            int digit = Character.getNumericValue(cardNumber.charAt(i));

            if ((i & 1) == 0) {
                /* if number is even */
                int doubledDigit = digit * EVEN_NUMBERS_MULTIPLIER;
                if (doubledDigit > MAXIMUM_DECIMAL_DIGIT) {
                    digit = doubledDigit - MAXIMUM_DECIMAL_DIGIT;
                } else {
                    digit = doubledDigit;
                }
            }

            sum += digit;

        }

        int suffix;
        if (sum % BASIS_OF_DECIMAL_SYSTEM == 0) {
            suffix = 0;
        } else {
            suffix = BASIS_OF_DECIMAL_SYSTEM - (sum % BASIS_OF_DECIMAL_SYSTEM);
        }

        return suffix;

    }

    public abstract String getNextCardNumber() throws WrongCardTypeException;

    public String getRandomNumber() {
        return String.format("%011d",
                ThreadLocalRandom.current()
                        .nextLong(
                                AbstractCardNumberGenerator.CARD_NUMBER_LIMIT));
    }

}
