package com.epam.javalearning.gitpractice.mastercard;

import com.epam.javalearning.gitpractice.AbstractCardNumberGenerator;

public class MastercardElectronicNumberGenerator
        extends AbstractCardNumberGenerator {

    private static final String PREFIX = "2222";

    public MastercardElectronicNumberGenerator() {
    }

    @Override
    public String getNextCardNumber() {

        String cardNumber = PREFIX + getRandomNumber();
        return cardNumber + getCardNumberSuffix(cardNumber);

    }

}
