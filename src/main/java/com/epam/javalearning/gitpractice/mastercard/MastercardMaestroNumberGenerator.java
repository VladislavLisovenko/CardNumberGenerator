package com.epam.javalearning.gitpractice.mastercard;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class MastercardMaestroNumberGenerator
        extends AbstractCardNumberGenerator {

    private static final String PREFIX = "2223";

    public MastercardMaestroNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
