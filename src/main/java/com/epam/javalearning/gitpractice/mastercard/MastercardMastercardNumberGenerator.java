package com.epam.javalearning.gitpractice.mastercard;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class MastercardMastercardNumberGenerator
        extends AbstractCardNumberGenerator {

    private static final String PREFIX = "2221";

    public MastercardMastercardNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
